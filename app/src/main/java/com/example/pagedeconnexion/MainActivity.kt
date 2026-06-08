package com.example.pagedeconnexion

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.app.Activity

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Liaison des composants XML avec le code Kotlin
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        // 2. Écouteur de clic sur le bouton
        btnLogin.setOnClickListener {
            val username = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show()
            } else if ((username == "prof" || username == "eleve") && password == "1234") {
                Toast.makeText(this, "Connexion réussie !", Toast.LENGTH_SHORT).show()

                // L'outil magique pour changer de page s'appelle un Intent
                val intent = android.content.Intent(this, HomeActivity::class.java)
                // On envoie le pseudo ou le rôle à la page suivante
                intent.putExtra("USER_ROLE", username)
                startActivity(intent)
                finish() // Ferme la page de connexion pour qu'on ne puisse pas y retourner avec le bouton retour
            } else {
                Toast.makeText(this, "Identifiants invalides", Toast.LENGTH_SHORT).show()
            }
        }
    }
}