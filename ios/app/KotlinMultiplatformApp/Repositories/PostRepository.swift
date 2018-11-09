//
//  PostRepository.swift
//  KotlinMultiplatformApp
//
//  Created by Oron Ben Zvi on 11/9/18.
//  Copyright © 2018 Oron Ben Zvi. All rights reserved.
//

import Foundation
import FirebaseFirestore

class PostRepository {
    let db = Firestore.firestore()
    
    init() {
        let settings = db.settings
        settings.areTimestampsInSnapshotsEnabled = true
        db.settings = settings
    }
    
    func create(_ post: Post) {
        let data = [
            "id": post.id,
            "content": post.content
        ]
        
        db.collection("posts").document(post.id).setData(data)
    }
    
    func listen(listener: @escaping ([Post]) -> Void) -> Listener {
        let listenerRegistration = db.collection("posts").addSnapshotListener { snapshot, error in
            if let error = error {
                print("Error getting documents: \(error)")
                return
            }
            
            guard let documents = snapshot?.documents else { return }

            let posts = documents.compactMap { doc -> Post? in
                let json = doc.data()
                return try? Post.decodeValue(json)
            }
            
            listener(posts)
        }
        
        return ListenerRegistrationWrapper(listenerRegistration: listenerRegistration)
    }
}
