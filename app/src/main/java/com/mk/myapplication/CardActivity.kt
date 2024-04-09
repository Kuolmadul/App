package com.mk.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mk.myapplication.ui.theme.MyApplicationTheme

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Card()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Card() {

    LazyColumn (
        modifier = Modifier
            .fillMaxSize()
           // .background(Color.Gray)
    ){

        item {



          Column(modifier = Modifier
              .fillMaxSize()

              .padding(10.dp),
                //horizontalAlignment = Alignment.CenterHorizontally




            ) {


                androidx.compose.material3.Card(
                    elevation = CardDefaults.cardElevation(40.dp),
                    border = BorderStroke(1.dp, Color.Black)
                ) {
      Row {


                    Image(painter = painterResource(id = R.drawable.pic), contentDescription = null)
                    Text(text = "Logo", color = Color.Red)
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

    }





