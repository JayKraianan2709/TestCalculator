package com.example.testcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testcalculator.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var str: String
        var temp: String
        var op = ""
        var number1:Int
        var isNew = true
        var old = 0

        num1.setOnClickListener {
            temp = "1"
            if (text_v.text.toString().toInt() == 0) {
                text_v.setText(temp)
            }else {
                if (isNew){
                    text_v.setText("")
                }
                isNew = false
                str = text_v.text.toString().plus(temp)
                text_v.setText(str)
            }

        }

        clear.setOnClickListener {
            text_v.setText("0")
        }
        num2.setOnClickListener {
            temp = "2"
            if (text_v.text.toString().toInt() == 0) {
                text_v.setText(temp)
            }else {
                if (isNew){
                    text_v.setText("")
                }
                isNew = false
                str = text_v.text.toString().plus(temp)
                text_v.setText(str)
            }
        }
        num3.setOnClickListener {
            temp = "3"
            if (text_v.text.toString().toInt() == 0) {
                text_v.setText(temp)
            }else {
                if (isNew){
                    text_v.setText("")
                }
                isNew = false
                str = text_v.text.toString().plus(temp)
                text_v.setText(str)
            }
        }
        num0.setOnClickListener {
            temp = "0"
            if (text_v.text.toString().toInt() == 0) {
                text_v.setText(temp)
            }else {
                if (isNew){
                    text_v.setText("")
                }
                isNew = false
                str = text_v.text.toString().plus(temp)
                text_v.setText(str)
            }
        }
        num4.setOnClickListener {
            temp = "4"
            if (text_v.text.toString().toInt() == 0) {
                text_v.setText(temp)
            }else {
                if (isNew){
                    text_v.setText("")
                }
                isNew = false
                str = text_v.text.toString().plus(temp)
                text_v.setText(str)
            }
        }
        num5.setOnClickListener {
            temp = "5"
            if (text_v.text.toString().toInt() == 0) {
                text_v.setText(temp)
            }else {
                if (isNew){
                    text_v.setText("")
                }
                isNew = false
                str = text_v.text.toString().plus(temp)
                text_v.setText(str)
            }
        }
        num6.setOnClickListener {
            temp = "6"
            if (text_v.text.toString().toInt() == 0) {
                text_v.setText(temp)
            }else {
                if (isNew){
                    text_v.setText("")
                }
                isNew = false
                str = text_v.text.toString().plus(temp)
                text_v.setText(str)
            }
        }
        num7.setOnClickListener {
            temp = "7"
            if (text_v.text.toString().toInt() == 0) {
                text_v.setText(temp)
            }else {
                if (isNew){
                    text_v.setText("")
                }
                isNew = false
                str = text_v.text.toString().plus(temp)
                text_v.setText(str)
            }
        }
        num8.setOnClickListener {
            temp = "8"
            if (text_v.text.toString().toInt() == 0) {
                text_v.setText(temp)
            }else {
                if (isNew){
                    text_v.setText("")
                }
                isNew = false
                str = text_v.text.toString().plus(temp)
                text_v.setText(str)
            }
        }
        num9.setOnClickListener {
            temp = "9"
            if (text_v.text.toString().toInt() == 0) {
                text_v.setText(temp)
            }else {
                if (isNew){
                    text_v.setText("")
                }
                isNew = false
                str = text_v.text.toString().plus(temp)
                text_v.setText(str)
            }
        }
        delete.setOnClickListener{
            if (text_v.text.length !=1) {
                str = text_v.text.toString().dropLast(1)
                text_v.setText(str)
            }
            else{
                str = "0"
                text_v.setText(str)
            }

        }
        equals.setOnClickListener{
            var new:String = text_v.text.toString()
            var result = 0
            if (op == "+"){
                result = new.toInt() + old
                text_v.setText(result.toString())}
            else if (op == "-"){
                result = old - new.toInt()
                text_v.setText(result.toString())
            }
            else if (op == "*"){
                result = new.toInt() * old
                text_v.setText(result.toString())
            }
            else if (op == "÷"){
                if (new == "0"){
                    text_v.setText("Cannot divide by Zero")
                }
                else{
                result = old / new.toInt()
                text_v.setText(result.toString())}
            }
            else if (op == "%"){
                result = new.toInt() % old
                text_v.setText(result.toString())
            }
        }

        plus.setOnClickListener {
            number1 = text_v.text.toString().toInt()
            isNew = true
            old = number1
            op = "+"
            str = "0"
        }
        minus.setOnClickListener {
            number1 = text_v.text.toString().toInt()
            isNew = true
            old = number1
            op = "-"
            str = "0"
        }
        multiplies.setOnClickListener {
            number1 = text_v.text.toString().toInt()
            isNew = true
            old = number1
            op = "*"
            str = "0"
        }
        divided.setOnClickListener {
            number1 = text_v.text.toString().toInt()
            isNew = true
            old = number1
            op = "÷"
            str = "0"
        }
        percent.setOnClickListener {
            number1 = text_v.text.toString().toInt()
            isNew = true
            old = number1
            op = "%"
            str = "0"
        }



    }
}

