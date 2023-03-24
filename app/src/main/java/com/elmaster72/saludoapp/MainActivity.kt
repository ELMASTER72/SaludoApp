package com.elmaster72.saludoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val miboton = findViewById<Button>(R.id.send)
        miboton.setOnClickListener{onClick()}
    }

    private fun onClick() {
        val camponombre: EditText = findViewById(R.id.txtnombre)
        val nombre: String = camponombre.text.toString()
        val campodocumento: EditText = findViewById(R.id.txtdocumento)
        val documento: String = campodocumento.text.toString()
        val campodireccion: EditText = findViewById(R.id.txtdireccion)
        val direccion : String = campodireccion.text.toString()
        val campoemail: EditText = findViewById(R.id.txtemail)
        val email: String = campoemail.text.toString()
        val campotelefono: EditText = findViewById(R.id.txttelefono)
        val telefono : String =campotelefono.text.toString()
        val campoedad: EditText = findViewById(R.id.txtedad)
        val edad : String = campoedad.text.toString()

        var texto = "Bienvenido $nombre \n"

        val nombreview : TextView = findViewById(R.id.lblnombre)
        nombreview.text = "Nombre: ${nombre}"
        texto += "Nombre ${nombre} \n"

        val documentoview : TextView = findViewById(R.id.lbldocumento)
        documentoview.text = "Documento: ${documento}"
        texto += "Documento ${documento} \n"

        val direccionview : TextView = findViewById(R.id.lbldireccion)
        direccionview.text = "Direccion: ${direccion}"
        texto += "Direccion ${direccion} \n"

        val emailview : TextView = findViewById(R.id.lblemail)
        emailview.text = "E-mail: ${email} "
        texto += "E-mail ${email} \n"

        val telefonoview : TextView = findViewById(R.id.lbltelefono)
        telefonoview.text = "Telefono: ${telefono}"
        texto += "Telefono ${telefono} \n"


        val edadview : TextView = findViewById(R.id.lbledad)
        edadview.text = "Edad: ${edad}"
        texto += "Edad ${edad} \n"

        val mayorview : TextView = findViewById(R.id.lblmayor)
        var mayor : Int = campoedad.text.toString().toInt()

        if(mayor > 0 && mayor <=  15 ){
            mayorview.text = "Infante"
            texto += "Infante"
        }else if(mayor > 15 && mayor <= 18){
            mayorview.text = "Adolecente"
            texto += "Adolecente"
        }else if(mayor > 18 && mayor <= 65){
            mayorview.text = "Adulto"
            texto += "Adulto"
        }else if(mayor > 65){
            mayorview.text = "Adulto Mayor"
            texto += "Adulto Mayor"
        }

        Toast.makeText(this, "$texto", Toast.LENGTH_SHORT).show()
    }
}