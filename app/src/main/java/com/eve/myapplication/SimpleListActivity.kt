package com.eve.myapplication

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eve.myapplication.ui.theme.LoginRegistrationTheme
import java.time.format.TextStyle

class SimpleListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginRegistrationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SimpleListView()
                }
            }
        }
    }
}
 private val namelist = mutableListOf("Jude", "Eve", "Cathy","Monica")

 private val listModifier = Modifier
     .fillMaxSize()
     .background(color = Color.LightGray)
     .padding(10.dp)

val textstyle = androidx.compose.ui.text.TextStyle(color = Color.Blue)



@Composable
fun SimpleListView() {
    LazyColumn(modifier = listModifier) {
        items(namelist) {

             jina ->

            Text(text = jina, style = textstyle)

        }

    }
}








@Preview(showBackground = true)
@Composable
fun  SimpleListViewPrev() {
    SimpleListView()


}