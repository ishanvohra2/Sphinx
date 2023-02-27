package com.ishanvohra.sphinx.interfaces

import com.ishanvohra.sphinx.models.completeText.CompleteTextResult
import com.ishanvohra.sphinx.models.error.ErrorBody

interface TextCompleteListener {
    fun onSuccess(result: CompleteTextResult)
    fun onFailure(error: ErrorBody)
}