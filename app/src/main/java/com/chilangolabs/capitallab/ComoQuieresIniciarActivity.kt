package com.chilangolabs.capitallab

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.chilangolabs.capitallab.OwnElements.FontManager
import kotlinx.android.synthetic.main.activity_como_quieres_iniciar.*

class ComoQuieresIniciarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_como_quieres_iniciar)

        FontManager(this).setTypeFace(txtEmpresa, Typeface.createFromAsset(this.assets, "fonts/fontawesome.otf"))

        btnPersona.setOnClickListener {
            val intent: Intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

    }
}
