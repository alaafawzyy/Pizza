package com.example.pizza.ui.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pizza.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PizzaAppBar(
    modifier: Modifier = Modifier
) {
    CenterAlignedTopAppBar(
        title = {
            Text(text = "Pizza", fontWeight = FontWeight.Bold, fontSize = 22.sp)
        },
        navigationIcon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_arrow_back),
                contentDescription = null,
                tint = Color.Black
            )
        },
        actions = {
            Icon(
                painter = painterResource(id = R.drawable.ic_favorite),
                contentDescription = null,
                tint = Color.Black
            )
        },
        modifier = modifier.padding(horizontal = 16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun PizzaAppBarPreview() {
    PizzaAppBar()
}