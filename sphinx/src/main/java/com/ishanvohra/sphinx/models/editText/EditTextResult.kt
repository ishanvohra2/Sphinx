package com.ishanvohra.sphinx.models.editText

/**
 * Result class for edit text API
 */
data class EditTextResult(
    val created: Int,
    val `object`: String,
    val usage: Usage,
    val list: List<Choice>
) {

    data class Usage(
        val completion_tokens: Int,
        val prompt_tokens: Int,
        val total_tokens: Int
    )

    data class Choice(
        val index: Int,
        val text: String
    )
}