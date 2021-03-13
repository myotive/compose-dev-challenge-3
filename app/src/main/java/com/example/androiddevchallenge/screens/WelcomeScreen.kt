package com.example.androiddevchallenge.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R

@Composable
fun WelcomeScreen(
    onLogin: () -> Unit = {},
    onSignUp: () -> Unit = {}
) {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {

        Image(
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds,
            painter = painterResource(id = R.drawable.ic_welcome_bg),
            contentDescription = "Welcome Background"
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {

            Image(
                modifier = Modifier.align(alignment = Alignment.Center),
                painter = painterResource(id = R.drawable.ic_logo),
                contentDescription = "We Trade Logo"
            )

            Row(modifier = Modifier.align(alignment = Alignment.BottomCenter)) {

                Button(
                    shape = RoundedCornerShape(18.dp),
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp),
                    onClick = {
                        onSignUp()
                    }) {
                    Text(
                        text = "GET STARTED",
                    )
                }

                OutlinedButton(
                    shape = RoundedCornerShape(18.dp),
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp),
                    border = BorderStroke(1.dp, MaterialTheme.colors.primary),
                    colors = ButtonDefaults.outlinedButtonColors(
                        contentColor = MaterialTheme.colors.primary,
                        backgroundColor = Color.Transparent,
                    ),
                    onClick = {
                        onLogin()
                    }) {
                    Text(
                        text = "LOGIN",
                    )
                }
            }
        }
    }
}


@Composable
@Preview
fun WelcomeScreenPreview() = WelcomeScreen()