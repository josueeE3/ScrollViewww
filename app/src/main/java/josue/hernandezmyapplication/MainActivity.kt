package josue.hernandezmyapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtEdad = findViewById<EditText>(R.id.editTextNumber5)
        val btnGuardar = findViewById<Button>(R.id.button2)

        btnGuardar.setOnClickListener {

            if(txtEdad.text.toString().isEmpty()){
                Toast.makeText(this, "Ingrese su edad", Toast.LENGTH_SHORT).show()
            }
            if (txtEdad.text.toString().toInt() <= 0 && txtEdad.toString().toInt() >= 110){
                Toast.makeText(this, "Ingrese una edad valida", Toast.LENGTH_SHORT).show()
            }
            if (txtEdad.toString().matches(Regex("[0-9]+"))){
                Toast.makeText(this, "Ingrese una edad valida", Toast.LENGTH_SHORT).show()
            }
        }
    }
}