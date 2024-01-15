package com.example.foodorderingapp.AppScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodorderingapp.R
import com.example.foodorderingapp.modelClass.BurgerDetailClass

@Composable
fun GridLazy(burgerDetailClass: BurgerDetailClass) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        ) {

            IconButton(
                modifier = Modifier
                    .size(28.dp)
                    .align(alignment = Alignment.End),
                onClick = {

                }
            ) {
                Icon(
                    painterResource(id = R.drawable.star),
                    "contentDescription",
                )
            }
            Card(
                modifier = Modifier
                    .size(150.dp)
                    .align(alignment = Alignment.CenterHorizontally),
                shape = RoundedCornerShape(10)
            ) {
                Image(
                    painter = painterResource(
                        id = burgerDetailClass.image
                    ),
                    contentDescription = "Food",
                )

            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "${burgerDetailClass?.itemDetail}",
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif,
                fontSize = 22.sp,
                color = Color.Black
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "20min",
                    modifier = Modifier.weight(2f).padding(start=20.dp),
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif,
                    fontSize = 18.sp,
                    color = Color.Black
                )
                Text(
                    text = "4.5",
                    modifier = Modifier.weight(2f).padding(start=30.dp),
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif,
                    fontSize = 18.sp,
                    color = Color.Black
                )
            }
            Row {
                Text(
                    text = "$${burgerDetailClass.price}",
                    modifier = Modifier.weight(2f).padding(start=30.dp),
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif,
                    fontSize = 18.sp,
                    color = Color.Black,

                )
                Text(
                    text = "4.5",
                    modifier = Modifier.weight(2f).padding(start=30.dp),
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif,
                    fontSize = 18.sp,
                    color = Color.Black
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun default() {
    val burgerDetailClass = BurgerDetailClass(
         image = R.drawable.burger
        ,
        itemDetail = "Cheese Burger"
        ,"12.00"
    )
    GridLazy(burgerDetailClass)
}