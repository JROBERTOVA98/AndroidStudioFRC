package mx.edu.itchetumal.myrfcroberto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


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

        //Spinners de los dias
        var spDia = findViewById<Spinner>(R.id.spDia)
        //Acceder a los elementos de dias
        val dias = resources.getStringArray(R.array.Days)
        val adaptador1 = ArrayAdapter(this,android.R.layout.simple_spinner_item, dias)
        spDia.adapter = adaptador1


        //Spinner de los meses
        var spMes = findViewById<Spinner>(R.id.spMes)
        //Accedeer a los elementos de los meses
        val meses = resources.getStringArray(R.array.Mes)
        val adaptador2 = ArrayAdapter(this,android.R.layout.simple_spinner_item,meses)
        spMes.adapter = adaptador2


        //Spinner de los años
        var spAnio = findViewById<Spinner>(R.id.spYear)
        //Acceder a los elementos de los años
        val years = resources.getStringArray(R.array.Year)
        val adaptador3 = ArrayAdapter(this,android.R.layout.simple_spinner_item,years)
        spAnio.adapter = adaptador3


        //Calcular RFC
        btnResult.setOnClickListener {
            var apellidoP = txtApellidoP.text.toString()
            var apellidoM = txtApellidoM.text.toString()
            var nombre = txtNombre.text.toString()
            var dia = spDia.toString()
            var mes = spMes.toString()
            var anio = spAnio.toString()

            var aP = apellidoP[0].toString()
            var aM = apellidoM[0].toString() + apellidoM[1].toString()
            var nm = nombre[0].toString()
            var an1 = anio[2]
            var an2 = anio[3]
            var m = mes
            var d = dia

            var caracteres = aP + aM + nm + an1 + an2 + m + d

            var rfcResut = findViewById<TextView>(R.id.txtRfc)
            rfcResut.text = caracteres

        }


        //Limpiar datos de la pantalla obtener otro RFC
        btnLimp.setOnClickListener {
            txtNombre.setText("")
            txtApellidoP.setText("")
            txtApellidoM.setText("")
        }






    }
}