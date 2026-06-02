package com.moe.portfolio.services

import com.moe.portfolio.models.Project
import com.moe.portfolio.models.SocialLink

object PortfolioService {
    fun projects(): List<Project> = listOf(
        Project("Secure Finance App", "Offline-first budgeting and analytics.", "/images/project-1.jpg", listOf("Kotlin", "Compose")),
        Project("Field Service App", "Maps, sync, and real-time workflows.", "/images/project-2.jpg", listOf("Kotlin", "Firebase")),
        Project("Learning Companion", "Lessons, reminders, and progress tracking.", "/images/project-3.jpg", listOf("Android", "Room"))
    )

    fun socials(): List<SocialLink> = listOf(
        SocialLink("GitHub", "https://github.com/", "github"),
        SocialLink("LinkedIn", "https://linkedin.com/", "linkedin"),
        SocialLink("Telegram", "https://t.me/", "telegram")
    )
}
