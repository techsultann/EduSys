package com.techsultan.edusys.screens



const val ON_BOARDING_ROUTE = "onboarding"
const val ROOT_ROUTE = "root"
const val HOME_ROUTE = "home"
sealed class Screen(val route : String) {

    object OnBoardingScreen : Screen(route = "welcome_screen")
    object HomeScreen : Screen(route = "home_screen")
    object SignupScreen : Screen(route = "signup_screen")
    object LoginScreen : Screen (route = "login_screen")
}