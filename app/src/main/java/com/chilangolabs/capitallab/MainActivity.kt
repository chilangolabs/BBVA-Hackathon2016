package com.chilangolabs.capitallab

import android.app.Activity
import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.AnimationUtils
import com.chilangolabs.capitallab.OwnElements.FontManager
import com.stephentuso.welcome.WelcomeHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit private var welcomescreen: WelcomeHelper
    val request_code = 1234

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FontManager(this).setTypeFace(txtIcon, Typeface.createFromAsset(this.assets, "fonts/fontawesome.otf"))
        txtIcon.text = getString(R.string.icon_app)
        txtIcon.animation = AnimationUtils.loadAnimation(this, R.anim.rotate_icon)

        btnMainNext.setOnClickListener {
//            val intent: Intent = Intent(this, WelcomeActivity::class.java)
//            startActivity(intent)
            welcomescreen = WelcomeHelper(this, WelcomeActivity::class.java)
//            welcomescreen.show(savedInstanceState)
            welcomescreen.forceShow(request_code)
        }

    }

//    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
//        super.onSaveInstanceState(outState, outPersistentState)
//        welcomescreen.onSaveInstanceState(outState)
//    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == request_code) {
            if (resultCode == Activity.RESULT_OK) {
//                Toast.makeText(this, "Compleate OK", Toast.LENGTH_SHORT).show()
                val intent: Intent = Intent(this, ComoQuieresIniciarActivity::class.java)
                startActivity(intent)
            } else if (resultCode == Activity.RESULT_CANCELED) {
//                Toast.makeText(this, "Canceled Meh", Toast.LENGTH_SHORT).show()
                val intent: Intent = Intent(this, ComoQuieresIniciarActivity::class.java)
                startActivity(intent)
            }
        }
    }

}
