package com.example.androiddevchallenge.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import timber.log.Timber

@Composable
fun LoginScreen(onLogin: () -> Unit = {}) {

    val emailAddress = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.surface)
    ) {

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {

                Image(
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds,
                    painter = painterResource(id = R.drawable.ic_login_bg),
                    contentDescription = null
                )

                Text(
                    modifier = Modifier
                        .width(300.dp)
                        .align(Alignment.Center),
                    text = "WELCOME BACK",
                    color = MaterialTheme.colors.onBackground,
                    style = MaterialTheme.typography.h2,
                    textAlign = TextAlign.Center
                )

            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .weight(1f)
            ) {

                TextField(value = emailAddress.value,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    label = {
                        Text(
                            text = "Email Address", color = MaterialTheme.colors.onSurface,
                            style = MaterialTheme.typography.body1,
                        )
                    },
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.ic_email),
                            contentDescription = "Email Address",
                            colorFilter = ColorFilter.tint(MaterialTheme.colors.onSurface)
                        )
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color.Transparent,
                        textColor = MaterialTheme.colors.onSurface,
                        focusedIndicatorColor = MaterialTheme.colors.onSurface,
                        cursorColor = MaterialTheme.colors.onSurface,
                    ),
                    onValueChange = { emailAddress.value = it })

                Spacer(modifier = Modifier.height(8.dp))

                TextField(value = password.value,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    label = {
                        Text(
                            text = "Password",
                            color = MaterialTheme.colors.onSurface,
                            style = MaterialTheme.typography.body1,
                        )
                    },
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.ic_password),
                            contentDescription = "Password",
                            colorFilter = ColorFilter.tint(MaterialTheme.colors.onSurface)
                        )
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color.Transparent,
                        textColor = MaterialTheme.colors.onSurface,
                        focusedIndicatorColor = MaterialTheme.colors.onSurface,
                        cursorColor = MaterialTheme.colors.onSurface,
                    ),
                    onValueChange = { password.value = it })

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    shape = RoundedCornerShape(18.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp),
                    onClick = {
                        Timber.i("Login Button Clicked")
                        onLogin()
                    }) {
                    Text(text = "LOG IN")
                }
            }


        }
    }
}


@Preview
@Composable
fun LoginScreenPreview() = LoginScreen()