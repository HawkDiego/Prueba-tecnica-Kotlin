package com.example.prueba_tecnica.data

import android.util.Log
import com.example.prueba_tecnica.data.network.ProductApiService
import com.example.prueba_tecnica.data.network.ProductResponse
import com.example.prueba_tecnica.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: ProductApiService) : Repository {
    override suspend fun getProducts(): List<ProductResponse>? {//si necesito llamar a base de datos o a una api lo hago aqui
        runCatching { apiService.getProducts() }
            .onSuccess { return it }
            .onFailure { return Log.i("Diego", "Ha ocurrido un error") }

        return null
    }
}