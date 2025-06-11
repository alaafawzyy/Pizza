package com.example.pizza

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pizza.ui.component.Cart
import com.example.pizza.ui.component.PizzaAppBar
import com.example.pizza.ui.component.PizzaItems
import com.example.pizza.ui.component.PizzaSizes
import com.example.pizza.ui.component.SousItems
import com.example.pizza.ui.pizzaItem
import com.example.pizza.ui.pizzaSizes
import com.example.pizza.ui.pizzaSous
import com.example.pizza.ui.theme.PizzaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PizzaTheme {
                Column(
                    Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    PizzaItemsContent()

                }
            }
        }
    }
    

    @Composable
    fun PizzaItemsContent() {
        PizzaAppBar()
        PizzaItems(modifier = Modifier.padding(top = 24.dp), pizzaItem)

        Text(
            text = "$17", fontWeight = FontWeight.Bold, fontSize = 30.sp,
            modifier = Modifier.padding(top = 32.dp)
        )
        PizzaSizes(Modifier.padding(top = 24.dp), items = pizzaSizes)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                text = "CUSTOMIZE YOUR PIZZA", fontWeight = FontWeight.Bold, fontSize = 12.sp,
                modifier = Modifier.padding(top = 24.dp), color = Color.Gray,

                )
        }
        SousItems(Modifier.padding(top = 24.dp), items = pizzaSous)
        Cart(Modifier.padding(top = 32.dp))


    }

}
