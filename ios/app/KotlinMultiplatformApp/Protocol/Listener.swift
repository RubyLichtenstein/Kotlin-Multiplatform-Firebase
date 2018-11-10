//
//  Listener.swift
//  KotlinMultiplatformApp
//
//  Created by Oron Ben Zvi on 11/9/18.
//  Copyright © 2018 Oron Ben Zvi. All rights reserved.
//

import Foundation
import FirebaseFirestore

protocol Listener {
    func remove()
}

struct ListenerRegistrationWrapper {
    let listenerRegistration: ListenerRegistration
}

extension ListenerRegistrationWrapper: Listener {
    func remove() {
        listenerRegistration.remove()
    }
}
