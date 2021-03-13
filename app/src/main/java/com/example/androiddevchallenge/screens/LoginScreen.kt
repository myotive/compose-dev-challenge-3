package com.example.androiddevchallenge.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import timber.log.Timber

@Composable
fun LoginScreen(onLogin: () -> Unit = {}) {

    val emailAddress = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            text = "WELCOME BACK"
        )

        TextField(value = emailAddress.value,
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Email Address") },
            onValueChange = { emailAddress.value = it })

        TextField(value = password.value,
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Password") },
            onValueChange = { password.value = it })

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                Timber.i("Login Button Clicked")
                onLogin()
            }) {
            Text(text = "LOG IN")
        }
    }
}


@Preview
@Composable
fun LoginScreenPreview() = LoginScreen()