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
            val arrayAllChest = arrayOf(
                imageView1, imageView2, imageView3, imageView4,
                imageView5, imageView6, imageView7, imageView8,
                imageView9, imageView10, imageView11, imageView12,
                imageView13, imageView14, imageView15, imageView16,
                imageView17, imageView18, imageView19, imageView20,
                imageView21, imageView22, imageView23, imageView24
            )

            buttonStartAndStop.setOnClickListener {
                model.startGame(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    array = arrayOf(arrayChestFirstRow, arrayAllChest)
                )
            }

            imageView1.setOnClickListener {
                model.chooseFirstChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView1,
                    array = arrayOf(arrayChestFirstRow, arrayChestSecondRow, arrayAllChest)
                )
            }

            imageView2.setOnClickListener {
                model.chooseFirstChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView2,
                    array = arrayOf(arrayChestFirstRow, arrayChestSecondRow, arrayAllChest)
                )
            }

            imageView3.setOnClickListener {
                model.chooseFirstChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView3,
                    array = arrayOf(arrayChestFirstRow, arrayChestSecondRow, arrayAllChest)
                )
            }

            imageView4.setOnClickListener {
                model.chooseFirstChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView4,
                    array = arrayOf(arrayChestFirstRow, arrayChestSecondRow, arrayAllChest)
                )
            }

            imageView5.setOnClickListener {
                model.chooseSecondChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView5,
                    array = arrayOf(arrayChestSecondRow, arrayChestThirdRow, arrayAllChest)
                )
            }

            imageView6.setOnClickListener {
                model.chooseSecondChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView6,
                    array = arrayOf(arrayChestSecondRow, arrayChestThirdRow, arrayAllChest)
                )
            }

            imageView7.setOnClickListener {
                model.chooseSecondChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView7,
                    array = arrayOf(arrayChestSecondRow, arrayChestThirdRow, arrayAllChest)
                )
            }

            imageView8.setOnClickListener {
                model.chooseSecondChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView8,
                    array = arrayOf(arrayChestSecondRow, arrayChestThirdRow, arrayAllChest)
                )
            }

            imageView9.setOnClickListener {
                model.chooseThirdChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView9,
                    array = arrayOf(arrayChestThirdRow, arrayChestForthRow, arrayAllChest)
                )
            }

            imageView10.setOnClickListener {
                model.chooseThirdChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView10,
                    array = arrayOf(arrayChestThirdRow, arrayChestForthRow, arrayAllChest)
                )
            }

            imageView11.setOnClickListener {
                model.chooseThirdChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView11,
                    array = arrayOf(arrayChestThirdRow, arrayChestForthRow, arrayAllChest)
                )
            }

            imageView12.setOnClickListener {
                model.chooseThirdChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView12,
                    array = arrayOf(arrayChestThirdRow, arrayChestForthRow, arrayAllChest)
                )
            }

            imageView13.setOnClickListener {
                model.chooseForthChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView13,
                    array = arrayOf(arrayChestForthRow, arrayChestFifthRow, arrayAllChest)
                )
            }

            imageView14.setOnClickListener {
                model.chooseForthChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView14,
                    array = arrayOf(arrayChestForthRow, arrayChestFifthRow, arrayAllChest)
                )
            }

            imageView15.setOnClickListener {
                model.chooseForthChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView15,
                    array = arrayOf(arrayChestForthRow, arrayChestFifthRow, arrayAllChest)
                )
            }

            imageView16.setOnClickListener {
                model.chooseForthChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView16,
                    array = arrayOf(arrayChestForthRow, arrayChestFifthRow, arrayAllChest)
                )
            }

            imageView17.setOnClickListener {
                model.chooseFifthChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView17,
                    array = arrayOf(arrayChestFifthRow, arrayChestSixthRow, arrayAllChest)
                )
            }

            imageView18.setOnClickListener {
                model.chooseFifthChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView18,
                    array = arrayOf(arrayChestFifthRow, arrayChestSixthRow, arrayAllChest)
                )
            }

            imageView19.setOnClickListener {
                model.chooseFifthChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView19,
                    array = arrayOf(arrayChestFifthRow, arrayChestSixthRow, arrayAllChest)
                )
            }

            imageView20.setOnClickListener {
                model.chooseFifthChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView20,
                    array = arrayOf(arrayChestFifthRow, arrayChestSixthRow, arrayAllChest)
                )
            }

            imageView21.setOnClickListener {
                model.chooseSixthChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView21,
                    array = arrayAllChest
                )
            }

            imageView22.setOnClickListener {
                model.chooseSixthChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView22,
                    array = arrayAllChest
                )
            }

            imageView23.setOnClickListener {
                model.chooseSixthChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView23,
                    array = arrayAllChest
                )
            }

            imageView24.setOnClickListener {
                model.chooseSixthChest(
                    button = buttonStartAndStop,
                    textViewScore = textViewScore,
                    textViewTotalScore = textViewTotalScore,
                    imageView = imageView24,
                    array = arrayAllChest
                )
            }
        }
    }
}



