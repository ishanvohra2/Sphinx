package com.ishanvohra.sphinx.apis

import com.google.gson.Gson
import com.ishanvohra.sphinx.interfaces.EditTextListener
import com.ishanvohra.sphinx.models.editText.EditTextRequest
import com.ishanvohra.sphinx.models.error.ErrorBody
import com.ishanvohra.sphinx.networking.RetrofitClient
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class EditText(
    private val listener: EditTextListener,
    apiKey: String
) {

    companion object {
        fun getInstance(listener: EditTextListener, apiKey: String) = EditText(
            listener,
            apiKey
        )
    }

    private val token = "Bearer $apiKey"
    private val apiClient = RetrofitClient().instance

    /**
     * Creates a new edit for the provided input, instruction, and parameters.
     * @param request
     * @return the response generated by GPT-3
     * @see EditTextRequest
     */
    fun editText(request: EditTextRequest){
        CoroutineScope(Dispatchers.Default).launch {
            apiClient.editText(
                token,
                request
            ).run {
                if(this.isSuccessful && this.body() != null){
                    listener.onSuccess(this.body()!!)
                }
                else{
                    val errorBody = Gson().fromJson(
                        this.errorBody()?.string(),
                        ErrorBody::class.java
                    )
                    listener.onFailure(errorBody)
                }
            }
        }
    }

}