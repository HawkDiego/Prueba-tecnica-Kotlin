package com.example.prueba_tecnica.data

import com.example.prueba_tecnica.data.model.ProductModel
import com.example.prueba_tecnica.data.model.ProductProvider
import com.example.prueba_tecnica.data.network.ProductServices

class ProductRepository {
    private val api = ProductServices()

/*Con inyeccion de dependencias esto cambia*/

    suspend fun getProducts(): List<ProductModel> {
        val res =  api.getProducts()
        ProductProvider.products = res
        return res
    }
}