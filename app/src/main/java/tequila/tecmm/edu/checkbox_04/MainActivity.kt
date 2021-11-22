package tequila.tecmm.edu.checkbox_04

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {

   lateinit var txt:EditText
   lateinit var hckCursiva:CheckBox
   lateinit var hckNegrita:CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt= findViewById(R.id.edNombre)

    }

    fun clickChek(v:View){
        txt.typeface= Typeface.DEFAULT
        Log.e("CheckBox","Se presiono")
        val checkPresionado:CheckBox= v as CheckBox
        if(checkPresionado.id ==R.id.hckCursiva && checkPresionado.isChecked)
            txt.typeface= Typeface.defaultFromStyle(Typeface.ITALIC)
        else if(checkPresionado.id ==R.id.hckNegrita)
            txt.typeface= Typeface.defaultFromStyle(Typeface.BOLD)
    }
}