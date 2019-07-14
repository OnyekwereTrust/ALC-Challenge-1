package com.tjah.sampleapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sample_main.*

class SampleMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_main)


        about_alc_btn.setOnClickListener{
            val intent = Intent(this, ALCActivity::class.java)
            startActivity(intent)
        }

        about_me_btn.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

    }
}
