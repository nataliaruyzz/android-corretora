package com.naruiz.gerenciacorretora.ui.corretor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.naruiz.gerenciacorretora.R
import com.naruiz.gerenciacorretora.databinding.FragmentHomeBinding
import com.naruiz.gerenciacorretora.databinding.FragmentHomeCorretorBinding
import com.naruiz.gerenciacorretora.ui.HomeFragmentDirections

class HomeCorretorFragment : Fragment() {

    private lateinit var binding: FragmentHomeCorretorBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeCorretorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setButton()
    }

    private fun setButton() {
        binding.button.setOnClickListener {
            findNavController().navigate(
                HomeCorretorFragmentDirections.actionHomeCorretorFragmentToRelatorioFragment(
                    ""
                )
            )
        }
        binding.button2.setOnClickListener {
            findNavController().navigate(
                HomeCorretorFragmentDirections.actionHomeCorretorFragmentToRelatorioFragment(
                    ""
                )
            )
        }
        binding.button3.setOnClickListener {
            findNavController().navigate(
                HomeCorretorFragmentDirections.actionHomeCorretorFragmentToRelatorioFragment(
                    ""
                )
            )
        }
    }
}