package com.example.exam2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exam2021.fragments.CategoryFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .add(R.id.container, CategoryFragment())
            .commit()
    }
}