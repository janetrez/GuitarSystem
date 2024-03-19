package org.example.Guitar

import org.example.enums.Builder
import org.example.enums.Type
import org.example.enums.Wood

class GuitarSpec(
    private val builder: Builder,
    private val model : String,
    private val type : Type,
    private val topWood: Wood,
    private val backWood: Wood
) {
    fun getModel() = model
    fun getBuilder() = builder
    fun getType() = type
    fun getTopWood() = topWood
    fun getBackWood() = backWood
}
