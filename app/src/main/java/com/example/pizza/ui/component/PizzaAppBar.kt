package com.example.pizza.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pizza.R

@Composable
fun PizzaAppBar(
    modifier: Modifier = Modifier,

    ) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_arrow_back),
            contentDescription = null,
            tint = Color.Black
        )
        Text(text = "Pizza", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Icon(
            painter = painterResource(id = R.drawable.ic_favorite),
            contentDescription = null,
            tint = Color.Black
        )

    }
}

@Preview(showBackground = true)
@Composable
fun PizzaAppBarPreview() {
    PizzaAppBar()
}