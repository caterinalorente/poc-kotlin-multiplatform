package creditas.validation

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TestValidation {
    @Test
    fun testValidName() {
        val name = "Caterina"
        assertTrue { validateName(name) }
    }

    @Test
    fun testEmptyName() {
        val name = ""
        assertFalse { validateName(name) }
    }

    @Test
    fun testNameWithDigits() {
        val name = "C4t3r1n4"
        assertFalse { validateName(name) }
    }
}
