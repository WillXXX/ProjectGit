package com.example.projectgit.model

data class WebContent(
    val incomplete_results: Boolean,
    val items: List<Item>,
    val total_count: Int
)