package com.ishanvohra.sphinx.models.completeText

/**
 * Request body for complete text API
 * @param model: ID of the model to use.
 * @param prompt: The prompt(s) to generate completions for, encoded as a string, array of strings,
 * array of tokens, or array of token arrays.
 * @param suffix: The suffix that comes after a completion of inserted text.
 * @param max_tokens: The maximum number of tokens to generate in the completion.
 * @param temperature: What sampling temperature to use, between 0 and 2. Higher values like 0.8
 * will make the output more random, while lower values like 0.2 will make it more
 * focused and deterministic.
 * @param top_p: An alternative to sampling with temperature, called nucleus sampling, where the
 * model considers the results of the tokens with top_p probability mass. So 0.1 means only the
 * tokens comprising the top 10% probability mass are considered.
 * @param n: How many completions to generate for each prompt.
 * @param stream: Whether to stream back partial progress.
 * @param logprobs: Include the log probabilities on the logprobs most likely tokens, as well the
 * chosen tokens.
 * @param echo: Echo back the prompt in addition to the completion
 * @param stop: Up to 4 sequences where the API will stop generating further tokens.
 * The returned text will not contain the stop sequence.
 * @param presence_penalty: Number between -2.0 and 2.0. Positive values penalize new tokens based
 * on whether they appear in the text so far, increasing the model's likelihood to talk about new
 * topics.
 * @param frequency_penalty: Number between -2.0 and 2.0. Positive values penalize new tokens based
 * on their existing frequency in the text so far, decreasing the model's likelihood to repeat the
 * same line verbatim.
 * @param best_of: Generates best_of completions server-side and returns the "best" (the one with
 * the highest log probability per token). Results cannot be streamed.
 * @param user:A unique identifier representing your end-user, which can help OpenAI to monitor
 * and detect abuse
 */
data class CompleteTextRequest(
    val logprobs: Int?= null,
    val max_tokens: Int = 16,
    val user: String = "",
    val best_of: Int = 1,
    val presence_penalty: Double = 0.0,
    val frequency_penalty: Double = 0.0,
    val echo: Boolean = false,
    val model: String,
    val n: Int = 1,
    val prompt: List<String>?= null,
    val stop: String? = null,
    val stream: Boolean = false,
    val temperature: Int = 1,
    val top_p: Int = 1,
    val suffix: String? = null
)