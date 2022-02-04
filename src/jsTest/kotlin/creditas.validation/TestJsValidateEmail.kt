package creditas.validation

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TestJsValidateEmail {
    @Test
    fun testValidEmail() {
        val email = "caterina.minana@creditas.com.br"
        assertTrue { validateEmail(email) }
    }

    @Test
    fun testInvalidEmail() {
        val email = "@.com"
        assertFalse { validateEmail(email) }
    }
}
