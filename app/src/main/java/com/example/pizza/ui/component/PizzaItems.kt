package com.example.pizza.ui.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pizza.R


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PizzaItems(
    modifier: Modifier = Modifier,
    items: List<Int>,
) {

    val pagerState = rememberPagerState(pageCount = { items.size })

    Box(modifier = modifier.fillMaxWidth(), contentAlignment = Alignment.Center)
    {
        Image(
            painter = painterResource(id = R.drawable.plate),
            contentDescription = null,
            modifier = Modifier.size(300.dp)
        )


        HorizontalPager(
            state = pagerState,
            verticalAlignment = Alignment.CenterVertically
        ) { page ->

            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center)
            {
                Image(
                    painter = painterResource(id = items[page]),
                    contentDescription = null,
                    modifier = Modifier.size(230.dp)
                )
            }
        }
    }
}

