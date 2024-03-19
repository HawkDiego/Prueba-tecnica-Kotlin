package com.example.prueba_tecnica.domain.usecase

import com.example.prueba_tecnica.domain.Repository
import javax.inject.Inject

class GetProductsUseCase @Inject constructor(private val repository: Repository) {

    suspend operator fun invoke() = repository.getProducts()

}