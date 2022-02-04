package creditas.validation

actual fun validateEmail(value: String): Boolean {
    val emailPattern = "^\\w[\\w|.\\-\\d+]+@[\\w|\\d]+\\.[\\w|\\d]+(\\.\\w+)*".toRegex()

    return if (emailPattern.matches((value))) {
        true
    } else {
        return false
    }
}
