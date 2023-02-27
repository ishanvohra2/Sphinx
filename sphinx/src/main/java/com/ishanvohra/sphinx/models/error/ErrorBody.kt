package com.ishanvohra.sphinx.models.error

data class ErrorBody(
    val error: Error
) {
    data class Error(
        val code: Any,
        val message: String,
        val `param`: Any,
        val type: String
    )
}