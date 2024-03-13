package com.example.prueba_tecnica.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.prueba_tecnica.data.model.ProductModel
import com.example.prueba_tecnica.domain.GetProductsUseCase
import kotlinx.coroutines.launch

class ProductViewModel : ViewModel(){
    val productModel = MutableLiveData<ProductModel>() //Conexion a el activity
    val loading = MutableLiveData<Boolean>() //Conexion a el activity

    var getProductUseCase = GetProductsUseCase()
    fun onCreate(){
        //Esto nos permite  trabajar mas facil con la corutinas
        viewModelScope.launch {
            loading.postValue(true)
            val result: List<ProductModel>? = getProductUseCase()

            if(!result.isNullOrEmpty()){
                productModel.postValue(result[0])
                loading.postValue(false)
            }
        }
    }
    //Aca vamos a setear la informacion que vamos a mostrar
}