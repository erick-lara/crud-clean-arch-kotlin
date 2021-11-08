package com.ericklara.crudcleanarch.usecases.impl

import com.ericklara.crudcleanarch.domain.Product
import com.ericklara.crudcleanarch.gateway.repositories.ProductRepository
import com.ericklara.crudcleanarch.usecases.GetProductsByTheme
import org.springframework.stereotype.Service

@Service
class GetProductsByThemeImpl(val db: ProductRepository): GetProductsByTheme {
    override fun execute(theme: String): List<Product> {
        return db.getByTheme(theme)
    }
}