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
package com.example.androiddevchallenge.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.green
import com.example.androiddevchallenge.ui.theme.red

sealed class FinancialPosition(
    val amount: String,
    val percent: String,
    val symbol: String,
    val name: String,
    @DrawableRes val graph: Int,
    val color: Color = green
) {
    object ALK : FinancialPosition(
        amount = "$7,918",
        percent = "-0.54%",
        symbol = "ALK",
        name = "Alaska Air Group, Inc.",
        graph = R.drawable.ic_home_alk,
        color = red
    )

    object BA : FinancialPosition(
        amount = "$1,293",
        percent = "4.18%",
        symbol = "BA",
        name = "Boeing Co.",
        graph = R.drawable.home_ba
    )

    object DAL : FinancialPosition(
        amount = "$893.50",
        percent = "-0.54",
        symbol = "DAL",
        name = "Delta Airlines Inc.",
        color = red,
        graph = R.drawable.home_dal
    )

    object EXPE : FinancialPosition(
        amount = "$12,301",
        percent = "+2.51%",
        symbol = "EXPE",
        name = "Expedia Group Inc",
        graph = R.drawable.home_exp
    )

    object EADSY : FinancialPosition(
        amount = "$12,301",
        percent = "+1.38%",
        symbol = "EADSY",
        name = "Airbus SE",
        graph = R.drawable.home_eadsy
    )

    object JBLU : FinancialPosition(
        amount = "$8,521",
        percent = "+1.56",
        symbol = "JBLU",
        name = "Jetblue Airways Corp.",
        graph = R.drawable.home_jblu
    )

    object MAR : FinancialPosition(
        amount = "$521",
        percent = "+2.75",
        symbol = "MAR",
        name = "Marriott International Inc.",
        graph = R.drawable.home_mar
    )

    object CCL : FinancialPosition(
        amount = "$5481",
        percent = "+0.14%",
        symbol = "CCL",
        name = "Carnival Corp",
        graph = R.drawable.home_ccl
    )

    object RCL : FinancialPosition(
        amount = "$9,184",
        percent = "+1.69",
        symbol = "RCL",
        name = "Royal Caribbean Cruises",
        graph = R.drawable.home_rcl
    )

    object TRVL : FinancialPosition(
        amount = "$654",
        percent = "+3.23%",
        symbol = "TRVL",
        name = "Travelocity Inc.",
        graph = R.drawable.home_trvl
    )
}
