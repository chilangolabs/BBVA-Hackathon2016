package com.chilangolabs.capitallab

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.content_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        toolbar.title = ""
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnCafeteria.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
//            val pair1 = Pair(imgCafeteria, "imgdetail")
//            val pair2 = Pair(txtCafeteria, "nameDetail")
            val options: ActivityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this, imgCafeteria, "imgdetail")
            startActivity(intent, options.toBundle())
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.profile_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == R.id.itemAdd) {
            startActivity(Intent(this, PrestamoInfoActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }

}
