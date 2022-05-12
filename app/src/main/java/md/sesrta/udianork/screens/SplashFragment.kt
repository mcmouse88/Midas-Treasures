package md.sesrta.udianork.screens

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import md.sesrta.udianork.R
import md.sesrta.udianork.model.SplashViewModel

class SplashFragment : Fragment() {
    private val model: SplashViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_splash, container, false)
        Handler(Looper.myLooper()!!).postDelayed({
            goToMenu()
        }, 2000)
        return view
    }

    private fun goToMenu() {
        val direction = SplashFragmentDirections.actionSplashFragmentToMenuFragment()
        findNavController().navigate(direction)
    }
}