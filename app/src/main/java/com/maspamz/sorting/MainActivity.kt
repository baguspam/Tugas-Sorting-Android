package com.maspamz.sorting

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val angka1 = ed_input1 as EditText
        val angka2 = ed_input2 as EditText
        val btnAsc = btn_asc as Button
        val btnDesc = btn_desc as Button

        btnAsc.setOnClickListener{
            val a: String = angka1.text.toString()
            val b: String = angka2.text.toString()

            if(angka1.text.isEmpty() && angka2.text.isEmpty()){
                Toast.makeText(applicationContext, "Data tidak boleh kosong ", Toast.LENGTH_SHORT).show()
            } else {
                var c = a.toInt()
                val d = b.toInt()
                val jumlah = d-c+1
                val result = IntArray(jumlah)
                var pos = 0
                while (c <= d){
                    result[pos] = c
                    pos++
                    c++
                }
                var printMe=Arrays.toString(result)
                tv_result.text = "Bentuk Sort Dalam ASC =\n"+ printMe.replace("[","").replace("]","")

            }
        }


        btnDesc.setOnClickListener{
            val a: String = angka1.text.toString()
            val b: String = angka2.text.toString()

            if(angka1.text.isEmpty() && angka2.text.isEmpty()){
                Toast.makeText(applicationContext, "Data tidak boleh kosong ", Toast.LENGTH_SHORT).show()
            } else {
                var c = a.toInt()
                var d = b.toInt()
                val jumlah = d-c+1
                val result = IntArray(jumlah)
                var pos = 0
                while (d >= c){
                    result[pos] = d
                    pos++
                    d=d-1
                }
                var printMe=Arrays.toString(result)
                tv_result.text = "Bentuk Sort Dalam DESC =\n"+ printMe.replace("[","").replace("]","")

            }
        }




    }
}