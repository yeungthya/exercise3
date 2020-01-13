package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener{ getAge() }
        buttonReset.setOnClickListener{ resetBut() }
    }

    private fun getAge() {
        val age : Spinner = this.findViewById(R.id.spinnerAge)

        when (age.selectedItem) {
            "Less than 17" -> {
                var price = 60
                findViewById<TextView>(R.id.textViewPremium).text = "Insurance Premium : $price"
            }
            "17 to 25" -> {
                var price = 70
                findViewById<TextView>(R.id.textViewPremium).text = "Insurance Premium : $price"
                if (findViewById<RadioGroup>(R.id.radioGroupGender).checkedRadioButtonId == R.id.radioButtonMale){
                    price += 50
                    findViewById<TextView>(R.id.textViewPremium).text = "Insurance Premium : $price"
                    if (findViewById<CheckBox>(R.id.checkBoxSmoker).isChecked){
                        price += 100
                        findViewById<TextView>(R.id.textViewPremium).text = "Insurance Premium : $price"
                    }
                }else if (findViewById<CheckBox>(R.id.checkBoxSmoker).isChecked){
                    price += 100
                    findViewById<TextView>(R.id.textViewPremium).text = "Insurance Premium : $price"
                }
            }
            "26 to 30" -> {
                var price = 90
                findViewById<TextView>(R.id.textViewPremium).text = "Insurance Premium : $price"
                if (findViewById<RadioGroup>(R.id.radioGroupGender).checkedRadioButtonId == R.id.radioButtonMale){
                    price += 100
                    findViewById<TextView>(R.id.textViewPremium).text = "Insurance Premium : $price"
                    if (findViewById<CheckBox>(R.id.checkBoxSmoker).isChecked){
                        price += 150
                        findViewById<TextView>(R.id.textViewPremium).text = "Insurance Premium : $price"
                    }
                }else if (findViewById<CheckBox>(R.id.checkBoxSmoker).isChecked){
                    price += 150
                    findViewById<TextView>(R.id.textViewPremium).text = "Insurance Premium : $price"
                }
            }
            "31 to 40" -> {
                var price = 120
                findViewById<TextView>(R.id.textViewPremium).text = "Insurance Premium : $price"
                if (findViewById<RadioGroup>(R.id.radioGroupGender).checkedRadioButtonId == R.id.radioButtonMale){
                    price += 150
                    findViewById<TextView>(R.id.textViewPremium).text = "Insurance Premium : $price"
                    if (findViewById<CheckBox>(R.id.checkBoxSmoker).isChecked){
                        price += 200
                        findViewById<TextView>(R.id.textViewPremium).text = "Insurance Premium : $price"
                    }
                }else if (findViewById<CheckBox>(R.id.checkBoxSmoker).isChecked){
                    price += 200
                    findViewById<TextView>(R.id.textViewPremium).text = "Insurance Premium : $price"
                }
            }
            "41 to 55" -> {
                var price = 150
                findViewById<TextView>(R.id.textViewPremium).text = "Insurance Premium : $price"
                if (findViewById<RadioGroup>(R.id.radioGroupGender).checkedRadioButtonId == R.id.radioButtonMale){
                    price += 200
                    findViewById<TextView>(R.id.textViewPremium).text = "Insurance Premium : $price"
                    if (findViewById<CheckBox>(R.id.checkBoxSmoker).isChecked){
                        price += 250
                        findViewById<TextView>(R.id.textViewPremium).text = "Insurance Premium : $price"
                    }
                }else if (findViewById<CheckBox>(R.id.checkBoxSmoker).isChecked){
                    price += 250
                    findViewById<TextView>(R.id.textViewPremium).text = "Insurance Premium : $price"
                }
            }
            "More than 55" -> {
                var price = 150
                findViewById<TextView>(R.id.textViewPremium).text = "Insurance Premium : $price"
                if (findViewById<RadioGroup>(R.id.radioGroupGender).checkedRadioButtonId == R.id.radioButtonMale){
                    price += 200
                    findViewById<TextView>(R.id.textViewPremium).text = "Insurance Premium : $price"
                    if (findViewById<CheckBox>(R.id.checkBoxSmoker).isChecked){
                        price += 300
                        findViewById<TextView>(R.id.textViewPremium).text = "Insurance Premium : $price"
                    }
                }else if (findViewById<CheckBox>(R.id.checkBoxSmoker).isChecked){
                    price += 300
                    findViewById<TextView>(R.id.textViewPremium).text = "Insurance Premium : $price"
                }
            }
        }
    }

    private fun resetBut () {
        val age : Spinner = findViewById(R.id.spinnerAge)
        val gender : RadioGroup = findViewById(R.id.radioGroupGender)
        val smoker : CheckBox = findViewById(R.id.checkBoxSmoker)
        val prem : TextView = findViewById(R.id.textViewPremium)

        age.setSelection(0)
        gender.clearCheck()
        smoker.isChecked = false
        prem.text = "Insurance Premium : "
    }
}
