package com.example.firstandroidproject

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.google.android.material.snackbar.Snackbar

class MyCustomDialog: DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.i("onCreateView","")
        getDialog()!!.getWindow()?.setBackgroundDrawableResource(R.drawable.round_corner);
        return inflater.inflate(R.layout.dialog_main, container, false)
    }

    override fun onStart() {
        Log.i("onStart","")
        super.onStart()
        val width = (resources.displayMetrics.widthPixels * 0.85).toInt()
        val height = (resources.displayMetrics.heightPixels * 0.40).toInt()
        dialog!!.window?.setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT)
        dialog!!.window?.findViewById<Button>(R.id.btn_login)
            ?.setOnClickListener {
//                Snackbar.make(layout, "Logged in Successfully", Snackbar.LENGTH_LONG)
//                    .setAction("Undo", { _ ->
//                        Toast.makeText(context,"You Logged Out Successfully!",Toast.LENGTH_LONG).show()
//                    })
//                    .show()
                dismiss()
            }
    }

}