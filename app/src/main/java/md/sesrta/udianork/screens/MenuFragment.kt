package md.sesrta.udianork.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import md.sesrta.udianork.R
import md.sesrta.udianork.databinding.FragmentMenuBinding
import kotlin.system.exitProcess

class MenuFragment : Fragment() {
    lateinit var binding: FragmentMenuBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMenuBinding.bind(view)
        binding.apply {
            buttonStartGame.setOnClickListener {
                launchDestination(R.id.gameFragment)
            }

            buttonQuitGame.setOnClickListener {
                activity?.finishAffinity()
                exitProcess(0);
            }
        }
    }

    fun launchDestination(destinationId: Int, args: Bundle? = null) {
        findNavController().navigate(
            destinationId,
            args,
            navOptions {
                anim {
                    enter = R.anim.slide_in
                    exit = R.anim.fade_out
                    popEnter = R.anim.fade_in
                    popExit = R.anim.slide_out
                }
            }
        )
    }
}