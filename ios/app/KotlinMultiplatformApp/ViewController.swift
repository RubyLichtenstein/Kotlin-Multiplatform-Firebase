//
//  ViewController.swift
//  KotlinMultiplatformApp
//
//  Created by Oron Ben Zvi on 11/9/18.
//  Copyright © 2018 Oron Ben Zvi. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    
    @IBOutlet weak var tableView: UITableView!
    
    var postRepo: PostRepository!
    var listener: Listener!
    var posts: [Post] = []

    override func viewDidLoad() {
        super.viewDidLoad()
        
        postRepo = PostRepository()
        
        listener = postRepo.listen { [weak self] posts in
            self?.posts = posts
            self?.tableView.reloadData()
        }
    }
    
    @IBAction func addDidTap(_ sender: Any) {
        let alert = UIAlertController(title: "Create Post", message: nil, preferredStyle: .alert)
        alert.addAction(UIAlertAction(title: "Cancel", style: .cancel, handler: nil))
        
        alert.addTextField { textField in
            textField.placeholder = "Post content..."
        }
        
        alert.addAction(UIAlertAction(title: "Create", style: .default, handler: { [weak self] action in
            if let content = alert.textFields?.first?.text, !content.isEmpty {
                let newPost = Post(id: UUID().uuidString, content: content)
                self?.postRepo.create(newPost)
            }
        }))
        
        present(alert, animated: true)
    }
    
    deinit {
        listener.remove()
    }
}

extension ViewController: UITableViewDataSource {
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return posts.count
    }
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let cell = tableView.dequeueReusableCell(withIdentifier: "PostCell", for: indexPath)
        
        let post = posts[indexPath.row]
        
        cell.textLabel?.text = post.content
        
        return cell
    }
}

