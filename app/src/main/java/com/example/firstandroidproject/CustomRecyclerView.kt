package com.example.firstandroidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class CustomRecyclerView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        //recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        //recyclerview.layoutManager = GridLayoutManager(this,2)
        //val staggeredGridLayoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        //recyclerview.layoutManager = staggeredGridLayoutManager

        val data = ArrayList<ItemsViewModel>()
        val versions  = arrayOf(R.drawable.alpha,R.drawable.beta,R.drawable.cupcake,R.drawable.donut,R.drawable.eclair,R.drawable.froyo,R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.icecreamsandwich,R.drawable.jellybean,R.drawable.kitkat,R.drawable.lollipop,R.drawable.marshmallow,R.drawable.nougat,R.drawable.oreo,R.drawable.pie)
        val versionNames = arrayOf("alpha","beta","cupcake","donut","eclair","froyo","gingerbread","honeycomb","icecreamsandwich","jellybean","kitkat","lollipop","marshmallow","nougat","oreo","pie")
        val versionNo = arrayOf("1.0","1.1","1.5","1.6","2.0-2.1","2.2-2.2.3","2.3-2.3.7","3.0-3.2.6","4.0-4.0.4","4.1-4.3.1","4.4-4.4.4","5.0-5.1.1","6.0-6.0.1","7.0-7.1.2","8.0-8.1","9")
        for (i in 0..15){
            data.add(ItemsViewModel(versions[i], versionNames[i],versionNo[i]))
        }
        val adapter = CustomAdapter(data,this)
        recyclerview.adapter = adapter
    }
}