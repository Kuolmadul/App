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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.autofill.AutofillType
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mk.myapplication.ui.theme.MyApplicationTheme
import java.time.format.TextStyle

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Login()
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Login() {

    Box(modifier = Modifier



    ){
        Image(painter = painterResource(id = R.drawable.pic), contentDescription = "null",
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
    Column (modifier= Modifier
//        .background(Color.Gray)
        .fillMaxSize()
        .padding(20.dp),

        horizontalAlignment = Alignment.CenterHorizontally

    ) {
Text(text = "Please register here if you do not have an acount",color= Color.White)
Spacer(modifier = Modifier.height(10.dp))
        var name by remember {
            mutableStateOf(TextFieldValue(" "))
        }
        OutlinedTextField(
            value = name,
            onValueChange = {name = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Person , contentDescription = "")},
            label={ Text(text = "Enter name")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
           textStyle = androidx.compose.ui.text.TextStyle(Color.White),
            colors=TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Green,
                unfocusedBorderColor = Color.Red,
                focusedLabelColor = Color.Green,
                cursorColor = Color.Green,
                unfocusedLabelColor = Color.Red,
                unfocusedLeadingIconColor = Color.Red,
                unfocusedTextColor = Color.White,
                focusedTextColor = Color.Green,


                ),


        )
        Spacer(modifier = Modifier.height(10.dp))
//

        var email by remember {
            mutableStateOf(TextFieldValue(" "))
        }
        OutlinedTextField(value = email,
            onValueChange = {email = it },
            leadingIcon = { Icon(imageVector =Icons.Default.Email , contentDescription = "")},
            label={ Text(text = "Enter email")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            textStyle = androidx.compose.ui.text.TextStyle(Color.White),
            colors=TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Green,
                unfocusedBorderColor = Color.Red,
                focusedLabelColor = Color.Green,
                cursorColor = Color.Green,
                unfocusedLabelColor = Color.Red,
                unfocusedLeadingIconColor = Color.Red,
                unfocusedTextColor = Color.White,
                focusedTextColor = Color.Green,


                ),


            )
        Spacer(modifier = Modifier.height(10.dp))
//


        var phone by remember {
            mutableStateOf(TextFieldValue(" "))
        }
        OutlinedTextField(value = phone,
            onValueChange = {phone = it },
            leadingIcon = { Icon(imageVector =Icons.Default.Phone , contentDescription = "")},
            label={ Text(text = "Enter number")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            textStyle = androidx.compose.ui.text.TextStyle(Color.White),
            colors=TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Green,
                unfocusedBorderColor = Color.Red,
                focusedLabelColor = Color.Green,
                cursorColor = Color.Green,
                unfocusedLabelColor = Color.Red,
                unfocusedLeadingIconColor = Color.Red,
                unfocusedTextColor = Color.White,
                focusedTextColor = Color.Green,


                ),

            )
        Spacer(modifier = Modifier.height(10.dp))
//


        var password by remember {
            mutableStateOf(TextFieldValue(" "))
        }
        OutlinedTextField(value = password,
            onValueChange = {password = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "")},
            label={ Text(text = "Password")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            textStyle = androidx.compose.ui.text.TextStyle(Color.White),
            colors=TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Green,
                unfocusedBorderColor = Color.Red,
                focusedLabelColor = Color.Green,
                cursorColor = Color.Green,
                unfocusedLabelColor = Color.Red,
                unfocusedLeadingIconColor = Color.Red,
                unfocusedTextColor = Color.White,
                focusedTextColor = Color.Green,

                ),

            )
        Spacer(modifier = Modifier.height(10.dp))
//



Text(text = "Login if you already have an account", color = Color.Cyan)

        Spacer(modifier = Modifier.height(20.dp))

        Row {


            val back = LocalContext.current
            Button(
                onClick = {
                    back.startActivity(Intent(back, MainActivity::class.java))

                },

                colors = ButtonDefaults.buttonColors(Color.Yellow)


            ) {
                Text(text = "Home", color = Color.Black)
            }

            Spacer(modifier = Modifier.width(20.dp))

            val image = LocalContext.current
            Button(
                onClick = {
                    image.startActivity(Intent(image, PichaActivity2::class.java))

                },
                colors = ButtonDefaults.buttonColors(Color.Yellow)

            ) {
                Text(text = "Picture", color = Color.Black)
            }
        }

        Spacer(modifier = Modifier.height(20.dp))


        Row {


            val inp = LocalContext.current
            Button(
                onClick = {
                    inp.startActivity(Intent(inp, InputActivity2::class.java))

                },
                colors = ButtonDefaults.buttonColors(Color.Yellow)

            ) {
                Text(text = "Input", color = Color.Black)
            }

            Spacer(modifier = Modifier.width(20.dp))

            val log = LocalContext.current
            Button(
                onClick = {
                    log.startActivity(Intent(log, LoginActivity::class.java))

                },
                colors = ButtonDefaults.buttonColors(Color.Yellow)

            ) {
                Text(text = "Login", color = Color.Black)
            }

        }

        Spacer(modifier = Modifier.height(20.dp))

        Row {
            val scl = LocalContext.current
            Button(
                onClick = {
                    scl.startActivity(Intent(scl, ScrollActivity::class.java))

                },
                colors = ButtonDefaults.buttonColors(Color.Yellow)

            ) {
                Text(text = "Scroll page", color = Color.Black)
            }

        }


        Spacer(modifier = Modifier.height(20.dp))

            val va = AnnotatedString(
                "Next page",
                spanStyle = SpanStyle(Color.Cyan)
            )
            val vb = LocalContext.current
            ClickableText(
                text = va,
                onClick = { vb.startActivity(Intent(vb, MainActivity::class.java)) })
        }

}


