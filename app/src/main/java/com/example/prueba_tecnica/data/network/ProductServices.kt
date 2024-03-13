package com.example.prueba_tecnica.data.network

import com.example.prueba_tecnica.core.RetrofitHelper
import com.example.prueba_tecnica.data.model.ProductModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ProductServices {
    //Esta es la manera en la que vamos a consultar y si deseamos modificar
    //la libreria solo debemos tocar este archivo (SOLID)
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getProducts():List<ProductModel> {
       return withContext(Dispatchers.IO){
           val response = retrofit.create(ProductApiClient::class.java).getProducts()
           response.body() ?: emptyList()
       }
    }
}