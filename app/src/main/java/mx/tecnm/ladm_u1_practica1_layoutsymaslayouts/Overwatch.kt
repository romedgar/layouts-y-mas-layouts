package mx.tecnm.ladm_u1_practica1_layoutsymaslayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.tecnm.ladm_u1_practica1_layoutsymaslayouts.databinding.ActivityOverwatchBinding
import mx.tecnm.ladm_u1_practica1_layoutsymaslayouts.databinding.FragmentSecondBinding

class Overwatch : AppCompatActivity() {

    private lateinit var binding: ActivityOverwatchBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOverwatchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.regresar.setOnClickListener {
            this.finish()
        }
    }
}