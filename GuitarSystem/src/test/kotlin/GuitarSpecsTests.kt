import org.example.Guitar.GuitarSpec
import org.example.enums.Builder
import org.example.enums.Type
import org.example.enums.Wood
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GuitarSpecsTests {

    @Test
    fun `should give the model of a specification`(){

        val guitarSpec = GuitarSpec(Builder.FENDER,"model",Type.ACOUSTIC,Wood.CEDAR,Wood.ALDER)
        val model = guitarSpec.getModel()

        assertEquals("model",model)

    }
}