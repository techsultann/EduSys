package com.techsultan.edusys.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.techsultan.edusys.R

@Composable
fun PasswordTextField(

    modifier: Modifier = Modifier
) {
    var password by rememberSaveable { mutableStateOf("") }
    var passwordHidden by rememberSaveable { mutableStateOf(true) }

    val icon = if (passwordHidden)
        painterResource(id = R.drawable.baseline_visibility)
    else
        painterResource(id = R.drawable.baseline_visibility_off)

    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = password,
        onValueChange = { password = it },
        singleLine = true,
        label = { Text("Enter password") },
        leadingIcon = {
            IconButton(onClick = { /*TODO*/ }) {

                Icon(
                    imageVector = Icons.Filled.Lock,
                    contentDescription = "Person icon" )
            }
        },
        trailingIcon = {
                       IconButton(
                           onClick = { passwordHidden = !passwordHidden
                       }) {
                           
                           Icon(
                               painter = icon,
                               contentDescription = "Visibility icon")

                       }
        },
        visualTransformation =
        if (passwordHidden) PasswordVisualTransformation() else VisualTransformation.None,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),

    )
}

