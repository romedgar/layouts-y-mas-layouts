package mx.tecnm.ladm_u1_practica1_layoutsymaslayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.tecnm.ladm_u1_practica1_layoutsymaslayouts.databinding.ActivityDestinyBinding
import mx.tecnm.ladm_u1_practica1_layoutsymaslayouts.databinding.ActivityOverwatchBinding

class Destiny : AppCompatActivity() {

    private lateinit var binding: ActivityDestinyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDestinyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.regresar.setOnClickListener {
            this.finish()
        }
    }
}