package com.example.p3

import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et1=findViewById<EditText>(R.id.txtNumero1)
        val et2=findViewById<EditText>(R.id.txtNumero2)
        var tv1=findViewById<TextView>(R.id.TxtVResult)
        val RGBtn=findViewById<RadioGroup>(R.id.radioGroup)
        val rbtn1=findViewById<RadioButton>(R.id.rbtnSumar)
        val rbtn2=findViewById<RadioButton>(R.id.rbtnRestar)
        val rbtn3=findViewById<RadioButton>(R.id.rbtnMulti)
        val rbtn4=findViewById<RadioButton>(R.id.rbtnDiv)

        et1.setInputType(InputType.TYPE_CLASS_NUMBER);
        et2.setInputType(InputType.TYPE_CLASS_NUMBER);
        val button=findViewById<Button  >(R.id.BtnOperacion)

        button.setOnClickListener(View.OnClickListener {
            if(rbtn1.isChecked())
            tv1.setText("El resultado es "+ (et1.text.toString().toInt() + et2.text.toString().toInt()))
            if(rbtn2.isChecked())
                tv1.setText("El resultado es "+ (et1.text.toString().toInt() - et2.text.toString().toInt()))
            if(rbtn3.isChecked())
                tv1.setText("El resultado es "+ (et1.text.toString().toInt() * et2.text.toString().toInt()))
            if(rbtn4.isChecked())
                tv1.setText("El resultado es "+ (et1.text.toString().toInt() / et2.text.toString().toInt()))

        })
    }






    }
