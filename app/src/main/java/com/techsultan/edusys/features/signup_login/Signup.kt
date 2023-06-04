package com.techsultan.edusys.features.signup_login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.techsultan.edusys.R
import com.techsultan.edusys.components.*
import com.techsultan.edusys.screens.Screen
import com.techsultan.edusys.ui.theme.Shapes


@Composable
fun SignupScreen(navController: NavController) {

    LazyColumn(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()) {

        signupHeader(navController)


    }
}


private fun LazyListScope.signupHeader(navController: NavController) {

    item { 
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
        ) {

            Text(
                text = "Create an account,",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 24.sp
            )
            Spacer(modifier = Modifier.padding(bottom = 12.dp))

            Text(
                text = "Please type full information below and we can create your account",
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.padding(22.dp))

            EduSysTextField(
                value = "Name",
                trailingIcon = {  },
                leadingIcon = {
                    IconButton(onClick = { /*TODO*/ }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Person,
                            contentDescription = "Person icon" )
                    }
                }
            )

            Spacer(modifier = Modifier.padding(16.dp))

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

            EduSysTextField(
                value = "Mobile Number",
                trailingIcon = {  },
                leadingIcon = {
                    IconButton(onClick = { /*TODO*/ }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Phone,
                            contentDescription = "Person icon" )
                    }
                }
            )

            Spacer(modifier = Modifier.padding(16.dp))

            PasswordTextField()

            Spacer(modifier = Modifier.padding(16.dp))

            Text(
                text = "By signing up you agree to our Terms of use and privacy notice",
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.padding(12.dp))
            
            EduSysButton(
                onClick = {
                    navController.popBackStack()
                    navController.navigate(route = Screen.LoginScreen.route)
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Black
                )
            ) {
 
                Text(text = "Join Now")
            }
            Spacer(modifier = Modifier.padding(16.dp))
            
            Row {

                StraightLine()
                
                Text(text = "OR")

                StraightLine()
                
            }
            Spacer(modifier = Modifier.padding(16.dp))

            GoogleButton()

            //Spacer(modifier = Modifier.padding(16.dp))

            Row(
                modifier = Modifier
                    .padding(vertical = 50.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {

                Spacer(modifier = Modifier.padding(8.dp))

                Text(text = "Already have an account?")

                Spacer(modifier = Modifier.padding(3.dp))
                Text(
                    modifier = Modifier.clickable {
                        navController.navigate(route = Screen.LoginScreen.route)
                                                  },
                    text = "Sign in",
                    fontWeight = FontWeight.Bold
                )

            }


        }
    }
}






@Preview
@Composable
fun PreviewSignUpHeader() {
    Column(modifier = Modifier.fillMaxSize()) {
        SignupScreen(navController = rememberNavController()
        )
    }
}