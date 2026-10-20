package com.example.tenantmanagementsystem

import java.io.Serializable // NEW: built into Java/Kotlin, no plugin needed

// NEW: ": Serializable" lets a whole Tenant be packed up and sent
// to another screen. Safe Args needs this in Practical 3.
data class Tenant(
    val name: String,
    val phone: String,
    val rent: String
) : Serializable {

    fun summary(): String {
        return "Tenant: $name\nPhone: $phone\nRent: KSh $rent"
    }
}