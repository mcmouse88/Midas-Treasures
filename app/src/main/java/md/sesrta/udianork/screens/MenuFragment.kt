package md.sesrta.udianork.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import md.sesrta.udianork.R
import md.sesrta.udianork.databinding.FragmentMenuBinding
import kotlin.system.exitProcess

class MenuFragment : Fragment() {
    lateinit var binding: FragmentMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMenuBinding.bind(view)
        binding.apply {
            buttonStartGame.setOnClickListener {
                val direction = MenuFragmentDirections.actionMenuFragmentToGameFragment()
                findNavController().navigate(direction)
            }

            buttonQuitGame.setOnClickListener {
                activity?.finishAffinity()
                exitProcess(0);
            }
        }
    }
}