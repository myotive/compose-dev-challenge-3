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

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.FinancialPosition

@Composable
fun Positions() = Column {

    Box(
        modifier = Modifier
            .height(64.dp)
            .fillMaxWidth()
            .background(MaterialTheme.colors.surface)
    ) {
        Text(
            "Positions",
            color = MaterialTheme.colors.onSurface,
            style = MaterialTheme.typography.subtitle1,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.Center),
        )
    }

    Column(
        modifier = Modifier.background(color = MaterialTheme.colors.surface),
        content = {

            Divider()

            FinancialPosition::class.sealedSubclasses.mapNotNull { it.objectInstance }
                .forEach { financialPosition ->
                    FinancialPositionRow(financialPosition = financialPosition)
                }

            Divider()
        }
    )
}

@Preview
@Composable
fun PositionsPreview() = Positions()
