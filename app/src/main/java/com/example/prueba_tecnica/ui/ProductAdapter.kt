package com.example.prueba_tecnica.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.prueba_tecnica.R
import com.example.prueba_tecnica.data.model.ProductModel

class ProductsAdapter(
    private var productList: List<ProductModel> = emptyList(),
    private val onProductClick: (ProductModel) -> Unit
) :
    RecyclerView.Adapter<ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        return ProductViewHolder(layoutInflater.inflate(R.layout.item_product, parent, false))
    }

    override fun getItemCount() = productList.size


    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(productList[position], onProductClick)

    }
}