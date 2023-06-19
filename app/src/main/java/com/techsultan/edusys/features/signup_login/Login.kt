package com.techsultan.edusys.features.signup_login

import android.text.Layout.Alignment
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.techsultan.edusys.components.*
import com.techsultan.edusys.screens.HOME_ROUTE
import com.techsultan.edusys.screens.Screen


@Composable
fun LoginScreen(navController: NavHostController) {

    LazyColumn(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()) {

        loginHeader(navController)


    }
}


private fun LazyListScope.loginHeader(navController: NavHostController) {

    item {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
        ) {

            Text(
                text = "Welcome Back,",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 24.sp
            )
            Spacer(modifier = Modifier.padding(bottom = 12.dp))

            Text(
                text = "Glad to meet you again!, please login to use the App.",
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.padding(42.dp))

            EduSysTextField(
                value = "Email address",
                trailingIcon = {  },
                leadingIcon = {
                    IconButton(onClick = { /*TODO*/ }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Email,
                            contentDescription = "Person icon" )
                    }
                }
            )

            Spacer(modifier = Modifier.padding(16.dp))

            PasswordTextField()

            Spacer(modifier = Modifier.padding(8.dp))

            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Forgot Password?",
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                textAlign = TextAlign.End
            )
            Spacer(modifier = Modifier.padding(42.dp))

            EduSysButton(
                onClick = {
                    navController.popBackStack()
                    navController.navigate(HOME_ROUTE)
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White)
            ) {

                Text(text = "Sign in")
            }

            Spacer(modifier = Modifier.padding())

            Row(
                modifier = Modifier.padding(vertical = 50.dp),
                horizontalArrangement = Arrangement.End
            ) {
                
                Text(text = "Don't have an account?")
                Text(
                    text = "Join Now",
                    fontWeight = FontWeight.Bold
                )

            }

            Row {

                StraightLine()

                Text(text = "OR")

                StraightLine()

            }

            GoogleButton()

            Row(
                modifier = Modifier
                    .padding(vertical = 50.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {

                Text(text = "Don't have an account?")

                Spacer(modifier = Modifier.padding(3.dp))

                Text(
                    modifier = Modifier.clickable {
                        navController.navigate(route = Screen.SignupScreen.route)
                    },
                    text = "Join now",
                    fontWeight = FontWeight.Bold
                )

            }


        }
    }
}




@Preview
@Composable
fun PreviewLoginHeader() {
    Column(modifier = Modifier.fillMaxSize()) {
        LoginScreen(navController = rememberNavController())
    }
}