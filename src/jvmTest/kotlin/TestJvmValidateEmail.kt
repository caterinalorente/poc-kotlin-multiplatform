import creditas.validation.validateEmail
import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TestJvmValidateEmail {
    @Test
    fun testValidEmail() {
        val email = "caterina.minana@creditas.com.br"
        assertTrue { validateEmail(email) }
    }

    @Test
    fun testInvalidEmail() {
        val email = "@creditas.com.br"
        assertFalse { validateEmail(email) }
    }
}
