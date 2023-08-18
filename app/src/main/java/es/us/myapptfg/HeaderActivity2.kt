package es.us.myapptfg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class HeaderActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_header2)

        val btnFlecha = findViewById<ImageButton>(R.id.btn_flecha_atras)
        btnFlecha.setOnClickListener {
            // Llamamos al método onBackPressed para simular el botón de retroceso
            finish()
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }

    }

}