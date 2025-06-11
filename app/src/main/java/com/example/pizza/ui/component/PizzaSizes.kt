package com.example.pizza.ui.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PizzaSizes(
    modifier: Modifier=Modifier,
    items: List<String>,
) {
    Row(
        modifier = modifier.fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        var isSelected by remember { mutableStateOf("") }
        items.forEach { size ->
            val offset = if (isSelected == size) -10.dp else 0.dp
            val scale = if (isSelected == size) 1.2f else 1f
            val elevation = if (isSelected == size) 50.dp else 0.dp

            Box(
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .size(60.dp)
                    .offset(y = offset)
                    .scale(scale)
                    .shadow(
                        elevation = elevation,
                        shape = CircleShape,
                        ambientColor = Color.Gray,
                        spotColor = Color.Gray
                    ),
                contentAlignment = Alignment.Center
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxSize(0.9f)
                        .clip(CircleShape)
                        .clickable { isSelected = size },
                    colors = CardDefaults.cardColors(Color.White),
                    elevation = CardDefaults.cardElevation(0.dp)
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = size,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }} }
}
