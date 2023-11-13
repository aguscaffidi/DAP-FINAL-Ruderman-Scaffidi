package com.example.futbolappscaffidiruderman

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.activityViewModels
import com.google.android.material.snackbar.Snackbar

class RegisterFragment : Fragment() {
    lateinit var v: View
    val SharedViewModel : SharedViewModel by activityViewModels()

    companion object {
        fun newInstance() = RegisterFragment()
    }

    private lateinit var viewModel: RegisterViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        v = inflater.inflate(R.layout.fragment_register, container, false)

        val buttonRegister =v.findViewById<Button>(R.id.botonregistro)
        val registroNombre = v.findViewById<EditText>(R.id.registroNombre)
        val registroApellido = v.findViewById<EditText>(R.id.registroApellido)
        val registroUsuario = v.findViewById<EditText>(R.id.registroUsuario)
        val registroContraseña = v.findViewById<EditText>(R.id.registroContraseña)

        buttonRegister.setOnClickListener {

            val inputNombre: String = registroNombre.text.toString()
            val inputApellido: String = registroApellido.text.toString()
            val inputUsuario: String = registroUsuario.text.toString()
            val inputContraseña: String = registroContraseña.text.toString()

            var userEncontrado: usuarios? = SharedViewModel.ListaUsuarios.find { u -> u.usuario == inputUsuario }
            var passEncontrada: usuarios? =
                SharedViewModel.ListaUsuarios.find { u -> u.contraseña == inputContraseña }

            if (!inputNombre.isEmpty() && !inputApellido.isEmpty() && !inputUsuario.isEmpty() && !inputContraseña.isEmpty()) {
                if (userEncontrado == null && passEncontrada == null) {
                    SharedViewModel.ListaUsuarios.add(
                        usuarios(
                            inputNombre,
                            inputApellido,
                            inputUsuario,
                            inputContraseña
                        )
                    )
                    Snackbar.make(v, "Usuario Creado exitosamente", Snackbar.LENGTH_SHORT).show()
                } else if (userEncontrado != null || passEncontrada != null) {
                    Snackbar.make(v, "Usuario o contraseñaya existente", Snackbar.LENGTH_SHORT)
                        .show()
                }
            } else if (inputNombre.isEmpty() || inputApellido.isEmpty() || inputUsuario.isEmpty() || inputContraseña.isEmpty()) {

                Snackbar.make(it, "ingrese texto", Snackbar.LENGTH_SHORT).show()
            }

        }

        return v }

}