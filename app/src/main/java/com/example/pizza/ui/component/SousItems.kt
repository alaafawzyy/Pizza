package com.example.pizza.ui.component

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pizza.ui.theme.MintGreen


@Composable
fun SousItems(
    modifier: Modifier = Modifier,
    items: List<Int>,
) {
    var selectedIndex by remember { mutableStateOf(-1) }

    LazyRow {
        items(items.size) { index ->
            SousCard(
                index = index,
                items = items,
                selectedIndex = selectedIndex,
                onClick = { selectedIndex = it }
            )
        }
    }
}

@Composable
fun SousCard(
    index: Int,
    items: List<Int>,
    selectedIndex: Int,
    onClick: (Int) -> Unit,
) {
    val isSelected = selectedIndex == index
    val backGroundColor by animateColorAsState(
    targetValue = if (isSelected) MintGreen else Color.White,)

    Box(
        modifier = Modifier
            .padding(16.dp)
            .clip(CircleShape)
            .background(backGroundColor)
            .clickable {
                onClick(index)
            },
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = items[index]),
            contentDescription = null,
            alignment = Alignment.Center,
            modifier = Modifier
                .padding(5.dp)
                .size(70.dp)
        )
    }
}




