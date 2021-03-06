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
package com.example.androiddevchallenge.screens.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.FinancialPosition

@Composable
fun FinancialPositionRow(financialPosition: FinancialPosition) = Row(
    modifier = Modifier
        .height(56.dp)
        .fillMaxWidth()
        .padding(8.dp)
        .background(color = MaterialTheme.colors.surface),
    verticalAlignment = Alignment.Top
) {
    Column(modifier = Modifier.weight(1f)) {
        Text(
            text = financialPosition.amount,
            color = MaterialTheme.colors.onSurface,
            style = MaterialTheme.typography.body1
        )
        Text(
            text = financialPosition.percent,
            color = financialPosition.color,
            style = MaterialTheme.typography.body1
        )
    }
    Column(modifier = Modifier.weight(2f)) {
        Text(
            text = financialPosition.symbol,
            color = MaterialTheme.colors.onSurface,
            style = MaterialTheme.typography.h3
        )
        Text(
            text = financialPosition.name,
            color = MaterialTheme.colors.onSurface,
            style = MaterialTheme.typography.body1
        )
    }
    Box(modifier = Modifier.weight(1f)) {
        Image(
            painter = painterResource(id = financialPosition.graph),
            contentDescription = financialPosition.symbol
        )
    }
}

@Preview
@Composable
fun FinancialPositionRowPreview() = FinancialPositionRow(financialPosition = FinancialPosition.ALK)
