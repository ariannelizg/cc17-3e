package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Contacts : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList:ArrayList<DataClass>
    lateinit var imageList: Array<Int>
    lateinit var titleList: Array<String>
    lateinit var numberList: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)

        imageList = arrayOf(
            R.drawable.vet1,
            R.drawable.vet2,
            R.drawable.vet3,
            R.drawable.vet4,
            R.drawable.vet5,
            R.drawable.vet6,
            R.drawable.vet7,
            R.drawable.vet8,
            R.drawable.vet9,
            R.drawable.vet10)

        titleList = arrayOf(
            "Baguio Veterinary Clinic",
            "Naguilian Veterinary Clinic",
            "Petrea Sure Veterinary Clinic",
            "Angeles Pet Care Clinic",
            "GPH Veterinary Services",
            "The Pet Pro Veterinary",
            "Graysville Vet Clinic",
            "Diskubre Pet Clinic",
            "Neo Veterinary Services",
            "Hayop Kalinga Clinic")

        numberList = arrayOf(
            "+63 74 443 5332 ",
            "+63 74 244 2066 ",
            "+63 909 999 2403 ",
            "+63 933 329 4808 ",
            "+63 919 731 3655 ",
            "+63 74 302 0105 ",
            "+63 930 348 8044 ",
            "+63 74 619 1213 ",
            "+63 920 320 1439  ",
            "+63 998 938 3749 ",
        )

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf<DataClass>()
        getData()
    }

    private fun getData(){
        for (i in imageList.indices){
            val dataClass = DataClass(imageList[i], titleList[i], numberList[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter = AdapterClass(dataList)

    }
}