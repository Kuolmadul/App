package com.mk.myapplication

import android.content.Intent
import android.os.Bundle
import android.text.Layout.Alignment
import android.text.style.IconMarginSpan
import android.util.AndroidException
import android.util.Size
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
//import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mk.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.material3.Icon as Icon1
import androidx.compose.material3.Icon as Icon

class AssigmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assg()
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Assg() {

    LazyColumn {
        item {

            Row {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "")

                Spacer(modifier = Modifier.width(100.dp))
                Column {
                    Text(text = "Location")
                    Row {
                        Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                    }
                }


                Spacer(modifier = Modifier.width(110.dp))
                Column {
                    Row(
                        modifier = Modifier
                            .size(20.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.far),
                            contentDescription = ""
                        )


                    }

                }
            }
            Spacer(modifier = Modifier.height(20.dp))



            Row (modifier=Modifier
                .padding(10.dp)

            ){
                Row {
                    Icon(imageVector = Icons.Default.Home, contentDescription = "")
                    Text(text = "Hotels")
                }

                Spacer(modifier = Modifier.width(160.dp))
                Row {
                    Icon(imageVector = Icons.Default.Home, contentDescription = "")
                    Text(text = "Holiday")
                }
            }

            Spacer(modifier = Modifier.height(10.dp))


            Row (modifier=Modifier.padding(10.dp)){
                Row {
                    Icon(imageVector = Icons.Default.Star, contentDescription = "")
                    Text(text = "Taxi")
                }

                Spacer(modifier = Modifier.width(180.dp))
                Row (){
                    Icon(imageVector = Icons.Default.Email, contentDescription = "")
                    Text(text = "Ticket")
                }
            }

            Spacer(modifier = Modifier.height(10.dp))


            Row(modifier=Modifier.padding(10.dp)) {
                Row {
                    Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                    Text(text = "Airplane")
                }

                Spacer(modifier = Modifier.width(150.dp))
                Row {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "")
                    Text(text = "Harbour")
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
Row {
Row {
    Text(text = "Popular in town",modifier=Modifier.padding(10.dp))
}
    Spacer(modifier = Modifier.width(120.dp))
    
    Row {

    }
    val va = AnnotatedString("view all",
        spanStyle = SpanStyle(Color.Cyan)
    )
    val vb = LocalContext.current
    ClickableText(text = va, onClick = {vb.startActivity(Intent(vb,MainActivity::class.java))})


}
            Spacer(modifier = Modifier.height(20.dp))





            Row(modifier = Modifier.padding(20.dp)) {

                   Column {

                       Image(
                           painter = painterResource(id = R.drawable.pic),
                           contentDescription = null
                       )
                       Row {
                         
                           Icon(imageVector = Icons.Default.Home, contentDescription = "")
                           Spacer(modifier = Modifier.width(3.dp))
                           Text(text = "Nusa Penida")
                       }

                   }

                Spacer(modifier = Modifier.width(100.dp))


                Column {
                    Image(painter = painterResource(id = R.drawable.pic), contentDescription = null)
Row {
    Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
    Spacer(modifier = Modifier.width(3.dp))
    Text(text = "Tanah Lot")
}
                }
            }



            Row(modifier = Modifier.padding(20.dp)) {

                Column {

                    Image(
                        painter = painterResource(id = R.drawable.pic),
                        contentDescription = null
                    )
                   Row {
                       Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                       Spacer(modifier = Modifier.width(3.dp))
                       Text(text = "Nusa Penida")

                   }

                }

                Spacer(modifier = Modifier.width(100.dp))


                Column {
                    Image(painter = painterResource(id = R.drawable.pic), contentDescription = null)


Row {
    Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
    Spacer(modifier = Modifier.width(3.dp))
    Text(text = "Nusa Penida")

}

                }
            }

Row {


    Spacer(modifier = Modifier.height(20.dp))

    Column {
        Row (modifier=Modifier.background(Color.Black)){
            var search by remember {
                mutableStateOf(TextFieldValue(" "))
            }
            OutlinedTextField(value = search,
                onValueChange = {search = it },
                leadingIcon = { Icon(imageVector =Icons.Default.Search , contentDescription = "")},
                label={ Text(text = "Search your place")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                textStyle = androidx.compose.ui.text.TextStyle(Color.White),
//                colors=TextFieldDefaults.outlinedTextFieldColors(
//                    focusedBorderColor = Color.Green,
//                    unfocusedBorderColor = Color.Red,
//                    focusedLabelColor = Color.Green,
//                    cursorColor = Color.Green,
//                    unfocusedLabelColor = Color.Red,
//                    unfocusedLeadingIconColor = Color.Red,
//                    unfocusedTextColor = Color.White,
//                    focusedTextColor = Color.Green,
//
//
//                    ),


                )
        }


        Row {

            Icon(imageVector = Icons.Default.Home, contentDescription = "")
            Spacer(modifier = Modifier.width(80.dp))
            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
            Spacer(modifier = Modifier.width(80.dp))
            Icon(imageVector = Icons.Default.Favorite, contentDescription = "")
            Spacer(modifier = Modifier.width(80.dp))
            Icon(imageVector = Icons.Default.Settings, contentDescription = "")

        }
        Spacer(modifier = Modifier.height(20.dp))



}
}

            val va = AnnotatedString("Next page",
                spanStyle = SpanStyle(Color.Cyan)
            )
            val vb = LocalContext.current
            ClickableText(text = va, onClick = {vb.startActivity(Intent(vb,MainActivity::class.java))})

Spacer(modifier = Modifier.height(10.dp))

            val vc = AnnotatedString("Next page",
                spanStyle = SpanStyle(Color.Cyan)
            )
            val vd = LocalContext.current
            ClickableText(text = vc, onClick = {vd.startActivity(Intent(vb,LoginActivity::class.java))})


        }
    }
}










    
    
    
