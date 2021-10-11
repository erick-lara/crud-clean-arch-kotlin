package com.ericklara.crudcleanarch.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("products")
class Product (
    @Id
    var id: Int?,
    var name: String?,
    var quantity: Int?
)