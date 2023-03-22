package com.ishanvohra.sphinx.models.getModels

data class GetModelsResult(
    val data: List<Data>
) {
    data class Data(
        val created: Int,
        val id: String,
        val owned_by: String,
        val parent: Any,
        val permission: List<Permission>,
        val root: String
    )

    data class Permission(
        val allow_create_engine: Boolean,
        val allow_fine_tuning: Boolean,
        val allow_logprobs: Boolean,
        val allow_sampling: Boolean,
        val allow_search_indices: Boolean,
        val allow_view: Boolean,
        val created: Int,
        val group: Any,
        val id: String,
        val is_blocking: Boolean,
        val `object`: String,
        val organization: String
    )
}