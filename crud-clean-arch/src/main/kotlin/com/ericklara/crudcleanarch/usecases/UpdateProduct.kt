package com.ericklara.crudcleanarch.usecases

import com.ericklara.crudcleanarch.domain.DTO.ProductDTO
import com.ericklara.crudcleanarch.domain.Product
import org.springframework.stereotype.Service

@Service
interface UpdateProduct {

    fun execute(id: Int, product: ProductDTO)

}