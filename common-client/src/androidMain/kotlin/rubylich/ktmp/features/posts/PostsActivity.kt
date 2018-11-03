package rubylich.ktmp.features.posts

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.testmodule.R

class PostsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_posts)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragmentContainer, PostsView())
            .commit()
    }
}
