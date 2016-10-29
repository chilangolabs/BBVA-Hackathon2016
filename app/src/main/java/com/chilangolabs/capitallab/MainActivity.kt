package com.chilangolabs.capitallab

import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.AnimationUtils
import com.chilangolabs.capitallab.OwnElements.FontManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FontManager(this).setTypeFace(txtIcon, Typeface.createFromAsset(this.assets, "fonts/fontawesome.otf"))
        txtIcon.text = getString(R.string.icon_app)
        txtIcon.animation = AnimationUtils.loadAnimation(this, R.anim.rotate_icon)
    }


}
