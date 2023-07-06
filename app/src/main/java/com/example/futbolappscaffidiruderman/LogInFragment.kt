package com.example.futbolappscaffidiruderman

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar

class LogInFragment : Fragment() {
    lateinit var v: View
    var ListaUsuarios: MutableList<usuarios> = mutableListOf()


    companion object {
        fun newInstance() = LogInFragment()
    }

    private lateinit var viewModel: LogInViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        v = inflater.inflate(R.layout.fragment_log_in, container, false)

        val botonRegister = v.findViewById<Button>(R.id.Registerboton)
        val botonLogIn = v.findViewById<Button>(R.id.botonLogin)
        val editUser = v.findViewById<EditText>(R.id.inputUser)
        val editPass = v.findViewById<EditText>(R.id.inputPass)


        ListaUsuarios.add(usuarios("Agustín", "Scaffidi", "aguscaffidi", "agus1234"))
        ListaUsuarios.add(usuarios("Manuel", "Ruderman", "manuruder", "manu1234"))
        ListaUsuarios.add(usuarios("Ezequiel", "Rozenblum", "ezeroz", "eze1234"))

        botonLogIn.setOnClickListener {

            val inputUser: String = editUser.text.toString()
            val inputPass: String = editPass.text.toString()

            var usuarioEncontrado: usuarios? = ListaUsuarios.find { u -> u.usuario == inputUser }
            var contraseñaEncontrada: usuarios? =
                ListaUsuarios.find { u -> u.contraseña == inputPass }

            if (usuarioEncontrado != null && usuarioEncontrado.contraseña == inputPass) {

                findNavController().navigate(R.id.action_logInFragment_to_homeFragment)
            } else if (inputUser.isEmpty() || inputPass.isEmpty()) {
                //label.text = inputText
                Snackbar.make(v, "ingrese texto", Snackbar.LENGTH_SHORT).show()
            } else {
                Snackbar.make(v, "Usuario o contraseña incorrectos", Snackbar.LENGTH_SHORT).show()
            }
            botonRegister.setOnClickListener() {
                findNavController().navigate(R.id.action_logInFragment_to_registerFragment)
            }


        }

      return v  }

}
