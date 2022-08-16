package com.naruiz.gerenciacorretora.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.naruiz.gerenciacorretora.R
import com.naruiz.gerenciacorretora.databinding.FragmentHomeBinding
import com.naruiz.gerenciacorretora.databinding.FragmentSuccessBinding


class SuccessFragment : Fragment() {

    private lateinit var binding: FragmentSuccessBinding
    private val args by navArgs<SuccessFragmentArgs>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSuccessBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.text.text = when(args.type) {
            "vistoria"-> "O seu corretor foi notificado e entrará em contato para confirmar a vistoria."
            "cotacao"-> "O seu corretor foi notificado e sua cotacao será enviada por email!"
            "sinistro"-> "O seu corretor foi notificado e entrará em contato para confirmar a abertura do sinistro."
            else -> "Sucesso"
        }
    }

}