package com.example.prueba_tecnica.ui.productList

import androidx.lifecycle.ViewModel
import com.example.prueba_tecnica.domain.model.ProductModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

//encargado de ir a buscar la informacion

@HiltViewModel
class ProductViewModel @Inject constructor() : ViewModel(){

    private var _products = MutableStateFlow<List<ProductModel>>(emptyList())//Mutable
    val product:StateFlow<List<ProductModel>> = _products//No mutable

    init {//al crear el view model se ejecuta todo lo que esta dentro de este
        _products.value = listOf(
            ProductModel(1,"Producto 1","Descripcion 1",100,0.0,4.5,10,"Marca 1","Categoria 1","https://www.google.com","https://www.google.com"),
            ProductModel(2,"Producto 2","Descripcion 2",200,0.0,4.5,10,"Marca 2","Categoria 2","https://www.google.com","https://www.google.com"),
            ProductModel(3,"Producto 3","Descripcion 3",300,0.0,4.5,10,"Marca 3","Categoria 3","https://www.google.com","https://www.google.com"),
            ProductModel(4,"Producto 4","Descripcion 4",400,0.0,4.5,10,"Marca 4","Categoria 4","https://www.google.com","https://www.google.com"),
            ProductModel(5,"Producto 5","Descripcion 5",500,0.0,4.5,10,"Marca 5","Categoria 5","https://www.google.com","https://www.google.com"),
            ProductModel(6,"Producto 6","Descripcion 6",600,0.0,4.5,10,"Marca 6","Categoria 6","https://www.google.com","https://www.google.com"),
            ProductModel(7,"Producto 7","Descripcion 7",700,0.0,4.5,10,"Marca 7","Categoria 7","https://www.google.com","https://www.google.com"),
            ProductModel(8,"Producto 8","Descripcion 8",800,0.0,4.5,10,"Marca 8","Categoria 8","https://www.google.com","https://www.google.com"),
            ProductModel(9,"Producto 9","Descripcion 9",900,0.0,4.5,10,"Marca 9","Categoria 9","https://www.google.com","https://www.google.com"),
            ProductModel(10,"Producto 10","Descripcion 10",1000,0.0,4.5,10,"Marca 10","Categoria 10","https://www.google.com","https://www.google.com"),
        )
    }
    fun getProducts(){

    }
}