package com.ishanvohra.sphinx.models.editText

/**
 * Request body for edit API call
 * @param model ID of the model to use.
 * @param input The input text to use as a starting point for the edit.
 * @param instruction The instruction that tells the model how to edit the prompt.
 * @param n How many edits to generate for the input and instruction.
 * @param temperature What sampling temperature to use, between 0 and 2.
 * @param top_p An alternative to sampling with temperature, called nucleus
 * sampling, where the model considers the results of the tokens with top_p
 * probability mass.
 */
data class EditTextRequest(
    val model: String,
    val input: String = "",
    val instruction: String,
    val n: Int = 1,
    val temperature: Double = 1.0,
    val top_p: Double? = 1.0
)