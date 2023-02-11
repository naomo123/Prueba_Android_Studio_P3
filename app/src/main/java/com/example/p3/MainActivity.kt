package com.example.p3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et1=findViewById<EditText>(R.id.TxtNumero1)
        val et2=findViewById<EditText>(R.id.TxtNumero2)
        val tv1=findViewById<TextView>(R.id.TxtVResult)
        val button=findViewById<Button>(R.id.BtnOperacion)






    }
}