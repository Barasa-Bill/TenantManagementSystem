package com.example.tenantmanagementsystem

// "object" means exactly ONE instance, shared by the whole app.
// Dashboard, Add Tenant and View Tenants all see the same list.
object TenantRepository {

    // The shared list of tenants (lives in memory only)
    val tenants = mutableListOf<Tenant>()

    fun addTenant(tenant: Tenant) {
        tenants.add(tenant)
    }

    // Adds up every tenant's rent. If the text isn't a valid
    // number, it counts as 0.0 instead of crashing.
    fun totalRent(): Double {
        return tenants.sumOf { it.rent.toDoubleOrNull() ?: 0.0 }
    }
}