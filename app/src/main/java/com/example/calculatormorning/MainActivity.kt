package com.example.calculatormorning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var Buttoncalc:Button
    lateinit var Buttonint:Button
    lateinit var Buttonweb:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Buttoncalc=findViewById(R.id.btnCalc)
        Buttonint=findViewById(R.id.btnInt)
        Buttonweb=findViewById(R.id.btnWeb)
        Buttoncalc.setOnClickListener {
            val intent=Intent(this,CalculatorActivity::class.java)
            startActivity(intent)
        }
         Buttonint.setOnClickListener {
            val intent=Intent(this,IntentActivity::class.java)
            startActivity(intent)
        }
        Buttonweb.setOnClickListener {
            val intent=Intent(this,WebActivity::class.java)
            startActivity(intent)
        }


    }
}