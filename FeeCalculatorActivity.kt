package com.example.kotlin

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FeeCalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fee_calculator)

        // UI Components
        val checkboxFirstAid: CheckBox = findViewById(R.id.checkboxFirstAid)
        val checkboxSewing: CheckBox = findViewById(R.id.checkboxSewing)
        val checkboxLandscaping: CheckBox = findViewById(R.id.checkboxLandscaping)
        val checkboxCooking: CheckBox = findViewById(R.id.checkboxCooking)
        val calculateFeeButton: Button = findViewById(R.id.calculateFeeButton)
        val discountRateText: TextView = findViewById(R.id.discountRateText)
        val vatText: TextView = findViewById(R.id.vatText)
        val finalFeeText: TextView = findViewById(R.id.finalFeeText)

        calculateFeeButton.setOnClickListener {
            // Calculate total fee
            var totalFee = 0
            if (checkboxFirstAid.isChecked) totalFee += 1500
            if (checkboxSewing.isChecked) totalFee += 1500
            if (checkboxLandscaping.isChecked) totalFee += 1500
            if (checkboxCooking.isChecked) totalFee += 750

            // Calculate discount rate
            val selectedCourses = listOf(
                checkboxFirstAid.isChecked,
                checkboxSewing.isChecked,
                checkboxLandscaping.isChecked,
                checkboxCooking.isChecked
            ).count { it }
            val discountRate = when (selectedCourses) {
                2 -> 5
                3 -> 10
                in 4..Int.MAX_VALUE -> 15
                else -> 0
            }

            // Apply discount and calculate VAT
            val discount = (totalFee * discountRate) / 100
            val discountedFee = totalFee - discount
            val vat = discountedFee * 0.15
            val finalFee = discountedFee + vat

            // Update UI
            discountRateText.text = "Discount: $discountRate%"
            vatText.text = "VAT (15%): R${"%.2f".format(vat)}"
            finalFeeText.text = "Final Fee: R${"%.2f".format(finalFee)}"
        }
    }
}
