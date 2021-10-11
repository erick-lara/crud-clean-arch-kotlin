package com.ericklara.crudcleanarch.usecases

import com.ericklara.crudcleanarch.domain.Product
import org.springframework.stereotype.Service

@Service
interface GetProducts {
    fun execute(): List<Product>
}