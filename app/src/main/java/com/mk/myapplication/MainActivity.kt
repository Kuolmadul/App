package com.mk.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mk.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           
                    Greeting()
                }
            }
        }


@Preview(showBackground = true)
@Composable
fun Greeting() {

Box {
    Image(painter = painterResource(id = R.drawable.pic), contentDescription = "",
        modifier= Modifier
////        .background(Color.Cyan)
            .fillMaxSize()
////                .clip(RoundedCornerShape(50))
            .size(200.dp),
//
////    colorFilter = ColorFilter.tint(Color.Red),
        contentScale= ContentScale.Crop
        //contentScale = ContentScale.FillBounds

    )


}
LazyColumn {

    item {

        Text(
            text = "Hello this is my first App", color = Color.Cyan, fontSize = 25.sp, fontFamily = FontFamily.Monospace
        )

        Spacer(modifier = Modifier.height(40.dp))

        Row {


            val image = LocalContext.current
            Button(
                onClick = {
                    image.startActivity(Intent(image, PichaActivity2::class.java))

                },
                colors = ButtonDefaults.buttonColors(Color.Green)

            ) {
                Text(text = "Picture", color = Color.Black)
            }


            Spacer(modifier = Modifier.width(10.dp))

            val inp = LocalContext.current
            Button(
                onClick = {
                    inp.startActivity(Intent(inp, InputActivity2::class.java))

                },
                colors = ButtonDefaults.buttonColors(Color.Green)

            ) {
                Text(text = "Input page", color = Color.Black)
            }
            Spacer(modifier = Modifier.width(10.dp))

            val log = LocalContext.current

            Button(
                onClick = {
                    log.startActivity(Intent(log, LoginActivity::class.java))

                },
                colors = ButtonDefaults.buttonColors(Color.Green)

            ) {
                Text(text = "Login Page", color = Color.Black)
            }
        }


        Spacer(modifier = Modifier.height(40.dp))



        Column {


            Row {
                val scl = LocalContext.current
                Button(
                    onClick = {
                        scl.startActivity(Intent(scl, ScrollActivity::class.java))

                    },
                    colors = ButtonDefaults.buttonColors(Color.Green)

                ) {
                    Text(text = "Scroll page", color = Color.Black)
                }



                Spacer(modifier = Modifier.width(10.dp))


                val card = LocalContext.current
                Button(
                    onClick = {
                        card.startActivity(Intent(card, CardActivity::class.java))

                    },
                    colors = ButtonDefaults.buttonColors(Color.Green)

                ) {
                    Text(text = "Card page", color = Color.Black)
                }
                Spacer(modifier = Modifier.width(10.dp))

                val grid = LocalContext.current
                Button(
                    onClick = {
                        grid.startActivity(Intent(grid, GridActivity::class.java))

                    },
                    colors = ButtonDefaults.buttonColors(Color.Green)

                ) {
                    Text(text = "Grid page", color = Color.Black)
                }
            }


            Spacer(modifier = Modifier.height(30.dp))

            Column {


                Row(
                    modifier = Modifier
                        //.background(Color.Cyan)
                        .fillMaxSize()
                        .padding(10.dp),


                    // horizontalAlignment = Alignment.CenterHorizontally


                ) {

                    val assg = LocalContext.current
                    Button(
                        onClick = {
                            assg.startActivity(Intent(assg, AssigmentActivity::class.java))

                        },
                        colors = ButtonDefaults.buttonColors(Color.Green)

                    ) {
                        Text(text = "assg page", color = Color.Black)
                    }

                    Spacer(modifier = Modifier.width(10.dp))

                    val click = LocalContext.current
                    Button(
                        onClick = {
                            click.startActivity(Intent(click, ClickableimageActivity2::class.java))

                        },
                        colors = ButtonDefaults.buttonColors(Color.Green)

                    ) {
                        Text(text = "Select image ", color = Color.Black)
                    }
                    Spacer(modifier = Modifier.width(5.dp))

                    val web = LocalContext.current
                    Button(
                        onClick = {
                            web.startActivity(Intent(web, WebActivity::class.java))

                        },
                        colors = ButtonDefaults.buttonColors(Color.Green)

                    ) {
                        Text(text = "Web", color = Color.Black)
                    }
                }

                Row(
                    modifier = Modifier
                        //.background(Color.Cyan)
                        .fillMaxSize()
                        .padding(10.dp),


                    // horizontalAlignment = Alignment.CenterHorizontally


                ) {


                    val ag = LocalContext.current
                    Button(
                        onClick = {
                            ag.startActivity(Intent(ag, PageActivity::class.java))

                        },
                        colors = ButtonDefaults.buttonColors(Color.Green)

                    ) {
                        Text(text = "Pages", color = Color.Black)
                    }


                }


                Spacer(modifier = Modifier.height(40.dp))


                Column {
                    Row {


                        val va = AnnotatedString(
                            "Cards",
                            spanStyle = SpanStyle(Color.Green)
                        )
                        val vb = LocalContext.current
                        ClickableText(
                            text = va,
                            onClick = { vb.startActivity(Intent(vb, CardActivity::class.java)) })


                        Spacer(modifier = Modifier.width(180.dp))

                        val vc = AnnotatedString(
                            "Login",
                            spanStyle = SpanStyle(Color.Green)
                        )
                        val vd = LocalContext.current
                        ClickableText(
                            text = vc,
                            onClick = { vd.startActivity(Intent(vb, LoginActivity::class.java)) })
                    }
                }

            }
        }
    }
}
}


