package com.ericklara.crudcleanarch.usecases.impl

import com.ericklara.crudcleanarch.domain.DTO.ProductDTO
import com.ericklara.crudcleanarch.domain.Product
import com.ericklara.crudcleanarch.gateway.repositories.ProductRepository
import com.ericklara.crudcleanarch.usecases.UpdateProduct
import org.springframework.stereotype.Service
import java.util.*

@Service
class UpdateProductImpl(val db: ProductRepository): UpdateProduct {

    override fun execute(id: Int, product: ProductDTO) {
        val productToUpdate: Product = db.getById(id)
        productToUpdate.name = product.name
        productToUpdate.quantity = product.quantity
        db.save(productToUpdate)

    }

}