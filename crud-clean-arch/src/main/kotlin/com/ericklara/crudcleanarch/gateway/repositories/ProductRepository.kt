package com.ericklara.crudcleanarch.gateway.repositories

import com.ericklara.crudcleanarch.domain.Product
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ProductRepository: CrudRepository<Product, Int> {

    @Query("SELECT * FROM products")
    fun getAllProducts(): List<Product>

    @Query("SELECT * FROM products where ID = :id")
    fun getById(id: Int): Product

}