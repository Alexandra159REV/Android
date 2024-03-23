package edu.alexandra.administrador

import android.icu.lang.UCharacter.VerticalOrientation
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.alexandra.administrador.ui.theme.AdministradorTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdministradorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    administradorr(
                        titulo= stringResource(R.string.titulo),
                        ParrafonUno= stringResource(R.string.ParrafonUno),
                        imagen = painterResource(R.drawable.ic_task_completed)
                    )
                }
            }
        }
    }
}

@Composable
fun administradorr(titulo: String, ParrafonUno: String, imagen: Painter, modifier: Modifier = Modifier,
) {
    val imagen = painterResource(R.drawable.ic_task_completed)
    Column(modifier = modifier) {

        Image(

            painter = imagen,
            modifier = Modifier.padding(top = 165.dp, bottom = 10.dp, start = 80.dp),

            contentDescription = null)

        Text(
            text = titulo,
            modifier = Modifier.padding(88.dp, end = 50.dp),
            fontSize = 25.sp
        )
        Text(
            text = ParrafonUno,
            modifier = Modifier.padding(start = 163.dp, end = 150.dp),
            textAlign = TextAlign.Justify

        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun administradorrPreview() {
    AdministradorTheme {
        administradorr(
            titulo= stringResource(R.string.titulo),
            ParrafonUno= stringResource(R.string.ParrafonUno),
            imagen = painterResource(R.drawable.ic_task_completed)
        )
    }
}