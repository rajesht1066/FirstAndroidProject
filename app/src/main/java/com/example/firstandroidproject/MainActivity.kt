package com.example.firstandroidproject

//import android.app.AlertDialog
//import android.graphics.Color
//import android.graphics.PorterDuff
//import android.graphics.drawable.LayerDrawable
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.WebView
//import android.webkit.WebViewClient
import android.widget.Button
//import android.widget.DatePicker
import android.widget.EditText
//import android.widget.ProgressBar
//import android.widget.Toast
//import android.view.View
//import android.widget.Button
//import android.view.View
//import android.widget.Button
//import android.widget.RatingBar
//import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var webView:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.frame_main)
        Log.i("checks Activity1","onCreate")


//        val btn: Button = findViewById(R.id.my_button)
//        btn.text = "Click Me!"
//        btn.setBackgroundColor(Color.parseColor("#4CAF50"))
//
//        val spinner:Spinner = findViewById(R.id.spinner)
//        ArrayAdapter.createFromResource(
//            this,
//            R.array.planets_Array,
//            android.R.layout.simple_spinner_item
//        ).also { adapter ->
//            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//            spinner.adapter = adapter
//        }


//        findViewById<Button>(R.id.button_id1)
//            .setOnClickListener {
//                val intent = Intent(this,SecondActivity::class.java)
//                startActivity(intent)
//            }

//        val img: ImageView = findViewById(R.id.img_view_id1)
//        val imageUrl = "https://fastly.picsum.photos/id/237/200/300.jpg?hmac=TmmQSbShHz9CdQm0NkEjx1Dyh_Y984R9LpNrpvH2D_U"
//        Glide.with(this)
//            .load(imageUrl)
//            .placeholder(R.mipmap.ic_launcher)
//            .error(android.R.drawable.ic_menu_camera)
//            .circleCrop()
//            .into(img)



//        val btn:Button = findViewById<Button>(R.id.btn_id1)
//        btn.setOnClickListener{
//            val builder = AlertDialog.Builder(this)
//            //set title for alert dialog
//            builder.setTitle("My Alert Box")
//            //set message for alert dialog
//            builder.setMessage("This is the alert msg")
//            builder.setIcon(android.R.drawable.ic_dialog_alert)
//
//            //performing positive action
//            builder.setPositiveButton("Yes"){dialogInterface, which ->
//                Toast.makeText(applicationContext,"clicked yes",Toast.LENGTH_LONG).show()
//            }
//            //performing cancel action
//            builder.setNeutralButton("Cancel"){dialogInterface , which ->
//                Toast.makeText(applicationContext,"clicked cancel\n operation cancel",Toast.LENGTH_LONG).show()
//            }
//            //performing negative action
//            builder.setNegativeButton("No"){dialogInterface, which ->
//                Toast.makeText(applicationContext,"clicked No",Toast.LENGTH_LONG).show()
//            }
//            // Create the AlertDialog
//            val alertDialog: AlertDialog = builder.create()
//            // Set other dialog properties
//            alertDialog.setCancelable(false)
//            alertDialog.show()
//        }

//            findViewById<Button>(R.id.btn)
//                .setOnClickListener{
//                    onLogin(it)
//                }

//        findViewById<Button>(R.id.btn)
//            .setOnClickListener{
//                val pgbar = findViewById<ProgressBar>(R.id.pgbar)
//                pgbar.visibility = View.VISIBLE
//            }
//
//        findViewById<Button>(R.id.btn2)
//            .setOnClickListener{
//                val pgbar = findViewById<ProgressBar>(R.id.pgbar2)
//                pgbar.visibility = View.VISIBLE
//            }
//
//        findViewById<Button>(R.id.idBtnPickDate)
//            .setOnClickListener{
//                val pgbar = findViewById<DatePicker>(R.id.dpicker)
//                pgbar.visibility = View.VISIBLE
//            }

//        findViewById<Button>(R.id.btn)
//            .setOnClickListener{
//                webView = findViewById<WebView>(R.id.webview)
//                // WebViewClient allows you to handle
//                // onPageFinished and override Url loading.
//                webView.webViewClient = WebViewClient()
//
//                // this will load the url of the website
//                webView.loadUrl("https://www.goodworklabs.com/")
//
//                // this will enable the javascript settings, it can also allow xss vulnerabilities
//                webView.settings.javaScriptEnabled = true
//
//                // if you want to enable zoom feature
//                webView.settings.setSupportZoom(true)
//            }



//        findViewById<Button>(R.id.button1)
//            .setOnClickListener{
//                var fullname = findViewById<EditText>(R.id.editText1)
//                var sex = findViewById<EditText>(R.id.editText2)
//                var age = findViewById<EditText>(R.id.editText3)
//                val bundle = Bundle()
//                bundle.putString("fullname",fullname.text.toString())
//                bundle.putString("sex",sex.text.toString())
//                bundle.putString("age",age.text.toString())
//                val intent = Intent(this, SecondActivity::class.java)
//                intent.putExtras(bundle)
//                startActivity(intent)
//            }


    }

//    override fun onBackPressed() {
//        // if your webview can go back it will go back
//        if (webView.canGoBack())
//            webView.goBack()
//        // if your webview cannot go back
//        // it will exit the application
//        else
//            super.onBackPressed()
//    }



    private fun onLogin(view: View) {
        MyCustomDialog().show(supportFragmentManager, "MyCustomFragment")
    }

    override fun onStart() {
        super.onStart()
        Log.i("checks Activity1","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("checks Activity1","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("checks Activity1","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("checks Activity1","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("checks Activity1","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("checks Activity1","onDestroy")
    }
}