package org.example.GuitarSpecs

class GuitarSpec(
    private val builder: String,
    private val model : String,
    private val type : String,
    private val topWood: String,
    private val backWood: String
) {
    fun getModel() = model
    fun getBuilder() = builder
    fun getType() = type
    fun getTopWood() = topWood
    fun getBackWood() = backWood
}
