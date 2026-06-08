# Mon Journal d’École Direct 📱 Clé en main - Prototype Mobile

## 📝 Présentation du Projet
Dans le cadre d'un devoir scolaire, **Mon Journal d’École Direct** est une application mobile Android développée en **Kotlin**. L'objectif principal est de centraliser et de fluidifier la communication au sein d'un établissement scolaire en permettant aux différents acteurs (Élèves, Délégués, Professeurs) de consulter, d'ajouter et de suivre les flux d'informations importants.

### 🎯 Objectifs Généraux
* **Centralisation :** Regrouper au même endroit les annonces globales, les alertes de retards/absences, les réunions, les sorties et les offres de stages.
* **Ciblage par Rôle :** Proposer une expérience et des droits d'accès adaptés selon le profil connecté.
* **Suivi en temps réel :** Permettre une consultation rapide du journal de l'établissement.

---

## 🚀 Fonctionnalités Actuelles (Livrables de ce soir)

L'architecture de base et le cycle d'authentification principal sont entièrement fonctionnels :
1. **Écran de Connexion (Login Screen) :** Interface utilisateur épurée permettant la saisie d'un identifiant et d'un mot de passe avec gestion dynamique des erreurs (champs vides, identifiants incorrects).
2. **Système d'Authentification simulé (Rôles) :**
   * Compte Enseignant : `prof` / `1234`
   * Compte Étudiant : `eleve` / `1234`
3. **Redirection Intelligente (Intent UI) :** Transition fluide vers la page d'accueil avec personnalisation dynamique du titre du Journal selon le rôle de l'utilisateur détecté.
4. **Fils d'Annonces Types :** Affichage d'un flux de démonstration catégorisé par couleur (Urgences, Vie Scolaire, Professionnel).

---

## 🛠️ Technologies Utilisées
* **Langage :** Kotlin 
* **Interface Graphique :** XML (Layouts classiques / `LinearLayout`, `ScrollView`)
* **IDE :** Android Studio
* **Gestionnaire de versions :** Git & GitHub

---

## 📁 Structure Principale du Projet

```text
app/
└── src/
    └── main/
        ├── java/com/example/pagedeconnexion/
        │   ├── MainActivity.kt   # Logique de connexion et routage
        │   └── HomeActivity.kt   # Logique du journal et accueil dynamique
        └── res/
            ├── layout/
            │   ├── activity_main.xml # Interface de l'écran de login
            │   └── activity_home.xml # Interface du fil d'actualités
            └── values/           # Styles, couleurs et chaînes de caractères
