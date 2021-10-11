package com.ericklara.crudcleanarch.usecases.impl

import com.ericklara.crudcleanarch.domain.Product
import com.ericklara.crudcleanarch.gateway.repositories.ProductRepository
import com.ericklara.crudcleanarch.usecases.GetProducts
import org.springframework.stereotype.Service

@Service
class GetProductsImpl(val db: ProductRepository): GetProducts {

    override fun execute() = db.getAllProducts()

}