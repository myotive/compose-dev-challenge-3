/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.screens.widgets.CurrentBalance
import com.example.androiddevchallenge.screens.widgets.Filters
import com.example.androiddevchallenge.screens.widgets.Graph
import com.example.androiddevchallenge.screens.widgets.HeaderRow
import com.example.androiddevchallenge.screens.widgets.Positions

@Composable
fun HomeScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colors.background),
    ) {
        item {
            HeaderRow()
        }

        item {
            CurrentBalance()
        }

        item {
            Filters()
        }

        item {
            Graph()
        }

        item {
            Positions()
        }
    }
}

@Composable
@Preview
fun HomeScreenPreview() = HomeScreen()
