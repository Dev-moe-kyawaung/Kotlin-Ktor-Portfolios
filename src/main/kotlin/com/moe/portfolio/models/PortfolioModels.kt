package com.moe.portfolio.models

data class Project(
    val title: String,
    val description: String,
    val imageUrl: String,
    val tags: List<String>
)

data class SocialLink(
    val label: String,
    val url: String,
    val icon: String
)
