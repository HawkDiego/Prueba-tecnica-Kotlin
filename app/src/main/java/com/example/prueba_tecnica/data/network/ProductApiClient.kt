package com.example.prueba_tecnica.data.network;

import com.example.prueba_tecnica.data.model.ProductModel;

import retrofit2.Response;
import retrofit2.http.GET;

public interface ProductApiClient {
    @GET("products")
    suspend fun getProducts(): Response<List<ProductModel>>
}
