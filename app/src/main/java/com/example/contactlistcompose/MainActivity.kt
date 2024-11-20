package com.example.contactlistcompose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contactlistcompose.ui.theme.ContactListComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContactListComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val marcello = Contact(
                        name = "Marcello",
                        number = "(55) 33 81234612",
                        image = R.drawable.sample1
                    )

                    val amanda = Contact(
                        name = "Amanda",
                        number = "(55) 31 92256789",
                        image = R.drawable.sample2
                    )

                    val raissa = Contact(
                        name = "Raissa",
                        number = "(55) 32 73456891",
                        image = R.drawable.sample3
                    )

                    val julia = Contact(
                        name = "Julia",
                        number = "(55) 34 92345678",
                        image = R.drawable.sample4
                    )

                    val victor = Contact(
                        name = "Victor",
                        number = "(55) 35 81239876",
                        image = R.drawable.sample5
                    )

                    val marina = Contact(
                        name = "Marina",
                        number = "(55) 36 91435879",
                        image = R.drawable.sample6
                    )

                    val paulo = Contact(
                        name = "Paulo",
                        number = "(55) 37 94567231",
                        image = R.drawable.sample7
                    )

                    val bianca = Contact(
                        name = "Bianca",
                        number = "(55) 38 85694321",
                        image = R.drawable.sample8
                    )

                    val gustavo = Contact(
                        name = "Gustavo",
                        number = "(55) 39 96721345",
                        image = R.drawable.sample9
                    )

                    val isabela = Contact(
                        name = "Isabela",
                        number = "(55) 30 92345671",
                        image = R.drawable.sample10
                    )

                    val felipe = Contact(
                        name = "Felipe",
                        number = "(55) 31 91723489",
                        image = R.drawable.sample11
                    )

                    val livia = Contact(
                        name = "Livia",
                        number = "(55) 32 98765432",
                        image = R.drawable.sample12
                    )

                    val renato = Contact(
                        name = "Renato",
                        number = "(55) 33 85431276",
                        image = R.drawable.sample13
                    )

                    val patricia = Contact(
                        name = "Patricia",
                        number = "(55) 34 83214567",
                        image = R.drawable.sample14
                    )

                    val thiago = Contact(
                        name = "Thiago",
                        number = "(55) 35 87653241",
                        image = R.drawable.sample15
                    )

                    val leticia = Contact(
                        name = "Leticia",
                        number = "(55) 36 94567321",
                        image = R.drawable.sample16
                    )

                    val contacts = listOf(marcello, amanda, raissa, julia, victor, marina, paulo, bianca, gustavo, isabela, felipe, livia, renato, patricia, thiago, leticia)
                    LazyColumn {
                        items(contacts){ contact ->
                            ContactCard(
                                contact = contact,
                                onClick = {

                                }
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ContactCard(
    contact: Contact,
    onClick:() -> Unit,
    ){

    Column(
        modifier = Modifier
            .padding(8.dp)
            .clickable(onClick = onClick)
    ){

        Row(
            modifier = Modifier
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.FillWidth,
                painter = painterResource(id = contact.image),
                contentDescription = "contact photo")

            Spacer(modifier = Modifier.size(16.dp))

            Column {
                Text(
                    text = contact.name,
                    fontSize = 26.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = contact.number,
                    color = Color.Gray
                )
            }
        }

    }

}
data class Contact (
    val name: String,
    val number: String,
    @DrawableRes val image: Int
)

@Preview(showBackground = true)
@Composable
fun ContactCardPreview() {
    ContactListComposeTheme {
        val contact = Contact(
            name = "Leticia",
            number = "(55) 36 94567321",
            image = R.drawable.sample16
        )
        ContactCard(
            contact = contact,
            onClick = {

            }
        )
    }
}
