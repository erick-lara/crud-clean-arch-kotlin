package com.ericklara.crudcleanarch.usecases.impl

import com.ericklara.crudcleanarch.domain.Product
import com.ericklara.crudcleanarch.gateway.repositories.ProductRepository
import com.ericklara.crudcleanarch.usecases.DeleteProduct
import org.springframework.stereotype.Service

@Service
class DeleteById(val db: ProductRepository): DeleteProduct {
    override fun execute(id: Int) {
        val productToUpdate: Product = db.getById(id)

        db.delete(productToUpdate)
    }
}