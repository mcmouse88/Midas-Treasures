package md.sesrta.udianork.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import md.sesrta.udianork.databinding.FragmentOptionsBinding

class OptionsFragment : Fragment() {
    private lateinit var binding: FragmentOptionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOptionsBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.backToMenu.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}