package mx.tecnm.ladm_u1_practica1_layoutsymaslayouts


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import mx.tecnm.ladm_u1_practica1_layoutsymaslayouts.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonOverwatch.setOnClickListener {
            llamarOw()
        }

        binding.buttonDestiny.setOnClickListener {
            llamarDes()
        }
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun llamarOw(){
        val ventanaOw = Intent(requireContext(),Overwatch::class.java)
        startActivity(ventanaOw);
    }

    private fun llamarDes(){
        val ventanaDes = Intent(requireContext(),Destiny::class.java)
        startActivity(ventanaDes);
    }
}