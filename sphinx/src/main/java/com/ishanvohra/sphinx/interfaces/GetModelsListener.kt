package com.ishanvohra.sphinx.interfaces

import com.ishanvohra.sphinx.models.error.ErrorBody
import com.ishanvohra.sphinx.models.getModels.GetModelsResult

interface GetModelsListener {
    fun onSuccess(result: GetModelsResult)
    fun onFailure(error: ErrorBody)
}