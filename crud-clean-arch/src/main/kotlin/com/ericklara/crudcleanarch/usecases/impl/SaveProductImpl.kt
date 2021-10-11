package com.ericklara.crudcleanarch.usecases.impl

import com.ericklara.crudcleanarch.domain.Product
import com.ericklara.crudcleanarch.gateway.repositories.ProductRepository
import com.ericklara.crudcleanarch.usecases.SaveProduct
import org.springframework.stereotype.Service

@Service
class SaveProductImpl(val db: ProductRepository): SaveProduct {
    override fun execute(product: Product) {
        db.save(product)
    }
}