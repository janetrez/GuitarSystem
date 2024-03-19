import org.example.GuitarSpecs.GuitarSpec
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GuitarSpecsTests {

    @Test
    fun `should give the model of a specification`(){

        val guitarSpec = GuitarSpec("builder","model","type","topWood","backWood")
        val model = guitarSpec.getModel()

        assertEquals("model",model)

    }
}