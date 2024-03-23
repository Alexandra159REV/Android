package edu.alexandra.cuadrante

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.alexandra.cuadrante.ui.theme.CuadranteTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Cuadrante(
                        ParrafonUno= stringResource(R.string.Uno),
                        ParrafonDos= stringResource(R.string.Dos),
                        ParrafonTres= stringResource(R.string.Tres),
                        ParrafonCuatro= stringResource(R.string.Cuatro),
                        ParrafonSinco= stringResource(R.string.Sinco),
                        ParrafonSeis= stringResource(R.string.Seis),
                        ParrafonSiete= stringResource(R.string.Siete),
                        ParrafonOcho= stringResource(R.string.Ocho)

                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(ParrafoUno: String, ParrafoDos: String, ParrafoTres: String, ParrafoCuatro: String, ParrafoSinco: String, ParrafoSeis: String, ParrafoSiete: String, ParrafoOcho: String,modifier: Modifier = Modifier) {

    Text(
        text = ParrafoUno,
        
    
        modifier = Modifier.padding(start = 16.dp, end = 16.dp)

    )
    Text(
        text = ParrafoDos,
        modifier = Modifier.padding(start = 16.dp, end = 16.dp)
    )
    Text(
        text = ParrafoTres,
        modifier = Modifier.padding(start = 16.dp, end = 16.dp)
    )
    Text(
        text = ParrafoCuatro,
        modifier = Modifier.padding(start = 16.dp, end = 16.dp)
    )
    Text(
        text = ParrafoSinco,
        modifier = Modifier.padding(start = 16.dp, end = 16.dp)
    )
    Text(
        text = ParrafoSeis,
        modifier = Modifier.padding(start = 16.dp, end = 16.dp)
    )
    Text(
        text = ParrafoSiete,
        modifier = Modifier.padding(start = 16.dp, end = 16.dp)
    )
    Text(
        text = ParrafoOcho,
        modifier = Modifier.padding(start = 16.dp, end = 16.dp)
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CuadrantePreview() {
    CuadranteTheme {
        Cuadrante(

            ParrafonUno= stringResource(R.string.Uno),
            ParrafonDos= stringResource(R.string.Dos),
            ParrafonTres= stringResource(R.string.Tres),
            ParrafonCuatro= stringResource(R.string.Cuatro),
            ParrafonSinco= stringResource(R.string.Sinco),
            ParrafonSeis= stringResource(R.string.Seis),
            ParrafonSiete= stringResource(R.string.Siete),
            ParrafonOcho= stringResource(R.string.Ocho)

        )
    }
}

@Composable
fun Cuadrante(ParrafonUno: String, ParrafonDos: String, ParrafonTres: String, ParrafonCuatro: String, ParrafonSinco: String, ParrafonSeis: String, ParrafonSiete: String, ParrafonOcho: String) {

}
