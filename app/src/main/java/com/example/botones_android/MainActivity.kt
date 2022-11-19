package com.example.botones_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a: buttons = buttons()


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
        var destinos = findViewById<RadioGroup>(R.id.destinos)
        var aA = destinos.getChildAt(1) as RadioButton
        destinos.check(aA.id)


    }
    fun onRadioButtonClicked(view: View){
        //if (view is RadioButton) {
            //var checked = view.isChecked

            when (view.id) {
                R.id.radioButton1 -> {
                    /*if (checked)*/ Toast.makeText(this,"Radio Button One",Toast.LENGTH_SHORT).show()
                }
                R.id.radioButton2 -> {
                    /*if (checked)*/ Toast.makeText(this,"Radio Button Two",Toast.LENGTH_SHORT).show()
                }
                R.id.radioButton3 -> {
                    /*if (checked)*/ Toast.makeText(this,"Radio Button Three",Toast.LENGTH_SHORT).show()
                }
                R.id.radioButton4 -> {
                   /* if (checked)*/ Toast.makeText(this,"Radio Button Four",Toast.LENGTH_SHORT).show()
                }
                R.id.radioButton5 -> {
                   /* if (checked)*/ Toast.makeText(this,"Radio Button Five",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }


    //}
