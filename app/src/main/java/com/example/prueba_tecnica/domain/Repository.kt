package com.example.prueba_tecnica.domain

import com.example.prueba_tecnica.data.network.ProductResponse
import com.example.prueba_tecnica.domain.model.ProductModel

interface Repository {//pide la informacion en esta capa y definimos lo que necesitamos de data sin saber como se hace en data
    suspend fun getProducts(): List<ProductModel>?

}