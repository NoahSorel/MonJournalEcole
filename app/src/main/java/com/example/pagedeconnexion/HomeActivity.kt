package com.example.pagedeconnexion // Vérifie bien que c'est le nom de ton package exact !

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class HomeActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val tvWelcomeRole = findViewById<TextView>(R.id.tvWelcomeRole)

        // Récupérer le rôle envoyé par la page de connexion
        val role = intent.getStringExtra("USER_ROLE")

        // Adapter le message d'accueil selon le rôle
        if (role == "prof") {
            tvWelcomeRole.text = "Journal École Direct - Espace Enseignant"
        } else if (role == "eleve") {
            tvWelcomeRole.text = "Journal École Direct - Espace Étudiant"
        }
    }
}