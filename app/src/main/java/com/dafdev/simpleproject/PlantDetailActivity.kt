package com.dafdev.simpleproject

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.bumptech.glide.Glide

class PlantDetailActivity : AppCompatActivity() {

    private lateinit var nameDetail: TextView
    private lateinit var descDetail: TextView
    private lateinit var imageDetail: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_detail)

        val back: Toolbar = findViewById(R.id.toolbar)
        back.setNavigationOnClickListener { onBackPressed() }

        nameDetail = findViewById(R.id.tv_name_detail)
        descDetail = findViewById(R.id.tv_desc_detail)
        imageDetail = findViewById(R.id.img_detail)

        val nameData = intent.getStringExtra(NAME)
        val descData = intent.getStringExtra(DESC)
        val imgData = intent.getIntExtra(IMAGE, 0)

        nameDetail.text = nameData
        descDetail.text = descData
        Glide.with(this)
            .load(imgData)
            .into(imageDetail)
    }

    companion object {
        const val NAME = "name"
        const val DESC = "desc"
        const val IMAGE = "image"
    }
}