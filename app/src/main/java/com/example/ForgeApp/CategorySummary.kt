package com.example.ForgeApp


data class CategorySummary(
    val id: Long,
    val name: String,
    val totalSpent: Double,
    val budget: Double = 0.0
)
