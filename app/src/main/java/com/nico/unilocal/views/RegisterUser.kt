package com.nico.unilocal.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import com.google.android.material.button.MaterialButton
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.nico.unilocal.R

class RegisterUser : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)

        val textName = findViewById<EditText>(R.id.editText_name)
        val textEmail = findViewById<EditText>(R.id.editText_eamil)
        val textPassword = findViewById<EditText>(R.id.editText_password)

        val checkboxIsModerator = findViewById<CheckBox>(R.id.checkbox_moderador)

        val registerUserButton = findViewById<MaterialButton>(R.id.register_button)

        // evento de registrar un usuario
        registerUserButton.setOnClickListener {
            // validar si se ingreso data
            if (textName.text.isNotEmpty() && textEmail.text.isNotEmpty() && textPassword.text.isNotEmpty()){
                // nada esta vacio podemos proseguir
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(textEmail.text.toString(), textPassword.text.toString()).addOnCompleteListener {
                    if (it.isSuccessful){
                        // cosas que se haran despues de crear la cuenta
                        // crear el documento con esta cuenta.
                        db.collection("user").document(textEmail.text.toString()).set(
                            hashMapOf("name" to textName.text.toString())
                        )


                    } else {
                        // error al momento de crear una cuenta
                    }
                }
            }
        }


    }
}