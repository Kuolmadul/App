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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mk.myapplication.ui.theme.MyApplicationTheme

class PichaActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Picha()

        }
    }
}
@Preview(showBackground = true)
@Composable
fun Picha() {


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
            .padding()
    ) {

        Image(
            painter = painterResource(id = R.drawable.pic), contentDescription = "null",
            modifier = Modifier
//        .background(Color.Cyan)
                //.clip(RoundedCornerShape(50))
                //.size(200.dp)
                .fillMaxSize(),

//    colorFilter = ColorFilter.tint(Color.Red),
            contentScale = ContentScale.Crop
//    contentScale = ContentScale.FillBounds

        )



        Image(
            painter = painterResource(id = R.drawable.far), contentDescription = "null",
            modifier = Modifier
//        .background(Color.Cyan)
                .clip(RoundedCornerShape(50))
                .size(200.dp)
                .fillMaxSize(),

//    colorFilter = ColorFilter.tint(Color.Red),
            contentScale = ContentScale.Crop
//    contentScale = ContentScale.FillBounds

        )


    }

        LazyColumn {
            item {

Spacer(modifier = Modifier.height(220.dp))


Row {

    val home = LocalContext.current
    Button(onClick = {
        home.startActivity(Intent(home, MainActivity::class.java))
    },
        colors = ButtonDefaults.buttonColors(Color.Green)

    ) {
        Text(text = "Home", color = Color.Black)
    }

    val pc = LocalContext.current
    Button(
        onClick = {
            pc.startActivity(Intent(pc, PichaActivity2::class.java))

        },
        colors = ButtonDefaults.buttonColors(Color.Green)


    ) {
        Text(text = "Pictures", color = Color.Black)
    }


    val log = LocalContext.current
    Button(
        onClick = {
            log.startActivity(Intent(log, LoginActivity::class.java))

        },
        colors = ButtonDefaults.buttonColors(Color.Green)


    ) {
        Text(text = "Login", color = Color.Black)
    }


}

                Spacer(modifier = Modifier.height(20.dp))

                val va = AnnotatedString(
                    "Home",
                    spanStyle = SpanStyle(Color.Cyan)
                )
                val vb = LocalContext.current
                ClickableText(
                    text = va,
                    onClick = { vb.startActivity(Intent(vb, MainActivity::class.java)) })


            }
        }

}
