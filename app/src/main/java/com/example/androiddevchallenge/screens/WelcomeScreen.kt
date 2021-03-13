package com.example.androiddevchallenge.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import timber.log.Timber

@Composable
fun WelcomeScreen(
    onLogin: () -> Unit = {},
    onSignUp: () -> Unit = {}
) {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Text(
            modifier = Modifier.fillMaxWidth().align(alignment = Alignment.Center),
            textAlign = TextAlign.Center,
            text = "Logo Here"
        )

        Row(
            modifier = Modifier.fillMaxWidth().align(alignment = Alignment.BottomCenter),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Button(
                onClick = {
                    Timber.i("Sign Up Clicked")
                    onSignUp()
                }) {
                Text(text = "SIGN UP")
            }

            Button(
                onClick = {
                    Timber.i("Login Clicked")
                    onLogin()
                }) {
                Text(text = "LOG IN")
            }
        }
    }
}


@Composable
@Preview
fun WelcomeScreenPreview() = WelcomeScreen()