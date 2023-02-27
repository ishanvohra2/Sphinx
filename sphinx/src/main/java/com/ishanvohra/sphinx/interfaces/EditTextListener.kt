package com.ishanvohra.sphinx.interfaces

import com.ishanvohra.sphinx.models.editText.EditTextResult
import com.ishanvohra.sphinx.models.error.ErrorBody

interface EditTextListener {
    fun onSuccess(result: EditTextResult)
    fun onFailure(error: ErrorBody)
}