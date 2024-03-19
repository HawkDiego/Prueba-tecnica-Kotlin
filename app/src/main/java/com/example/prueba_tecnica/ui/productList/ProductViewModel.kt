package com.example.prueba_tecnica.ui.productList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.prueba_tecnica.domain.model.ProductModel
import com.example.prueba_tecnica.domain.usecase.GetProductsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

//encargado de ir a buscar la informacion

@HiltViewModel
class ProductViewModel @Inject constructor(private val getProductsUseCase: GetProductsUseCase) :
    ViewModel() {

    private var _products = MutableStateFlow<List<ProductModel>>(emptyList())//Mutable
    val product: StateFlow<List<ProductModel>> = _products//No mutable

    fun getProducts() {
        viewModelScope.launch {
            val result = withContext(Dispatchers.IO) { getProductsUseCase() }//Hilo secundario
            if(result != null)
                _products.value = result
            else
                _products.value = emptyList()
        }
    }

}