package org.example.Guitar

class Inventory {
    private var guitars = mutableListOf<Guitar>()

    public fun addGuitar(serialNumber : Int, price : Double, guitarSpecs : GuitarSpec){
        val guitar = Guitar(serialNumber,price,guitarSpecs)
        guitars.add(guitar)
    }

    public fun getGuitar(serialNumber: Int) : Guitar? {
        return guitars.find { it.getSerialNumber() == serialNumber }
    }

    public fun search(guitarSpecs : GuitarSpec):List<Guitar>{
        return guitars.filter{ it.getGuitarSpec() == guitarSpecs }
    }
}