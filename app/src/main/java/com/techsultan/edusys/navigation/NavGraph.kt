package com.techsultan.edusys.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.techsultan.edusys.features.HomeScreen
import com.techsultan.edusys.features.onboarding.OnBoardingScreen
import com.techsultan.edusys.features.signup_login.LoginScreen
import com.techsultan.edusys.features.signup_login.SignupScreen
import com.techsultan.edusys.screens.Screen


@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.WelcomeScreen.route
    ) {

        composable(route = Screen.WelcomeScreen.route) {
            OnBoardingScreen(navController = navController)
        }

        composable(route = Screen.HomeScreen.route) {
            HomeScreen()
        }
        composable(route = Screen.SignupScreen.route) {
            SignupScreen(navController)
        }
        composable(route = Screen.LoginScreen.route) {
            LoginScreen(navController)
        }
    }
}