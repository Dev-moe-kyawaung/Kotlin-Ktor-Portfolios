package com.moe.portfolio.services

import com.moe.portfolio.models.ContactForm

object ContactService {
    fun validate(form: ContactForm): List<String> {
        val errors = mutableListOf<String>()
        if (form.name.isBlank()) errors += "Name is required"
        if (form.email.isBlank() || !form.email.contains("@")) errors += "Valid email is required"
        if (form.message.isBlank()) errors += "Message is required"
        return errors
    }
}
