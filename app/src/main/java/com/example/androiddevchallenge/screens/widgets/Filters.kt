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

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.Filter

@Composable
fun Filters() = LazyRow(
    modifier = Modifier
        .fillMaxWidth()
        .offset(x = 10.dp)
        .padding(end = 20.dp)
        .height(40.dp),
    horizontalArrangement = Arrangement.SpaceEvenly,
    content = {
        item {
            OutlinedButton(
                shape = RoundedCornerShape(18.dp),
                modifier = Modifier
                    .height(40.dp)
                    .padding(start = 8.dp),
                border = BorderStroke(1.dp, MaterialTheme.colors.onBackground),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = MaterialTheme.colors.onBackground,
                    backgroundColor = Color.Transparent,
                ),
                onClick = { /*TODO*/ }
            ) {
                Text(
                    text = "Week",
                )

                Image(
                    painter = painterResource(id = R.drawable.ic_expand),
                    contentDescription = "Expand"
                )
            }
        }

        Filter::class.sealedSubclasses.mapNotNull { it.objectInstance }
            .forEach {
                filter ->
                item {
                    OutlinedButton(
                        shape = RoundedCornerShape(18.dp),
                        modifier = Modifier
                            .height(40.dp)
                            .padding(start = 8.dp),
                        border = BorderStroke(1.dp, MaterialTheme.colors.onBackground),
                        colors = ButtonDefaults.outlinedButtonColors(
                            contentColor = MaterialTheme.colors.onBackground,
                            backgroundColor = Color.Transparent,
                        ),
                        onClick = { /*TODO*/ }
                    ) {
                        Text(
                            text = filter.name,
                        )
                    }
                }
            }
    }
)

@Preview
@Composable
fun FiltersPreview() = Filters()
