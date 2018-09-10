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
        val btnAsc = btn_asc as Button
        val btnDesc = btn_desc as Button

        btnAsc.setOnClickListener{
            val a: String = angka1.text.toString()

            if(angka1.text.isEmpty()){
                Toast.makeText(applicationContext, "Data tidak boleh kosong ", Toast.LENGTH_SHORT).show()
            } else {
                    var c = a
                    val r = c
                    val intArray = r.split(", ").map(String::toInt).toIntArray()
                    val numbers1 : IntArray = intArray
                    SortAsc(numbers1)
                    var printMe=Arrays.toString(numbers1)
                    tv_result.text = "Bentuk Sort Dalam ASC =\n"+ printMe.replace("[","").replace("]","")
            }

        }


        btnDesc.setOnClickListener{
            val a: String = angka1.text.toString()

            if(angka1.text.isEmpty()){
                Toast.makeText(applicationContext, "Data tidak boleh kosong ", Toast.LENGTH_SHORT).show()
            } else {
                    val r = a;
                    val hitung = r.split(", ").size
                    if(hitung < 0){
                        Toast.makeText(applicationContext, "Data Format Arraynya salah Gan\n" +
                                " ex: 4, 6, 9, 1, 5", Toast.LENGTH_SHORT).show()
                    }else{
                        val intArray = r.split(", ").map(String::toInt).toIntArray()
                        val numbers1 : IntArray = intArray
                        SortDesc(numbers1)
                        var printMe=Arrays.toString(numbers1)
                        tv_result.text = "Bentuk Sort Dalam ASC =\n"+ printMe.replace("[","").replace("]","")
                    }
            }
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
    }
}