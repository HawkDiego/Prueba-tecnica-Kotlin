package com.example.prueba_tecnica.ui.productList

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.prueba_tecnica.databinding.FragmentProductListBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class ProductsFragment : Fragment() {

    private val productViewModel by viewModels<ProductViewModel>() //Conexion con el viewModel

    private var _binding: FragmentProductListBinding? = null
    private val binding get() = _binding!! //Esto se usa para sobreescribit el getter de _binding

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {//cuando la vista ya esta creada
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    override fun onCreateView(//Cuando se crea la vista
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProductListBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun initUI() {
        initUIState()
    }

    private fun initUIState() {
        lifecycleScope.launch {//Corrutina anclada al ciclo de vida del estado
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                productViewModel.product.collect {//Recolecta los datos del viewModel

                }
            }
        }


    }
}