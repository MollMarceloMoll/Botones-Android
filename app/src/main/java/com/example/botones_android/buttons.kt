package com.example.botones_android

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class buttons : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buttons)


        var cgCondiciones = findViewById<ChipGroup>(R.id.cgCondiciones)
        var chip: Chip
        for(i in 0 until cgCondiciones.childCount){
            chip = cgCondiciones.getChildAt(i) as Chip
            chip.textAlignment = View.TEXT_ALIGNMENT_CENTER

            chip.setOnCloseIconClickListener {
                cgCondiciones.removeView(it)
            }
            chip.setOnClickListener{
                var aux = it as Chip
                Toast.makeText(this,"${aux.text} Pulsado", Toast.LENGTH_SHORT).show()
            }
        }
        val chipNew = Chip(this)
        chipNew.text = "Nuevo Chip"
        chipNew.chipIcon = ContextCompat.getDrawable(this,R.drawable.ic_baseline_agriculture_24)
        chipNew.isChipIconVisible = false
        chipNew.isChipIconVisible = true
        chipNew.isClickable = true
        chipNew.isClickable = false

        cgCondiciones.addView(chipNew as View)
        chipNew.setOnCloseIconClickListener { cgCondiciones.removeView(chipNew as View)}
    }
}