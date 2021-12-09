package com.dafdev.simpleproject

object PlantObject {

    private val plantName = arrayOf(
        "Anggrek",
        "Jagung",
        "Kopi",
    )

    private val plantDescription = arrayOf(
        "Anggrek adalah blablablablasadasdasdasdsdssssssssssssssssssssssssssssssssssssssssssssss",
        "Jagung adalah blablablablabldsaldasjldsahdashdsadhasldashdshdsahdljsahdlshdjsahdsahdsahd",
        "Kopi adalah sdasdsdaassssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssdsdsad",
    )

    private val plantImage = intArrayOf(
        R.drawable.anggrek,
        R.drawable.jagung,
        R.drawable.kopi,
    )

    val listData: ArrayList<Plant>
        get() {
            val list = arrayListOf<Plant>()
            for (dataPosition in plantName.indices) {
                val plant = Plant()
                plant.name = plantName[dataPosition]
                plant.description = plantDescription[dataPosition]
                plant.image = plantImage[dataPosition]
                list.add(plant)
            }
            return list
        }
}