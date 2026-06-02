package com.moe.portfolio.models

import kotlinx.serialization.Serializable

@Serializable
data class ContactForm(
    val name: String,
    val email: String,
    val message: String
)
