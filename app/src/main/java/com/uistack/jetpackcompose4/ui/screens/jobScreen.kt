package com.uistack.jetpackcompose4.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.uistack.jetpackcompose4.R
import com.uistack.jetpackcompose4.ui.Navigation.AppScreens
import com.uistack.jetpackcompose4.ui.theme.LightPrimaryColor
import com.uistack.jetpackcompose4.ui.theme.Poppins
import com.uistack.jetpackcompose4.ui.theme.PrimaryColor
import com.uistack.jetpackcompose4.ui.theme.Purple700
import com.uistack.jetpackcompose4.ui.theme.SecondaryColor
import com.uistack.jetpackcompose4.ui.theme.Shapes


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun jobScreen(navController: NavHostController) {

    Image(
        painter = painterResource(id = R.drawable.image7),
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .width(450.dp)
            .height(850.dp)
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(
                painter = painterResource(id = R.drawable.image),
                contentDescription = "",
                modifier = Modifier.height(50.dp)
            )
            Text(
                text = "Nuestro Trabajo",
                textAlign = TextAlign.Center,
                fontFamily = Poppins,
                color = PrimaryColor,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                fontWeight = FontWeight.ExtraBold,
                fontSize = 28.sp,
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.gatito1), // Asegúrate de que este recurso exista
                contentDescription = "gatito 1",
                modifier = Modifier
                    .height(230.dp)
                    .width(230.dp)
                    .padding(end = 8.dp)
            )
            Text("Tierno gatito de croche, hecho a mano con amor. regalo Perfecto para añadir encanto y alegria a tu vida. Diseño artesanal unico, ideal para amante de los gatos. ¡Haz tu dia mas acojedor con este adorable gatito tejido! - Gatito 1: $ 18.000",
                color = Purple700, fontSize = 15.sp,
                textAlign = TextAlign.Justify,
                )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth() // Asegúrate de llenar el ancho disponible
        ) {
            // Texto a la izquierda
            Text(
                "Tierno gatito de croche, hecho a mano con amor. Regalo perfecto para añadir encanto y alegría a tu vida. Diseño artesanal único, ideal para amante de los gatos. ¡Haz tu día más acogedor con este adorable gatito tejido! - Gatito 2: $ 18.000",
                color = Color(0xFF9C27B0), // Ajusta el color según tus necesidades
                fontSize = 15.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.weight(1f) // Toma el espacio restante en la fila
            )

            // Imagen a la derecha
            Image(
                painter = painterResource(id = R.drawable.gatito2), // Asegúrate de que este recurso exista
                contentDescription = "gatito 2",
                modifier = Modifier
                    .height(230.dp)
                    .width(230.dp)
                    .padding(end = 8.dp)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.patito1), // Asegúrate de que este recurso exista
                contentDescription = "patito1",
                modifier = Modifier
                    .height(230.dp)
                    .width(230.dp)
                    .padding(end = 8.dp)
            )
            Text("Encantador pollito de croche hecho a mano con amor. Perfecto para regalar ternura y caliedez. Un regalo unico y especial para cualquier ocacion, que añadira un toque calido a tu hogar. ¡Adopta a este adorable amigo tejido! Patito 1: $ 18.000",
                color = Purple700, fontSize = 15.sp,
                textAlign = TextAlign.Justify,
            )

        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth() // Asegúrate de llenar el ancho disponible
        ) {
            // Texto a la izquierda
            Text(
                "Envantador diente de crche hecho a mano con cariño. Ideal como amuleto para trasmitir cuidado dental y buena energia. unregalo original y significativo para cualquoer ocacion. ¡HAgrega un toque unico y postivo a tu vida con este adorable diente tejido!",
                color = Color(0xFF9C27B0), // Ajusta el color según tus necesidades
                fontSize = 15.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.weight(1f) // Toma el espacio restante en la fila
            )

            // Imagen a la derecha
            Image(
                painter = painterResource(id = R.drawable.diente1), // Asegúrate de que este recurso exista
                contentDescription = "deinte 1",
                modifier = Modifier
                    .height(230.dp)
                    .width(230.dp)
                    .padding(end = 8.dp)
            )
        }
        Row() {
            OutlinedButton(onClick = {navController.navigate(AppScreens.PremiumScreen.route)},
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = PrimaryColor
                ),
                shape = Shapes.medium
            ) {
                Text("Metodos de pagos",
                    color = LightPrimaryColor,
                    fontFamily = Poppins,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )
            }

        }
    }

}

/*
@Preview(showBackground = true)
@Composable
fun MainScreenPreview(){
    JetpackCompose4Theme {
        MainScreen(navController)
    }
}
 */