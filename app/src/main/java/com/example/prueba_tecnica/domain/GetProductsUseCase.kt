package com.example.prueba_tecnica.domain

import com.example.prueba_tecnica.data.ProductRepository
import com.example.prueba_tecnica.data.model.ProductModel

class GetProductsUseCase {

    private val repository = ProductRepository()

    //La funcion con invoke se ejecuta automaticamente cuando se llama el objeto

    suspend operator fun invoke(): List<ProductModel>? = repository.getProducts()
}