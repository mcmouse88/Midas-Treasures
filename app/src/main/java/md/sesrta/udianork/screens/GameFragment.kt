package md.sesrta.udianork.screens

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import md.sesrta.udianork.R
import md.sesrta.udianork.databinding.FragmentGameBinding
import md.sesrta.udianork.model.MainViewModel

class GameFragment : Fragment() {
    lateinit var binding: FragmentGameBinding
    private val model: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_game, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentGameBinding.bind(view)

        binding.apply {
            val arrayChestFirstRow = arrayOf(imageView1, imageView2, imageView3, imageView4)
            val arrayChestSecondRow = arrayOf(imageView5, imageView6, imageView7, imageView8)
            val arrayChestThirdRow = arrayOf(imageView9, imageView10, imageView11, imageView12)
            val arrayChestForthRow = arrayOf(imageView13, imageView14, imageView15, imageView16)
            val arrayChestFifthRow = arrayOf(imageView17, imageView18, imageView19, imageView20)
            val arrayChestSixthRow = arrayOf(imageView21, imageView22, imageView23, imageView24)

            buttonStartAndStop.setOnClickListener {
                model.startGame(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array = arrayChestFirstRow)
            }
            imageView1.setOnClickListener {
                model.chooseFirstChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestFirstRow, array2 = arrayChestSecondRow)
            }

            imageView2.setOnClickListener {
                model.chooseFirstChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestFirstRow, array2 = arrayChestSecondRow)
            }

            imageView3.setOnClickListener {
                model.chooseFirstChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestFirstRow, array2 = arrayChestSecondRow)
            }

            imageView4.setOnClickListener {
                model.chooseFirstChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestFirstRow, array2 = arrayChestSecondRow)
            }

            imageView5.setOnClickListener {
                model.chooseSecondChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestSecondRow, array2 = arrayChestThirdRow)
            }

            imageView6.setOnClickListener {
                model.chooseSecondChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestSecondRow, array2 = arrayChestThirdRow)
            }

            imageView7.setOnClickListener {
                model.chooseSecondChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestSecondRow, array2 = arrayChestThirdRow)
            }

            imageView8.setOnClickListener {
                model.chooseSecondChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestSecondRow, array2 = arrayChestThirdRow)
            }

            imageView9.setOnClickListener {
                model.chooseThirdChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestThirdRow, array2 = arrayChestForthRow)
            }

            imageView10.setOnClickListener {
                model.chooseThirdChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestThirdRow, array2 = arrayChestForthRow)
            }

            imageView11.setOnClickListener {
                model.chooseThirdChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestThirdRow, array2 = arrayChestForthRow)
            }

            imageView12.setOnClickListener {
                model.chooseThirdChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestThirdRow, array2 = arrayChestForthRow)
            }

            imageView13.setOnClickListener {
                model.chooseForthChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestForthRow, array2 = arrayChestFifthRow)
            }

            imageView14.setOnClickListener {
                model.chooseForthChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestForthRow, array2 = arrayChestFifthRow)
            }

            imageView15.setOnClickListener {
                model.chooseForthChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestForthRow, array2 = arrayChestFifthRow)
            }

            imageView16.setOnClickListener {
                model.chooseForthChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestForthRow, array2 = arrayChestFifthRow)
            }

            imageView17.setOnClickListener {
                model.chooseFifthChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestFifthRow, array2 = arrayChestSixthRow)
            }

            imageView18.setOnClickListener {
                model.chooseFifthChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestFifthRow, array2 = arrayChestSixthRow)
            }

            imageView19.setOnClickListener {
                model.chooseFifthChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestFifthRow, array2 = arrayChestSixthRow)
            }

            imageView20.setOnClickListener {
                model.chooseFifthChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestFifthRow, array2 = arrayChestSixthRow)
            }

            imageView21.setOnClickListener {
                model.chooseSixthChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestSixthRow)
            }

            imageView22.setOnClickListener {
                model.chooseSixthChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestSixthRow)
            }

            imageView23.setOnClickListener {
                model.chooseSixthChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestSixthRow)
            }

            imageView24.setOnClickListener {
                model.chooseSixthChest(button = buttonStartAndStop, textViewScore = textViewScore, textViewTotalScore = textViewTotalScore, array1 = arrayChestSixthRow)
            }
        }
    }
}



