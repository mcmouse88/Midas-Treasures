package md.sesrta.udianork.model

import android.annotation.SuppressLint
import android.app.Application
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.AndroidViewModel
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import md.sesrta.udianork.R

class MainViewModel(application: Application) : AndroidViewModel(application) {
    var digitScore = 0
    private var totalScore = 0
    private var isStart = false
    private var isFirstRowEnable = false
    private var isSecondRowEnable = false
    private var isThirdRowEnable = false
    private var isForthRowEnable = false
    private var isFifthRowEnable = false
    private var isSixthRowEnable = false
    private lateinit var navController: NavController
    private val moveChest = AnimationUtils.loadAnimation(getApplication(), R.anim.move_chest)
    private val returnChest = AnimationUtils.loadAnimation(getApplication(), R.anim.return_chest)

    @SuppressLint("SetTextI18n")
    fun chooseFirstChest(
        button: Button,
        textViewTotalScore: TextView,
        textViewScore: TextView,
        imageView: ImageView,
        vararg array: Array<ImageView>
    ) {
        if (isStart && isFirstRowEnable) {
            if (probablyMoney(90)) {
                digitScore = 100
                isSecondRowEnable = true
                imageView.run { startAnimation(moveChest) }
                array[1].forEach { it.setImageResource(R.drawable.new_chest2_trancse) }
            } else {
                button.text = getStringForRes(R.string.start)
                totalScore += digitScore
                textViewTotalScore.text = "${getStringForRes(R.string.total_score)} $totalScore"
                digitScore = 0
                isStart = false
                array[2].forEach {
                    it.setImageResource(R.drawable.new_chest2_negative)
                    it.startAnimation(returnChest)
                }
            }
            isFirstRowEnable = false
            textViewScore.text = "${getStringForRes(R.string.score)} $digitScore"
            array[0].forEach { it.setImageResource(R.drawable.new_chest2_negative) }
        }
    }

    @SuppressLint("SetTextI18n")
    fun chooseSecondChest(
        button: Button,
        textViewTotalScore: TextView,
        textViewScore: TextView,
        imageView: ImageView,
        vararg array: Array<ImageView>
    ) {
        if (isStart && isSecondRowEnable) {
            if (probablyMoney(80)) {
                digitScore += 500
                isThirdRowEnable = true
                imageView.run { startAnimation(moveChest) }
                array[1].forEach { it.setImageResource(R.drawable.new_chest2_trancse) }
            } else {
                button.text = getStringForRes(R.string.start)
                totalScore += digitScore
                textViewTotalScore.text = "${getStringForRes(R.string.total_score)} $totalScore"
                digitScore = 0
                isStart = false
                array[2].forEach {
                    it.setImageResource(R.drawable.new_chest2_negative)
                    it.startAnimation(returnChest)
                }
            }
            isSecondRowEnable = false
            textViewScore.text = "${getStringForRes(R.string.score)} $digitScore"
            array[0].forEach { it.setImageResource(R.drawable.new_chest2_negative) }

        }
    }

    @SuppressLint("SetTextI18n")
    fun chooseThirdChest(
        button: Button,
        textViewTotalScore: TextView,
        textViewScore: TextView,
        imageView: ImageView,
        vararg array: Array<ImageView>
    ) {
        if (isStart && isThirdRowEnable) {
            if (probablyMoney(70)) {
                digitScore += 2_000
                isForthRowEnable = true
                imageView.run { startAnimation(moveChest) }
                array[1].forEach { it.setImageResource(R.drawable.new_chest2_trancse) }
            } else {
                button.text = getStringForRes(R.string.start)
                totalScore += digitScore
                textViewTotalScore.text = "${getStringForRes(R.string.total_score)} $totalScore"
                digitScore = 0
                isStart = false
                array[2].forEach {
                    it.setImageResource(R.drawable.new_chest2_negative)
                    it.startAnimation(returnChest)
                }
            }
            isThirdRowEnable = false
            textViewScore.text = "${getStringForRes(R.string.score)} $digitScore"
            array[0].forEach { it.setImageResource(R.drawable.new_chest2_negative) }
        }
    }

    @SuppressLint("SetTextI18n")
    fun chooseForthChest(
        button: Button,
        textViewTotalScore: TextView,
        textViewScore: TextView,
        imageView: ImageView,
        vararg array: Array<ImageView>
    ) {
        if (isStart && isForthRowEnable) {
            if (probablyMoney(60)) {
                digitScore += 10_000
                isFifthRowEnable = true
                imageView.run { startAnimation(moveChest) }
                array[1].forEach { it.setImageResource(R.drawable.new_chest2_trancse) }
            } else {
                button.text = getStringForRes(R.string.start)
                totalScore += digitScore
                textViewTotalScore.text = "${getStringForRes(R.string.total_score)} $totalScore"
                digitScore = 0
                isStart = false
                array[2].forEach {
                    it.setImageResource(R.drawable.new_chest2_negative)
                    it.startAnimation(returnChest)
                }
            }
            isForthRowEnable = false
            textViewScore.text = "${getStringForRes(R.string.score)} $digitScore"
            array[0].forEach { it.setImageResource(R.drawable.new_chest2_negative) }
        }
    }

    @SuppressLint("SetTextI18n")
    fun chooseFifthChest(
        button: Button,
        textViewTotalScore: TextView,
        textViewScore: TextView,
        imageView: ImageView,
        vararg array: Array<ImageView>
    ) {
        if (isStart && isFifthRowEnable) {
            if (probablyMoney(50)) {
                digitScore += 50_000
                isSixthRowEnable = true
                imageView.run { startAnimation(moveChest) }
                array[1].forEach { it.setImageResource(R.drawable.new_chest2_trancse) }
            } else {
                button.text = getStringForRes(R.string.start)
                totalScore += digitScore
                textViewTotalScore.text = "${getStringForRes(R.string.total_score)} $totalScore"
                digitScore = 0
                isStart = false
                array[2].forEach {
                    // it.setImageResource(R.drawable.new_chest2_negative)
                    it.startAnimation(returnChest)
                }
            }
            isFifthRowEnable = false
            textViewScore.text = "${getStringForRes(R.string.score)} $digitScore"
            array[0].forEach { it.setImageResource(R.drawable.new_chest2_negative) }
        }
    }

    @SuppressLint("SetTextI18n")
    fun chooseSixthChest(
        button: Button,
        textViewTotalScore: TextView,
        textViewScore: TextView,
        imageView: ImageView,
        array: Array<ImageView>
    ) {
        if (isStart && isSixthRowEnable) {
            if (probablyMoney(30)) {
                digitScore += 50_000
                imageView.run { startAnimation(moveChest) }
            } else {
                button.text = getStringForRes(R.string.start)
                totalScore += digitScore
                textViewTotalScore.text = "${getStringForRes(R.string.total_score)} $totalScore"
                digitScore = 0
            }
            isStart = false
            isSixthRowEnable = false
            digitScore = 0
            textViewScore.text = "${getStringForRes(R.string.score)} $digitScore"
            array.forEach {
                it.setImageResource(R.drawable.new_chest2_negative)
                it.startAnimation(returnChest)
            }
        }
    }

    private fun getStringForRes(stringId: Int): String {
        return getApplication<Application>().resources.getString(stringId)
    }

    private fun probablyMoney(percent: Int): Boolean {
        return (Math.random() < percent / 100.0)
    }

    fun navigateFragment(fragment: FragmentActivity) {
        val navHost =
            fragment.supportFragmentManager.findFragmentById(R.id.fragmentView) as NavHostFragment
        navController = navHost.navController
        navController.navigate(R.id.splashFragment)
    }

    @SuppressLint("SetTextI18n", "ResourceType")
    fun startGame(
        button: Button,
        textViewTotalScore: TextView,
        textViewScore: TextView,
        vararg array: Array<ImageView>
    ) {
        isStart = !isStart
        if (isStart) {
            button.text = getStringForRes(R.string.stop)
            isFirstRowEnable = true
            array[0].forEach { it.setImageResource(R.drawable.new_chest2_trancse) }
        } else {
            button.text = getStringForRes(R.string.start)
            totalScore += digitScore
            textViewTotalScore.text = "${getStringForRes(R.string.total_score)} $totalScore"
            digitScore = 0
            textViewScore.text = getStringForRes(R.string.score)

            array[1].forEach {
                it.setImageResource(R.drawable.new_chest2_negative)
                it.startAnimation(returnChest)
            }
        }
    }


}