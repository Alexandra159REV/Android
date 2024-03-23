package edu.alexandra.tarjeta

import android.icu.lang.UCharacter.VerticalOrientation
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.alexandra.tarjeta.ui.theme.TarjetaTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    tarjeta(
                        titulo= stringResource(R.string.titulo),
                        ParrafonUno= stringResource(R.string.ParrafonUno),
                        ParrafonDos= stringResource(R.string.ParrafonDos),
                        ParrafonTres= stringResource(R.string.ParrafonTres),
                        ParrafonCuatro= stringResource(R.string.ParrafonCuatro),
                        imagen = painterResource(R.drawable.output)
                    )
                }
            }
        }
    }
}

@Composable
fun tarjeta(titulo: String, ParrafonUno: String, ParrafonDos: String, ParrafonTres: String, ParrafonCuatro: String, imagen: Painter, modifier: Modifier = Modifier,
) {
    val imagen = painterResource(R.drawable.output)
    Column(modifier = modifier
        .fillMaxSize()
        .background(color = colorResource(id = R.color.androidverde))
        .padding(1.dp),) {


        Image(
            painter = imagen,
            modifier = Modifier.padding(80.dp, top = 17.dp, bottom = 100.dp),
            contentDescription = null
        )

        Text(
            text = titulo,
            modifier = Modifier.padding(start = 80.dp, end = 50.dp),

            fontSize = 29.sp
        )

        Text(
            text = ParrafonUno,
            modifier = Modifier.padding(90.dp, top = 1.dp, bottom = 220.dp),
            colorResource(id = R.color.androidverdeletra),

            fontSize = 14.sp,
            textAlign = TextAlign.Justify

        )


        Icon(
            imageVector = Icons.Default.Call,
            contentDescription = null,
            modifier = Modifier.padding(80.dp, end = 20.dp, top = 1.dp),
            tint = colorResource(id = R.color.androidverdeletra)
        )

        Text(
            text = ParrafonDos,
            modifier = Modifier.padding(130.dp, end = 1.dp, top = 1.dp, bottom = 1.dp),


            fontSize = 15.sp
        )


        Icon(
            imageVector = Icons.Default.Share,
            contentDescription = null,
            modifier = Modifier.padding(80.dp, end = 20.dp, top = 1.dp),
            tint = colorResource(id = R.color.androidverdeletra)
        )

        Text(
            text = ParrafonTres,
            modifier = Modifier.padding(130.dp, end = 1.dp, top = 1.dp, bottom = 1.dp),


            fontSize = 15.sp
        )

        Icon(
            imageVector = Icons.Default.Email,
            contentDescription = null,
            modifier = Modifier.padding(80.dp, end = 20.dp, top = 1.dp),
            tint = colorResource(id = R.color.androidverdeletra)
        )

        Text(
            text = ParrafonCuatro,
            modifier = Modifier.padding(130.dp, end = 1.dp, top = 1.dp, bottom = 1.dp),

            fontSize = 15.sp
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun tarjetaPreview() {
    TarjetaTheme  {
        tarjeta(
            titulo= stringResource(R.string.titulo),
            ParrafonUno= stringResource(R.string.ParrafonUno),
            ParrafonDos= stringResource(R.string.ParrafonDos),
            ParrafonTres= stringResource(R.string.ParrafonTres),
            ParrafonCuatro= stringResource(R.string.ParrafonCuatro),
            imagen = painterResource(R.drawable.output)
        )
    }
}