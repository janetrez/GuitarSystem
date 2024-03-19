package org.example.Guitar

class Guitar(
    private val serialNumber: Int,
    private val price: Double,
    private val guitarSpec: GuitarSpec
) {
    public fun getSerialNumber() = serialNumber
    public fun getPrice() = price
    public fun getGuitarSpec() = guitarSpec
}
