package com.eve.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eve.myapplication.ui.theme.LoginRegistrationTheme
//import kotlin.coroutines.jvm.internal.CompletedContinuation.context

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginRegistrationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Login()
                }
            }
        }
    }
}

@Composable
fun Login() {
    val email by remember { mutableStateOf(TextFieldValue("")) }

    var password by remember { mutableStateOf(TextFieldValue("")) }

    val context= LocalContext.current

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.DarkGray)
            .padding(10.dp))
    {
        Text(text = "Emobilis Institute",
            fontFamily = FontFamily.Cursive,
            fontSize = 20.sp,
            color = Color.Cyan)


      OutlinedTextField(
          value = email,
          onValueChange = {password=it},
          leadingIcon = { Icon(imageVector = Icons.Default.Email  , contentDescription = "email" )},
          label = { Text(text = "Enter email",
              color = Color.White,
              fontSize = 20.sp,
              fontFamily = FontFamily.Monospace)},
          modifier = Modifier
              .fillMaxWidth()
              .padding(vertical = 10.dp))

                Spacer(modifier = Modifier.height(15.dp) )

        OutlinedTextField(
            value = password ,
            onValueChange = {password=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock ,
                contentDescription = "pass" )},
            label = { Text(text = "Enter password",
                color = Color.White,
                fontSize = 20.sp,
                fontFamily = FontFamily.Monospace)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp))

        Spacer(modifier = Modifier.height(15.dp) )

        Button(onClick = { val intent= Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        },
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.LightGray))
        {
            Text(text = "Click to Login",
                fontSize = 15.sp) }

        Spacer(modifier = Modifier.height(15.dp) )

        Button(onClick = { val intent= Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        },
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.LightGray))
        {
            Text(text = "Intent",
                fontSize = 15.sp) }








    }
}






@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    Login()
}