package com.ishanvohra.sphinx.models.completeText

/**
 * Result generated by complete text API
 * @param choices: List of choices generated by GPT
 * @param id: Unique id for the result
 * @param model: ID of the model used.
 */
data class CompleteTextResult(
    val choices: List<Choice>,
    val created: Int,
    val id: String,
    val model: String,
    val `object`: String,
    val usage: Usage
) {
    data class Choice(
        val finish_reason: String,
        val index: Int,
        val logprobs: Logprobs,
        val text: String
    )

    data class Usage(
        val prompt_tokens: Int,
        val total_tokens: Int
    )

    data class Logprobs(
        val text_offset: List<Int>,
        val token_logprobs: List<Double>,
        val tokens: List<String>,
        val top_logprobs: List<Map<String, Double>>
    )
}