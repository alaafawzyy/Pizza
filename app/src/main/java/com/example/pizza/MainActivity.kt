package com.example.pizza

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pizza.ui.component.PizzaAppBar
import com.example.pizza.ui.component.PizzaItems
import com.example.pizza.ui.component.PizzaSizes
import com.example.pizza.ui.theme.PizzaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PizzaTheme {
                Column (Modifier.fillMaxSize()){
              PizzaItemsContent()

                }
            }
        }
    }
    val list = listOf(
        R.drawable.bread_1, R.drawable.bread_2,
        R.drawable.bread_3, R.drawable.bread_4,
        R.drawable.bread_5
    )
@Composable
     fun PizzaItemsContent() {
       PizzaAppBar()
    PizzaItems(modifier = Modifier.padding(top = 32.dp),list)

    Text(text = "17$", fontWeight = FontWeight.Bold, fontSize = 20.sp,
        modifier = Modifier.padding(top = 32.dp))
    PizzaSizes(text = "L",modifier = Modifier.padding(top = 32.dp))
    PizzaSizes(text = "M",modifier = Modifier.padding(top = 32.dp))
    PizzaSizes(text = "S",modifier = Modifier.padding(top = 32.dp))

}

}
