package com.dafdev.simpleproject

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PlantAdapter(private val listPlant: ArrayList<Plant>) :
    RecyclerView.Adapter<PlantAdapter.PlantViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PlantAdapter.PlantViewHolder {
        return PlantViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PlantAdapter.PlantViewHolder, position: Int) {
        val dataPlant = listPlant[position]
        val itemContext = holder.itemView.context

        Glide.with(itemContext)
            .load(dataPlant.image)
            .into(holder.imagePlant)

        holder.tvName.text = dataPlant.name
        holder.tvDesc.text = dataPlant.description

        holder.itemView.setOnClickListener {
            Intent(itemContext, PlantDetailActivity::class.java).also {
                it.putExtra(PlantDetailActivity.NAME, dataPlant.name)
                it.putExtra(PlantDetailActivity.DESC, dataPlant.description)
                it.putExtra(PlantDetailActivity.IMAGE, dataPlant.image)
                itemContext.startActivity(it)
            }
        }
    }

    override fun getItemCount(): Int {
        return listPlant.size
    }

    inner class PlantViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_name)
        var tvDesc: TextView = itemView.findViewById(R.id.tv_desc)
        var imagePlant: ImageView = itemView.findViewById(R.id.img_plant)
    }

}