package edu.alexandra.cuadrante

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.alexandra.cuadrante.ui.theme.CuadranteTheme
import java.security.Principal

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
                    Cuadrantes(
                        encabezado1 = stringResource(R.string.primer_encabezado),
                        cuerpo1 = stringResource(R.string.primer_cuerpo),
                        encabezado2 = stringResource(R.string.segundo_encabezado),
                        cuerpo2 = stringResource(R.string.segundo_cuerpo),
                        encabezado3 = stringResource(R.string.tercer_encabezado),
                        cuerpo3 = stringResource(R.string.tercer_cuerpo),
                        encabezado4 = stringResource(R.string.cuarto_encabezado),
                        cuerpo4 = stringResource(R.string.cuarto_cuerpo)
                    )
                }
            }
        }
    }
}


@Composable
fun Cuadrantes(
    encabezado1: String,
    cuerpo1: String,
    encabezado2: String,
    cuerpo2: String,
    encabezado3: String,
    cuerpo3: String,
    encabezado4: String,
    cuerpo4: String,
    modifier: Modifier = Modifier
){
    Column(modifier) {
        Row(modifier = Modifier.weight(1F)) {
            Column(
                modifier= Modifier
                    .weight(1F)
                    .fillMaxSize()
                    .background(color = colorResource(id = R.color.morado1)).padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = encabezado1,
                    modifier = Modifier.padding(bottom = 16.dp).align(alignment = Alignment.CenterHorizontally),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = cuerpo1,
                    modifier = modifier,
                    textAlign = TextAlign.Justify
                )
            }

            Column(
                modifier= Modifier.weight(1F).fillMaxSize()
                    .background(color = colorResource(id = R.color.morado2)).padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = encabezado2,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                        .align(alignment = Alignment.CenterHorizontally),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = cuerpo2,
                    modifier = modifier,
                    textAlign = TextAlign.Justify
                )
            }
        }

        Row(modifier = Modifier.weight(1F)) {
            Column(
                modifier= Modifier
                    .weight(1F)
                    .fillMaxSize()
                    .background(color = colorResource(id = R.color.morado3)).padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = encabezado3,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                        .align(alignment = Alignment.CenterHorizontally),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = cuerpo3,
                    modifier = modifier,
                    textAlign = TextAlign.Justify
                )
            }

            Column(
                modifier= Modifier.weight(1F).fillMaxSize()
                    .background(color = colorResource(id = R.color.morado4)).padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = encabezado4,
                    modifier = Modifier.padding(bottom = 16.dp)
                        .align(alignment = Alignment.CenterHorizontally),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = cuerpo4,
                    modifier = modifier,
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CuadranteAppPreview() {
    CuadranteTheme {
        Cuadrante()
    }
}
