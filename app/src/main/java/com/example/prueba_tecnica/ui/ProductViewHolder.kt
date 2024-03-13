package com.example.prueba_tecnica.ui

import android.annotation.SuppressLint
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.prueba_tecnica.data.model.ProductModel
import com.example.prueba_tecnica.databinding.ItemProductBinding
import com.squareup.picasso.Picasso

class ProductViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemProductBinding.bind(view)

    @SuppressLint("SetTextI18n")
    fun bind(
        product: ProductModel,
        onProductClick: (ProductModel) -> Unit
    ) {
        binding.tvProductName.text = product.title
        binding.tvProductPrice.text = "${product.price.toString()} $"
        binding.tvProductRating.text = product.rating.toString()
        Picasso.get().load(product.thumbnail).into(binding.tvProductImage)
        binding.root.setOnClickListener { onProductClick(product) }

    }
}