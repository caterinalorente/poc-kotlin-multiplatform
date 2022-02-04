package creditas.validation

import kotlin.js.RegExp

actual fun validateEmail(value: String): Boolean {
    val emailRegex = RegExp(".(.*)@.(.*)\\..(.*)")
    return emailRegex.test(value)
}
