package com.ericklara.crudcleanarch.gateway.repositories

import com.ericklara.crudcleanarch.domain.Product
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: CrudRepository<Product, Int> {

    @Query("SELECT * FROM products")
    fun getAllProducts(): List<Product>

    @Query("SELECT * FROM products WHERE ID = :id")
    fun getById(id: Int): Product

    @Query("SELECT * FROM products WHERE THEME LIKE :theme")
    fun getByTheme(theme: String): List<Product>
}