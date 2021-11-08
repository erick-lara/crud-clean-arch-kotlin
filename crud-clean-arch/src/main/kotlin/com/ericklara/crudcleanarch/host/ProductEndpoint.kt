package com.ericklara.crudcleanarch.host

import com.ericklara.crudcleanarch.domain.DTO.ProductDTO
import com.ericklara.crudcleanarch.domain.Product
import com.ericklara.crudcleanarch.usecases.*
import org.springframework.web.bind.annotation.*
import java.util.function.Consumer


@RestController
@RequestMapping("/product")
class ProductResource(
        val saveProduct: SaveProduct,
        val getProducts: GetProducts,
        val getProductById: GetProductById,
        val updateProduct: UpdateProduct,
        val deleteProduct: DeleteProduct,
        val getProductsByTheme: GetProductsByTheme
){

    @PostMapping("/new-product")
    fun post(@RequestBody product: Product) =
        saveProduct.execute(product)

    @GetMapping("/get-products")
    fun getAll(): List<Product> =
        getProducts.execute()

    @GetMapping("/get-products/{id}")
    fun getById(@PathVariable id: Int): Product =
        getProductById.execute(id)

    @PutMapping("/get-products/{id}")
    fun updateById(@PathVariable id: Int, @RequestBody product: ProductDTO) =
        updateProduct.execute(id, product)

    @DeleteMapping("/get-products/{id}")
    fun deleteById(@PathVariable id: Int) =
        deleteProduct.execute(id)

    @GetMapping("/get-products/themes/{theme}")
    fun getByTheme(@PathVariable theme: String) : List<Product>{
        return getProductsByTheme.execute(theme)
    }

}