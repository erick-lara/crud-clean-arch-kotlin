package com.ericklara.crudcleanarch.usecases.impl

import com.ericklara.crudcleanarch.domain.Product
import com.ericklara.crudcleanarch.gateway.repositories.ProductRepository
import com.ericklara.crudcleanarch.usecases.GetProductById
import org.springframework.stereotype.Service

@Service
class GetProductByIdImpl(val db: ProductRepository): GetProductById {
    override fun execute(id: Int): Product {
        return db.getById(id)
    }

}