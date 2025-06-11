package com.example.pizza.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.pizza.R
import com.example.pizza.ui.theme.Brawn


@Composable
fun Cart(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(10.dp))
            .background(Brawn),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painterResource(R.drawable.shopping_cart),
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier
                .size(56.dp)
                .padding(start = 20.dp, top = 16.dp, bottom = 16.dp, end = 12.dp)
                .align(Alignment.CenterVertically)
        )

        Text(
            text = "Add to Cart",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .padding(top = 16.dp, bottom = 16.dp, end = 20.dp)
                .align(Alignment.CenterVertically)
        )
    }

}