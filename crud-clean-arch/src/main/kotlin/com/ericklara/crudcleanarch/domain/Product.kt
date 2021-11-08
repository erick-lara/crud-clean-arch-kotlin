package com.ericklara.crudcleanarch.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table("products")
class Product (
    @Id
    var id: Int?,
    var name: String?,
    var quantity: Int?,
    var theme: String?,
    var dateInsert: LocalDateTime? = LocalDateTime.now()
)