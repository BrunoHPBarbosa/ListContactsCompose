package com.example.listcallcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.listcallcompose.ui.theme.WoofTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           WoofTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TextContact()

                }
            }
        }
    }
}

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun TextContact() {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("My Contacts",
                        modifier =Modifier
                        .padding(10.dp)
                    ,style = MaterialTheme.typography.headlineMedium)
                            },
                    )


            }
        ) { innerPadding ->
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.background)
            ){
                MyLazyColumn()
            }

        }
    }

@Composable
fun MyLazyColumn() {

    LazyColumn {
        items(contatos) { contact ->
            CardContact(contacts = contact,
                onClick = {
                    println("item Clicado" + contact.name)
             
                }

            )


        }
    }
}

   

    @Preview(showSystemUi = true)
    @Composable
    fun GreetingPreview() {
        WoofTheme(darkTheme = true) {
            TextContact()

        }

    }



