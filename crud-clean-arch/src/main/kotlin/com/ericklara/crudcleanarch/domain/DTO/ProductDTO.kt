package com.ericklara.crudcleanarch.domain.DTO

import org.springframework.data.relational.core.mapping.Table

class ProductDTO (
    var name: String?,
    var quantity: Int?
)