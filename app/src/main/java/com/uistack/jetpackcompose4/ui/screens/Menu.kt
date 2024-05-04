package com.uistack.jetpackcompose4.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
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

/*class Menu(navController: NavHostController) : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen(navController)
        }
    }
}

 */

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavHostController) {

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
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(
                painter = painterResource(id = R.drawable.image),
                contentDescription = "",
                modifier = Modifier.height(50.dp)
            )
            Text(
                text = "Diseños",
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
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp), // Ajusta el padding para controlar el ancho del texto
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Explora el emocionante mundo de Chilicats, donde nuestros diseños transforman tus momentos en experiencias únicas. Descubre variedad de precios y tejidos en nuestro catálogo. No te pierdas de crear momentos inolvidables con tus seres queridos. ¡Haz que cada momento cuente con la magia de Chilicats!",
                style = TextStyle(
                    textAlign = TextAlign.Justify,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp,
                    color = Color.Black
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
            )


        }
        Row {
            Image(
                painter = painterResource(id = R.drawable.disenos),
                contentDescription = null,
                modifier = Modifier.width(300.dp)
            )
        }
        Row() {
            OutlinedButton(onClick = {navController.navigate(AppScreens.jobScreen.route)},
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = PrimaryColor
                ),
                shape = Shapes.medium
            ) {
                Text("Nuestro Trabajo",
                    color = LightPrimaryColor,
                    fontFamily = Poppins,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )
            }

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