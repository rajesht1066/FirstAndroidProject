package com.example.firstandroidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)

        var username = findViewById<TextView>(R.id.username)
        var fullname = findViewById<TextView>(R.id.fullname)
        var sex = findViewById<TextView>(R.id.sex)
        var age = findViewById<TextView>(R.id.age)
        val bundle = intent.extras
        if (bundle != null){
            username.text = "Hello ${bundle.getString("username")}"
            fullname.text = bundle.getString("fullname")
            sex.text = bundle.getString("sex")
            age.text = bundle.getString("age")
        }
    }
}