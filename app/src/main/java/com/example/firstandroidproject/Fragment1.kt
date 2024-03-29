package com.example.firstandroidproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class Fragment1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_1,container,false)
        val button1 = view.findViewById<Button>(R.id.button)
        button1.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragment1_to_fragment2)
        }
        return view
    }
}