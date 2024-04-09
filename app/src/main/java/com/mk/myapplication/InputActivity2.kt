package com.mk.myapplication

import android.content.Intent
import android.icu.text.AlphabeticIndex.Bucket.LabelType
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mk.myapplication.ui.theme.MyApplicationTheme

class InputActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                   Input()

                }
            }
        }



@Preview(showBackground = true)
@Composable
fun Input() {
    Column(modifier= Modifier
        .background(Color.Gray)
        .fillMaxSize()
        .padding(20.dp),

horizontalAlignment = Alignment.CenterHorizontally

    ) {

        var name by remember {
            mutableStateOf(TextFieldValue(" "))
        }
        TextField(
            value = name, onValueChange = {name = it } ,
            label={ Text(text = "Enter name")}
            )
Spacer(modifier = Modifier.height(10.dp))
//
        
        var email by remember {
            mutableStateOf(TextFieldValue(" "))
        }
        TextField(value = email, onValueChange = {email = it },
            label={ Text(text = "Enter email")}
            )
        Spacer(modifier = Modifier.height(10.dp))
//


        var phone by remember {
            mutableStateOf(TextFieldValue(" "))
        }
        OutlinedTextField(value = phone, onValueChange = {phone = it },
            label={ Text(text = "Enter number")}
        )
        Spacer(modifier = Modifier.height(10.dp))
//


        var password by remember {
            mutableStateOf(TextFieldValue(" "))
        }
        OutlinedTextField(value = password, onValueChange = {password = it },
            label={ Text(text = "Password")}
        )
        Spacer(modifier = Modifier.height(10.dp))
//






        val back = LocalContext.current
        Button(onClick = {
            back.startActivity(Intent(back, MainActivity::class.java))

        },
            modifier=Modifier

        ) {
            Text(text = "Home",color= Color.White)
        }

        val pic = LocalContext.current
        Button(onClick = {
            pic.startActivity(Intent(back, PichaActivity2::class.java))

        },
            modifier=Modifier

        ) {
            Text(text = "Picture",color= Color.White)
        }


        val log = LocalContext.current
        Button(onClick = {
            log.startActivity(Intent(log, LoginActivity::class.java))

        },
            modifier=Modifier

        ) {
            Text(text = "Login",color= Color.White)
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

