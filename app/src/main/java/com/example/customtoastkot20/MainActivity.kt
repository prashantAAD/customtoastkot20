package com.example.customtoastkot20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn= findViewById<Button>(R.id.bt)
        val layoutInflater:LayoutInflater=layoutInflater
        val viewLay=layoutInflater.inflate(R.layout.custom_toast,findViewById(R.id.custom_layout))
        btn.setOnClickListener {
            val custom_toast=Toast.makeText(this@MainActivity,"Toast:Gravity.Top",Toast.LENGTH_SHORT)
            custom_toast.setGravity(Gravity.CENTER,0,0)
            custom_toast.view=viewLay
            custom_toast.show()
        }
    }
}