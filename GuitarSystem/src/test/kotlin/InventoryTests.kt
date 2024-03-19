import org.example.Guitar.GuitarSpec
import org.example.Guitar.Inventory
import org.example.enums.Builder
import org.example.enums.Type
import org.example.enums.Wood
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class InventoryTests {

    @Test
    fun `should get a guitar from its serial number and retrieve its model`(){
        val inventory = Inventory()
        val guitarSpecs = GuitarSpec(Builder.FENDER,"model",Type.ACOUSTIC,Wood.ALDER,Wood.ALDER)
        inventory.addGuitar(101,23.0,guitarSpecs)

        val guitar = inventory.getGuitar(101)
        val model = guitar!!.getGuitarSpec().getModel()

        assertEquals("model",model)


    }

    @Test
    fun `should return the list of matching guitar for the given guitarSpec`(){
        val inventory = Inventory()
        val guitarSpecs = GuitarSpec(Builder.FENDER,"model",Type.ACOUSTIC,Wood.ALDER,Wood.ALDER)
        inventory.addGuitar(101,23.0,guitarSpecs)

        val guitars = inventory.search(guitarSpecs)
        val serialNumber = guitars.first().getSerialNumber()

        assertEquals(101,serialNumber)
    }
}