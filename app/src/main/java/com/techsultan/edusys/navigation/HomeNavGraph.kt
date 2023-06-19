package com.techsultan.edusys.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.techsultan.edusys.features.HomeScreen
import com.techsultan.edusys.features.onboarding.OnBoardingScreen
import com.techsultan.edusys.screens.HOME_ROUTE
import com.techsultan.edusys.screens.Screen

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
) {

    navigation(
        startDestination = Screen.HomeScreen.route,
        route = HOME_ROUTE
    ){

        composable(route = Screen.HomeScreen.route) {
            HomeScreen()
        }
    }

}