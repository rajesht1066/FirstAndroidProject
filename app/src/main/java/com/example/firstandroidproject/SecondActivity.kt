package com.example.firstandroidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SecondActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginpage)
        Log.i("checks Activity2","onCreate")
        findViewById<Button>(R.id.button1)
            .setOnClickListener {
                finish()
            }

        var fullname:String? = ""
        var sex:String? = ""
        var age:String? = ""
        val bundle = intent.extras
        if (bundle != null){
            fullname = bundle.getString("fullname")
            sex = bundle.getString("sex")
            age = bundle.getString("age")
        }

//        findViewById<Button>(R.id.button1)
//            .setOnClickListener{
//                var username = findViewById<EditText>(R.id.editText1)
//                Toast.makeText(applicationContext,username.text.toString(), Toast.LENGTH_LONG).show()
//                val bundle = Bundle()
//                bundle.putString("username",username.text.toString())
//                bundle.putString("fullname",fullname)
//                bundle.putString("sex",sex)
//                bundle.putString("age",age)
//                val intent = Intent(this, ThirdActivity::class.java)
//                intent.putExtras(bundle)
//                startActivity(intent)
//            }
    }
    override fun onStart() {
        super.onStart()
        Log.i("checks Activity2","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("checks Activity2","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("checks Activity2","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("checks Activity2","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("checks Activity2","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("checks Activity2","onDestroy")
    }
}