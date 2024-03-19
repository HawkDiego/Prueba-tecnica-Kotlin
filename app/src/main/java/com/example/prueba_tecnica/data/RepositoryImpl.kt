package com.example.prueba_tecnica.data

import android.util.Log
import com.example.prueba_tecnica.data.network.ProductApiService
import com.example.prueba_tecnica.domain.Repository
import com.example.prueba_tecnica.domain.model.ProductModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: ProductApiService) : Repository {//si necesito llamar a base de datos o a una api lo hago aqui

    override suspend fun getProducts(): List<ProductModel>? {
        runCatching { apiService.getProducts() }
            .onSuccess { return it.map { productResponse -> productResponse.toDomain() } }
            .onFailure { Log.i("Diego", "Ha ocurrido un") }

        return null
    }
}