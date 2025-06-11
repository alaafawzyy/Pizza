package com.example.pizza.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun PizzaSousIngredientsView(
    visibleIngredients: List<Int>
) {
    val screenWidth = LocalConfiguration.current.screenWidthDp
    val landingSpec = spring<Float>(
        dampingRatio = Spring.DampingRatioNoBouncy,
        stiffness = Spring.StiffnessMedium
    )

    val exitSpec = spring<Float>(stiffness = Spring.StiffnessHigh)

    Box(
        contentAlignment = Alignment.Center
    ) {
        pizzaToppingsGroup.forEach { ingredientResourceId ->
            val isIngredientVisible = visibleIngredients.contains(ingredientResourceId)

            AnimatedVisibility(
                visible = isIngredientVisible,
                enter = scaleIn(
                    initialScale = 8.0f,
                    animationSpec = landingSpec,
                    transformOrigin = TransformOrigin.Center
                ),
                exit = scaleOut(
                    targetScale = 0.5f,
                    animationSpec = exitSpec
                )
            ) {
                Image(
                    painter = painterResource(id = ingredientResourceId),
                    contentDescription = "Pizza Sous Ingredient",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size((screenWidth * 0.35).dp)
                )
            }
        }
    }
}