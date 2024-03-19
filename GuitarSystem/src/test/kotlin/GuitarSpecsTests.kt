import org.example.Guitar.GuitarSpec
import org.example.enums.Builder
import org.example.enums.Type
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GuitarSpecsTests {

    @Test
    fun `should give the model of a specification`(){

        val guitarSpec = GuitarSpec(Builder.FENDER,"model",Type.ACOUSTIC,"topWood","backWood")
        val model = guitarSpec.getModel()

        assertEquals("model",model)

    }
}