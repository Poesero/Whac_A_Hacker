package com.whac_a_hacker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TableRow

class GameActivity : AppCompatActivity() {

    private var currentPosition = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
    }
    //Recorre las 4 posiciones a medida que escribe lo el numero del jugador
    fun btnClick(view: View) {
        val btnSelected = view as Button
        Log.i("ButtonClicked", "Button ${btnSelected.text} was pressed")
        val tableRow = findViewById<TableRow>(R.id.display)
        currentPosition = (currentPosition + 1) % tableRow.childCount
        Log.i("Position", "$currentPosition")
        val currentCell = tableRow.getChildAt(currentPosition) as ImageView
        insertPlayersNumber(currentCell, btnSelected)

    }


    //Remplaza el valor de la posición actual con el valor del numero presionado
    private fun insertPlayersNumber(currentCell:ImageView, btnSelected:Button){
            when(btnSelected.id) {
                R.id.btn_1 -> currentCell.setImageResource(R.drawable.cell_1)
                R.id.btn_2 -> currentCell.setImageResource(R.drawable.cell_2)
                R.id.btn_3 -> currentCell.setImageResource(R.drawable.cell_3)
                R.id.btn_4 -> currentCell.setImageResource(R.drawable.cell_4)
                R.id.btn_5 -> currentCell.setImageResource(R.drawable.cell_5)
                R.id.btn_6 -> currentCell.setImageResource(R.drawable.cell_6)
                R.id.btn_7 -> currentCell.setImageResource(R.drawable.cell_7)
                R.id.btn_8 -> currentCell.setImageResource(R.drawable.cell_8)
                R.id.btn_9 -> currentCell.setImageResource(R.drawable.cell_9)
                R.id.btn_0 -> currentCell.setImageResource(R.drawable.cell_0)
            }
    }

}