package md.sesrta.udianork.model

import android.annotation.SuppressLint
import android.app.Application
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
    var totalScore = 0
    private var isStart = false
    private var isFirstRowEnable = false
    private var isSecondRowEnable = false
    private var isThirdRowEnable = false
    private var isForthRowEnable = false
    private var isFifthRowEnable = false
    private var isSixthRowEnable = false
    private  lateinit var navController: NavController

    @SuppressLint("SetTextI18n")
    fun chooseFirstChest(button: Button, textViewTotalScore: TextView, textViewScore: TextView, array1: Array<ImageView>, array2: Array<ImageView>) {
        if (isStart && isFirstRowEnable) {
            if (probablyMoney(90)) {
                digitScore = 100
                isSecondRowEnable = true
                array2.forEach { it.setImageResource(R.drawable.chest2) }
            } else {
                button.text = getStringForRes(R.string.start)
                totalScore += digitScore
                textViewTotalScore.text = "${getStringForRes(R.string.total_score)} $totalScore"
                digitScore = 0
                isStart = false
            }
            isFirstRowEnable = false
            textViewScore.text = "${getStringForRes(R.string.score)} $digitScore"
            array1.forEach { it.setImageResource(R.drawable.chest2transparent) }
        }
    }

    @SuppressLint("SetTextI18n")
    fun chooseSecondChest(button: Button, textViewTotalScore: TextView, textViewScore: TextView, array1: Array<ImageView>, array2: Array<ImageView>) {
        if (isStart && isSecondRowEnable) {
            if (probablyMoney(80)) {
                digitScore += 500
                isThirdRowEnable = true
                array2.forEach { it.setImageResource(R.drawable.chest2) }
            } else {
                button.text = getStringForRes(R.string.start)
                totalScore += digitScore
                textViewTotalScore.text = "${getStringForRes(R.string.total_score)} $totalScore"
                digitScore = 0
                isStart = false
            }
            isSecondRowEnable = false
            textViewScore.text = "${getStringForRes(R.string.score)} $digitScore"
            array1.forEach { it.setImageResource(R.drawable.chest2transparent) }
        }
    }

    @SuppressLint("SetTextI18n")
    fun chooseThirdChest(button: Button, textViewTotalScore: TextView, textViewScore: TextView, array1: Array<ImageView>, array2: Array<ImageView>) {
        if (isStart && isThirdRowEnable) {
            if (probablyMoney(70)) {
                digitScore += 2_000
                isForthRowEnable = true
                array2.forEach { it.setImageResource(R.drawable.chest2) }
            } else {
                button.text = getStringForRes(R.string.start)
                totalScore += digitScore
                textViewTotalScore.text = "${getStringForRes(R.string.total_score)} $totalScore"
                digitScore = 0
                isStart = false
            }
            isThirdRowEnable = false
            textViewScore.text = "${getStringForRes(R.string.score)} $digitScore"
            array1.forEach { it.setImageResource(R.drawable.chest2transparent) }
        }
    }

    @SuppressLint("SetTextI18n")
    fun chooseForthChest(button: Button, textViewTotalScore: TextView, textViewScore: TextView, array1: Array<ImageView>, array2: Array<ImageView>) {
        if (isStart && isForthRowEnable) {
            if (probablyMoney(60)) {
                digitScore += 10_000
                isFifthRowEnable = true
                array2.forEach { it.setImageResource(R.drawable.chest2) }
            } else {
                button.text = getStringForRes(R.string.start)
                totalScore += digitScore
                textViewTotalScore.text = "${getStringForRes(R.string.total_score)} $totalScore"
                digitScore = 0
                isStart = false
            }
            isForthRowEnable = false
            textViewScore.text = "${getStringForRes(R.string.score)} $digitScore"
            array1.forEach { it.setImageResource(R.drawable.chest2transparent) }
        }
    }

    @SuppressLint("SetTextI18n")
    fun chooseFifthChest(button: Button, textViewTotalScore: TextView, textViewScore: TextView, array1: Array<ImageView>, array2: Array<ImageView>) {
        if (isStart && isFifthRowEnable) {
            if (probablyMoney(50)) {
                digitScore += 50_000
                isSixthRowEnable = true
                array2.forEach { it.setImageResource(R.drawable.chest2) }
            } else {
                button.text = getStringForRes(R.string.start)
                totalScore += digitScore
                textViewTotalScore.text = "${getStringForRes(R.string.total_score)} $totalScore"
                digitScore = 0
                isStart = false
            }
            isFifthRowEnable = false
            textViewScore.text = "${getStringForRes(R.string.score)} $digitScore"
            array1.forEach { it.setImageResource(R.drawable.chest2transparent) }
        }
    }

    @SuppressLint("SetTextI18n")
    fun chooseSixthChest(button: Button, textViewTotalScore: TextView, textViewScore: TextView, array1: Array<ImageView>) {
        if (isStart && isSixthRowEnable) {
            if (probablyMoney(30)) {
                digitScore += 50_000
            } else {
                button.text = getStringForRes(R.string.start)
                totalScore += digitScore
                textViewTotalScore.text = "${getStringForRes(R.string.total_score)} $totalScore"
                digitScore = 0
            }
            isStart = false
            isSixthRowEnable = false
            textViewScore.text = "${getStringForRes(R.string.score)} $digitScore"
            array1.forEach { it.setImageResource(R.drawable.chest2transparent) }
        }
    }

    private fun getStringForRes(stringId: Int): String {
        return getApplication<Application>().resources.getString(stringId)
    }

    private fun probablyMoney(percent: Int): Boolean {
        return (Math.random() < percent / 100.0)
    }

    fun navigateFragment(fragment: FragmentActivity) {
        val navHost = fragment.supportFragmentManager.findFragmentById(R.id.fragmentView) as NavHostFragment
        navController = navHost.navController
        navController.navigate(R.id.splashFragment)
    }

    @SuppressLint("SetTextI18n", "ResourceType")
    fun startGame(button: Button, textViewTotalScore: TextView, textViewScore: TextView, array: Array<ImageView>) {
        isStart = !isStart
        if (isStart) {
            button.text = getStringForRes(R.string.stop)
            isFirstRowEnable = true
            array.forEach { it.setImageResource(R.drawable.chest2) }
        } else {
            button.text = getStringForRes(R.string.start)
            totalScore += digitScore
            textViewTotalScore.text = "${getStringForRes(R.string.total_score)} $totalScore"
            digitScore = 0
            textViewScore.text = getStringForRes(R.string.score)
        }
    }
}