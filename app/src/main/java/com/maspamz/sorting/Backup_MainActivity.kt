package com.maspamz.sorting

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class Backup_MainActivity : AppCompatActivity() {

   /* override fun onCreate(savedInstanceState: Bundle?) {
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

        val r = "6, 1, 3, 7, 2, 30, 4";
        val hitung = r.split(", ").size
        if(hitung < 0){
            Toast.makeText(applicationContext, "Data Format Arraynya salah Gan ", Toast.LENGTH_SHORT).show()
        }else{
            val intArray = r.split(", ").map(String::toInt).toIntArray()
            Log.d("strArray",""+Arrays.toString(intArray))
            val numbers1 : IntArray = intArray
            SortAsc(numbers1)
            Log.d("buble sort",""+Arrays.toString(numbers1))
            val numbers2 = numbers1
            SortDesc(numbers2)
            Log.d("buble sort desc",""+Arrays.toString(numbers2)+" sixenya ="+numbers2.size)
        }


    }

    fun SortAsc(numbers: IntArray) {
        for (pass in 0 until (numbers.size - 1)) {
            // A single pass of bubble sort
            for (currentPosition in 0 until (numbers.size - pass - 1)) {
                // This is a single step
                if (numbers[currentPosition] > numbers[currentPosition + 1]) {
                    val tmp = numbers[currentPosition]
                    numbers[currentPosition] = numbers[currentPosition + 1]
                    numbers[currentPosition + 1] = tmp
                }
            }
        }
    }

    fun SortDesc(numbers: IntArray) {
        for (pass in 0 until (numbers.size - 1)) {
            // A single pass of bubble sort
            for (currentPosition in 0 until (numbers.size - 1)) {
                // This is a single step
                if (numbers[currentPosition] < numbers[currentPosition + 1]) {
                    val tmp = numbers[currentPosition]
                    numbers[currentPosition] = numbers[currentPosition + 1]
                    numbers[currentPosition + 1] = tmp
                }
            }
        }
    }*/
}