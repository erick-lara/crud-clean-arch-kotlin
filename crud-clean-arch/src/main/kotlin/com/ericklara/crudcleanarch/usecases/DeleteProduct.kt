package com.ericklara.crudcleanarch.usecases

import org.springframework.stereotype.Service

@Service
interface DeleteProduct {

    fun execute(id: Int)
}