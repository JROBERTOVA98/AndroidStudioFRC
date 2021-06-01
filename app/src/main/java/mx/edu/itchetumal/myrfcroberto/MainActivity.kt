package mx.edu.itchetumal.myrfcroberto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Entradas de texto
        var txtNombre = findViewById<EditText>(R.id.txtName)
        var txtApellidoP = findViewById<EditText>(R.id.txtApe1)
        var txtApellidoM = findViewById<EditText>(R.id.txtApe2)

        //Botones
        var btnResult = findViewById<Button>(R.id.btnCalcular)
        var btnLimp = findViewById<Button>(R.id.btnLimpiar)

        //Spinners
        var spDia = findViewById<Spinner>(R.id.spDia)
        //Acceder a los elementos de dias
        val dias = resources.getStringArray(R.array.Days)

        val adaptador1 = ArrayAdapter(this,android.R.layout.simple_spinner_item, dias)
        spDia.adapter = adaptador1

        var spMes = findViewById<Spinner>(R.id.spMes)
        //Accedeer a los elementos de los meses
        val meses = resources.getStringArray(R.array.Mes)
        val adaptador2 = ArrayAdapter(this,android.R.layout.simple_spinner_item,meses)
        spMes.adapter = adaptador2


        var spAnio = findViewById<Spinner>(R.id.spYear)





    }
}