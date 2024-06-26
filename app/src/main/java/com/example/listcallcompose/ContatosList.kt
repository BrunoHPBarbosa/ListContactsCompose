package com.example.listcallcompose

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable


data class Contacts(
    val name: String,
    val number: String,
    @DrawableRes val imgPerfil: Int
)

    val contatos = listOf(
        Contacts(
        name = "Elise",
        number = "(11)99234-5678",
        imgPerfil = R.drawable.contato1
    ),
    Contacts(
        name = "Vanda",
        number = "(11)99234-5678",
        imgPerfil = R.drawable.contato2
    ),
   Contacts(
        name = "Bruno",
        number = "(11)99234-5678",
        imgPerfil = R.drawable.contato3
    ),
    Contacts(
        name = "Eri",
        number = "(11)99234-5678",
        imgPerfil = R.drawable.contato4
    ),
   Contacts(
        name = "Carl",
        number = "(11)99234-5678",
        imgPerfil = R.drawable.contato5
    ),
    Contacts(
        name = "Beatriz",
        number = "(11)99234-5678",
        imgPerfil = R.drawable.contato6
    ),
    Contacts(
        name = "Samuca",
        number = "(11)99234-5678",
        imgPerfil = R.drawable.contato7
    ),
    Contacts(
        name = "Bento",
        number = "(11)99234-5678",
        imgPerfil = R.drawable.contato8
    ),
   Contacts(
        name = "Bento2",
        number = "(11)99234-5678",
        imgPerfil = R.drawable.contato9
    ),
    Contacts(
        name = "Mario",
        number = "(11)99234-5678",
        imgPerfil = R.drawable.contato10
    ),
     Contacts(
        name = "Joao",
        number = "(11)99234-5678",
        imgPerfil = R.drawable.contato11
    ),
    Contacts(
        name = "Mary",
        number = "(11)99234-5678",
        imgPerfil = R.drawable.contato12
    )
    )
