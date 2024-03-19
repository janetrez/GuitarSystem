import org.example.Guitar.Guitar
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GuitarTests {

    @Test
    fun `should get the serial number and price of a guitar`(){

            val guitar = Guitar(101,23.0)
            val serialNumber = guitar.getSerialNumber()
            val price = guitar.getPrice()

            assertEquals(101,serialNumber)
            assertEquals(23.0,price)
    }

}