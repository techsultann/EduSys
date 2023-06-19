package com.techsultan.edusys.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.techsultan.edusys.features.signup_login.LoginScreen
import com.techsultan.edusys.features.signup_login.SignupScreen
import com.techsultan.edusys.screens.ON_BOARDING_ROUTE
import com.techsultan.edusys.screens.Screen

fun NavGraphBuilder.onBoardingNavGraph(
    navController: NavHostController
) {

    navigation(
        startDestination = Screen.OnBoardingScreen.route,
        route = ON_BOARDING_ROUTE
    ){

        composable(route = Screen.SignupScreen.route) {
            SignupScreen(navController)
        }
        composable(route = Screen.LoginScreen.route) {
            LoginScreen(navController)
        }

    }
}