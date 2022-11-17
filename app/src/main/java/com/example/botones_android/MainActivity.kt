package com.example.botones_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
    }


    }
