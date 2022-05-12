package com.fighting.musicstreamingapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fighting.musicstreamingapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, PlayerFragment.newInstance()) // 인자값을 넘길 때 이용 가능
            .commit()
    }
}