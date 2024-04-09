package com.mk.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mk.myapplication.ui.theme.MyApplicationTheme

class PageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Page()
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Page() {

    LazyColumn {
        item {


            Column() {


                var area by remember {
                    mutableStateOf(TextFieldValue(" "))
                }
                TextField(
                    value = area, onValueChange = { area = it },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = ""
                        )
                    },
                    label = { Text(text = "Bali, Indonesia") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                    textStyle = androidx.compose.ui.text.TextStyle(Color.White),
                )
            }

            Row {
                val hotel = LocalContext.current
                Button(
                    onClick = {
                        hotel.startActivity(Intent(hotel, CardActivity::class.java))

                    },
                    colors = ButtonDefaults.buttonColors(Color.Green)

                ) {
                    Icon(imageVector = Icons.Default.Home, contentDescription = "")
                    Text(text = "Hotel", color = Color.White)
                }


                Spacer(modifier = Modifier.width(10.dp))

                val rent = LocalContext.current
                Button(
                    onClick = {
                        rent.startActivity(Intent(hotel, CardActivity::class.java))

                    },
                    colors = ButtonDefaults.buttonColors(Color.Green)

                ) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "")
                    Text(text = "Rentals", color = Color.White)
                }


                Spacer(modifier = Modifier.width(10.dp))

                val res = LocalContext.current
                Button(
                    onClick = {
                        res.startActivity(Intent(hotel, CardActivity::class.java))

                    },
                    colors = ButtonDefaults.buttonColors(Color.Green)

                ) {
                    Icon(imageVector = Icons.Default.Home, contentDescription = "")
                    Text(text = "Restaurant", color = Color.White)
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Column() {
                Row {


                    Box {


                        androidx.compose.foundation.Image(
                            painter = painterResource(id = R.drawable.house),
                            contentDescription = "",
                            modifier = Modifier
////        .background(Color.Cyan)
                                //.fillMaxSize()
                                .clip(RoundedCornerShape(10))
                                .size(380.dp),
//
////    colorFilter = ColorFilter.tint(Color.Red),
                            contentScale = ContentScale.Crop
                            //contentScale = ContentScale.FillBounds

                        )

                        Row {


                            val scl = LocalContext.current
                            Button(
                                onClick = {
                                    scl.startActivity(Intent(scl, ScrollActivity::class.java))

                                },

                                colors = ButtonDefaults.buttonColors(Color.Black)

                            ) {
                                Text(text = "Recommended", color = Color.White)
                            }

                            Spacer(modifier = Modifier.width(10.dp))

                            Box(
                                modifier = Modifier,
                            ) {
//            Button(onClick = { /*TODO*/ },
//
//                colors = ButtonDefaults.buttonColors(Color.White)
//
//
//            ) {
//
//            }


                                Icon(
                                    imageVector = Icons.Default.Favorite, contentDescription = "",
                                    modifier = Modifier
                                        .size(45.dp)
                                        .background(Color.White, shape = CircleShape)
                                        .clip(RoundedCornerShape(10))


                                )


                            }

                        }

                    }
                }

                Spacer(modifier = Modifier.height(10.dp))



                Column() {
                    Box {


                        androidx.compose.foundation.Image(
                            painter = painterResource(id = R.drawable.house),
                            contentDescription = "",
                            modifier = Modifier
////        .background(Color.Cyan)
                                //.fillMaxSize()
                                .clip(RoundedCornerShape(10))
                                .size(380.dp)
                                .shadow(20.dp),
////    colorFilter = ColorFilter.tint(Color.Red),
                            contentScale = ContentScale.Crop
                            //contentScale = ContentScale.FillBounds

                        )

                        Row {


                            val scl = LocalContext.current
                            Button(
                                onClick = {
                                    scl.startActivity(Intent(scl, ScrollActivity::class.java))

                                },

                                colors = ButtonDefaults.buttonColors(Color.Black)

                            ) {
                                Text(text = "Recommended", color = Color.White)
                            }

                            Spacer(modifier = Modifier.width(10.dp))

                            Box(
                                modifier = Modifier,
                            ) {
//            Button(onClick = { /*TODO*/ },
//
//                colors = ButtonDefaults.buttonColors(Color.White)
//
//
//            ) {
//
//            }


                                Icon(
                                    imageVector = Icons.Default.Favorite, contentDescription = "",
                                    modifier = Modifier
                                        .size(45.dp)
                                        .background(Color.White, shape = CircleShape)
                                        .clip(RoundedCornerShape(10))


                                )


                            }

                        }

                    }
                }

            }
        }

    }

}