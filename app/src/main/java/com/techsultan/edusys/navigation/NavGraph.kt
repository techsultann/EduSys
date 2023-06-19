package com.techsultan.edusys.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.techsultan.edusys.screens.ON_BOARDING_ROUTE
import com.techsultan.edusys.screens.ROOT_ROUTE
import com.techsultan.edusys.screens.Screen


@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = ON_BOARDING_ROUTE,
        route = ROOT_ROUTE
    ) {

        onBoardingNavGraph(navController)
        homeNavGraph(navController)

    }
}