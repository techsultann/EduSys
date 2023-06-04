package com.techsultan.edusys.screens

sealed class Screen(val route : String) {

    object WelcomeScreen : Screen(route = "welcome_screen")
    object HomeScreen : Screen(route = "home_screen")
    object SignupScreen : Screen(route = "signup_screen")
    object LoginScreen : Screen (route = "login_screen")
}