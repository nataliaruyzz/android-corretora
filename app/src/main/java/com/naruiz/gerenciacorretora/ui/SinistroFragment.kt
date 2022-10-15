package com.naruiz.gerenciacorretora.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.naruiz.gerenciacorretora.R
import com.naruiz.gerenciacorretora.databinding.FragmentCotacaoBinding
import com.naruiz.gerenciacorretora.databinding.FragmentSinistroBinding


class SinistroFragment : Fragment() {

    private lateinit var binding: FragmentSinistroBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSinistroBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            findNavController().navigate(
                SinistroFragmentDirections.actionSinistroFragmentToSuccessFragment(
                    "sinistro"
                )
            )
        }
        binding.buttonAtualizar.setOnClickListener {
            val mySnackbar = Snackbar.make(
                binding.root,
                "O seu corretor foi notificado e entrará em contato em horário comercial.",
                Snackbar.LENGTH_SHORT
            )
            mySnackbar.show()
        }
    }
}