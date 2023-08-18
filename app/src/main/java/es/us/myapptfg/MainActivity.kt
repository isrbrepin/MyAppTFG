package es.us.myapptfg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Puedes realizar acciones con el nuevo FrameLayout aquí
        // Agrega fragmentos, vistas u otros elementos dentro del FrameLayout
    }


    fun openInfoActivity(view: View) {
        val intent = Intent(this, InfoActivity::class.java)
        startActivity(intent)
    }
    fun openPreoperatorioActivity(view: View) {
        val intent = Intent(this, PreoperatorioActivity::class.java)
        startActivity(intent)
    }

}