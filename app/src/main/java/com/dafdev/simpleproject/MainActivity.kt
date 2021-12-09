package com.dafdev.simpleproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dafdev.simpleproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private var list: ArrayList<Plant> = arrayListOf()

    private lateinit var rv: RecyclerView
    private lateinit var plantAdapter: PlantAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpAdapter()
    }

    private fun setUpAdapter() {
        rv = findViewById(R.id.rv_list)
        rv.setHasFixedSize(true)
        list.addAll(PlantObject.listData)
        showListData()
    }

    private fun showListData() {
        plantAdapter = PlantAdapter(list)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = plantAdapter
    }

}