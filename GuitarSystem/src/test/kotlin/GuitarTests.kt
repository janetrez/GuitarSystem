import org.example.Guitar.Guitar
import org.example.Guitar.GuitarSpec
import org.example.enums.Builder
import org.example.enums.Type
import org.example.enums.Wood
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GuitarTests {

    @Test
    fun `should get the serial number and price of a guitar`(){

        val guitarSpec = GuitarSpec(Builder.FENDER,"model", Type.ACOUSTIC, Wood.CEDAR, Wood.ALDER)
        val guitar = Guitar(101,23.0,guitarSpec)
        val serialNumber = guitar.getSerialNumber()
        val price = guitar.getPrice()

        assertEquals(101,serialNumber)
        assertEquals(23.0,price)
    }

}