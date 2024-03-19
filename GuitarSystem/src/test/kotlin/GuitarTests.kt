import org.example.Guitar.Guitar
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GuitarTests {

    @Test
    fun `should get the serial number of a guitar`(){

            val guitar = Guitar(101,23.0)
            val serialNumber = guitar.getSerialNumber()

            assertEquals(101,serialNumber)
    }
    
}