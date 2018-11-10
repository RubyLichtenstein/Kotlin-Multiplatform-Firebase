//
//  Post.swift
//  KotlinMultiplatformApp
//
//  Created by Oron Ben Zvi on 11/9/18.
//  Copyright © 2018 Oron Ben Zvi. All rights reserved.
//

import Foundation
import Himotoki

struct Post {
    let id: String
    let content: String
}

extension Post: Himotoki.Decodable {
    static func decode(_ e: Extractor) throws -> Post {
        return try Post(
            id: e <| "id",
            content: e <| "content"
        )
    }
}
