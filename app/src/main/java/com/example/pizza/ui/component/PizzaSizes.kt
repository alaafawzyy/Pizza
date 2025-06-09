package com.example.pizza.ui.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.unit.dp

@Composable
fun PizzaSizes(
    modifier: Modifier=Modifier,
    text: String,
){
    Card (modifier = Modifier.size(60.dp).clip(CircleShape)){
           Text(text =text, color = Color.Black )
    }

}