package com.example.prueba_tecnica.data.network;

import com.example.prueba_tecnica.domain.model.ProductModel;

import retrofit2.Response;
import retrofit2.http.GET;

public interface ProductApiService {
    @GET("products")
    suspend fun getProducts(): List<ProductResponse>

   /* @GET("categories")
    suspend fun getCategories(): Response<List<CategoryListResponse>>*/
}

