package edu.alexandra.articulocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
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
import edu.alexandra.articulocompose.ui.theme.ArticuloComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticuloComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticuloCompose(
                        titulo= stringResource(R.string.titulo),
                        ParrafonUno= stringResource(R.string.descripcion_uno),
                        ParrafonDos= stringResource(R.string.descripcion_dos),
                        imagen = painterResource(R.drawable.bg_compose_background)
                    )
                }
            }
        }
    }
}

@Composable
fun ArticuloCompose(titulo: String, ParrafonUno: String, ParrafonDos: String, imagen: Painter, modifier: Modifier = Modifier,
) {
    val imagen = painterResource(R.drawable.bg_compose_background)
    Column(modifier = modifier) {
        Image(
            painter = imagen,
            contentDescription = null)
        Text(
            text = titulo,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = ParrafonUno,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = ParrafonDos,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ArticuloPreview() {
    ArticuloComposeTheme {
        ArticuloCompose(
            titulo= stringResource(R.string.titulo),
            ParrafonUno= stringResource(R.string.descripcion_uno),
            ParrafonDos= stringResource(R.string.descripcion_dos),
            imagen = painterResource(R.drawable.bg_compose_background)
        )
    }
}