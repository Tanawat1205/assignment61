package com.example.assignment61

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var text1:TextView = findViewById(R.id.text1)
        var text2:TextView = findViewById(R.id.text3)
        var num1:EditText=findViewById(R.id.num1)
        var num2:EditText=findViewById(R.id.num2)

        var plus:Button =findViewById(R.id.plus)
        var mult:Button =findViewById(R.id.multply)
        var minus:Button=findViewById(R.id.minus)
        var vidider:Button=findViewById(R.id.divider)
        var modulo:Button=findViewById(R.id.modulo)
        var clear:Button=findViewById(R.id.clear)
        //บวก
        plus.setOnClickListener() {
            var num1 = num1.text.toString()
            var num2 = num2.text.toString()
            var total = 0.00
            if(num1 == ""  || num2 == ""){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้งnumber1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total = num1.toString().toDouble() + num2.toString().toDouble()
                text1.setText("+")
                text2.setText(total.toString())

            }
        }

        //ลบ
        minus.setOnClickListener(){
            var num1 = num1.text.toString()
            var num2 = num2.text.toString()
            var total = 0.000
            if(num1 == ""  || num2 == ""){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้งnumber1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total = num1.toString().toDouble() - num2.toString().toDouble()
                text1.setText("-")
                text2.setText(total.toString())

            }
        }

        //คูณ
        mult.setOnClickListener(){
            var num1 = num1.text.toString()
            var num2 = num2.text.toString()
            var total = 0.000
            if(num1 == ""  || num2 == ""){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้งnumber1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total = num1.toString().toDouble() * num2.toString().toDouble()
                text1.setText("*")
                text2.setText(total.toString())

            }
        }

        //หาร
        vidider.setOnClickListener(){
            var num1 = num1.text.toString()
            var num2 = num2.text.toString()
            var total = 0.000
            if(num1 == ""  || num2 == ""){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้งnumber1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total = num1.toString().toDouble() / num2.toString().toDouble()
                text1.setText("/")
                text2.setText(total.toString())

            }
        }

        //มอด
        modulo.setOnClickListener(){
            var num1 = num1.text.toString()
            var num2 = num2.text.toString()
            var total = 0.000
            if(num1 == ""  || num2 == ""){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้งnumber1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            }
            else if(num2=="0") {
                val toast1 =
                    Toast.makeText(applicationContext, "ห้ามกรอกค่า number2 = 0", Toast.LENGTH_LONG)
                toast1.show()
            }
            else{
                total = num1.toString().toDouble() % num2.toString().toDouble()
                text1.setText("%")
                text2.setText(total.toString())

            }
        }

        clear.setOnClickListener(){
            num1.setText("")
            num2.setText("")
            text1.setText("")
            text2.setText("")
        }
    }
}