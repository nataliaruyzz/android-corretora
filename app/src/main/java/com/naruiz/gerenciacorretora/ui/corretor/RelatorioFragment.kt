package com.naruiz.gerenciacorretora.ui.corretor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.naruiz.gerenciacorretora.databinding.FragmentRelatorioBinding


class RelatorioFragment : Fragment() {

    private lateinit var binding: FragmentRelatorioBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRelatorioBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setButton()
    }

    private fun setButton() {
        binding.button.setOnClickListener {
            val mySnackbar = Snackbar.make(
                binding.root,
                "O relatório foi enviado para o seu email.",
                Snackbar.LENGTH_SHORT
            )
            mySnackbar.show()
        }
    }
}