package creditas.validation

private fun valueContainsDigits(value: CharSequence): Boolean {
    val valueWithDigits = value.filter { it.isDigit() }
    return valueWithDigits.isNotEmpty()
}

fun validateName(value: String): Boolean {
    if (value.isBlank() || valueContainsDigits(value)) {
        return false
    }
    return true
}

expect fun validateEmail(value: String): Boolean
