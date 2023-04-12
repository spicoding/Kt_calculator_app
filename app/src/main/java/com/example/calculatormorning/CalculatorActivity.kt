package com.example.calculatormorning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var tv_answer:TextView
    lateinit var edt_firstnumber:EditText
    lateinit var edt_secondnumber:EditText
    lateinit var btn_addition:Button
    lateinit var btn_subtraction:Button
    lateinit var btn_multiplication:Button
    lateinit var btn_division:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        tv_answer=findViewById(R.id.txt_View_Ans)
        edt_firstnumber=findViewById(R.id.edtTxtNo1)
        edt_secondnumber=findViewById(R.id.edtTxtNo2)
        btn_addition=findViewById(R.id.btnAdd)
        btn_subtraction=findViewById(R.id.btnSub)
        btn_multiplication=findViewById(R.id.btnProduct)
        btn_division=findViewById(R.id.btnDiv)

        btn_addition.setOnClickListener {
            var myfirstnumber=edt_firstnumber.text.toString()
            var mysecondnumber=edt_secondnumber.text.toString()

            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()){
                tv_answer.text="Please fill in all the inputs with a number"
            }else{
                // let's calculate
                var answer=myfirstnumber.toDouble()+mysecondnumber.toDouble()
                tv_answer.text=answer.toString()
            }
        }

        btn_subtraction.setOnClickListener {
            var myfirstnumber=edt_firstnumber.text.toString()
            var mysecondnumber=edt_secondnumber.text.toString()

            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()){
                tv_answer.text="Please fill in all the inputs with a number"
            }else{
                // let's calculate
                var answer=myfirstnumber.toDouble()-mysecondnumber.toDouble()
                tv_answer.text=answer.toString()
            }
        }

        btn_multiplication.setOnClickListener {
            var myfirstnumber=edt_firstnumber.text.toString()
            var mysecondnumber=edt_secondnumber.text.toString()

            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()){
                tv_answer.text="Please fill in all the inputs with a number"
            }else{
                // let's calculate
                var answer=myfirstnumber.toDouble()*mysecondnumber.toDouble()
                tv_answer.text=answer.toString()
            }
        }

        btn_division.setOnClickListener {
            var myfirstnumber=edt_firstnumber.text.toString()
            var mysecondnumber=edt_secondnumber.text.toString()

            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()){
                tv_answer.text="Please fill in all the inputs with a number"
            }else{
                // let's calculate
                var answer=myfirstnumber.toDouble()/mysecondnumber.toDouble()
                tv_answer.text=answer.toString()
            }
        }

    }
}