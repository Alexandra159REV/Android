package edu.alexandra.tarjetadepresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.alexandra.tarjetadepresentacion.ui.theme.TarjetaDEpresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaDEpresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Tarjeta(stringResource(R.string.nombre),
                        stringResource(R.string.cargo),
                        stringResource(R.string.telefono),
                        stringResource(R.string.compartido),
                        stringResource(R.string.correo))
                }
            }
        }
    }
}

@Composable
fun Tarjeta(titulo: String, subtitulo: String, telefono: String, compartido: String, correo: String) {
    Column (
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color(0xffd2e8d4)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        //verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            val imagen = painterResource(R.drawable.android_logo)
            Image(
                painter = imagen,
                contentDescription = null,
                modifier = Modifier
                    .height(120.dp)
                    .width(120.dp)
                    .background(Color(0xff073042))
            )
            Text(
                text = titulo,
                fontSize = 45.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = subtitulo,
                color = Color(0xFF1e7b4b),
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            //.padding(top = 500.dp, bottom = 70.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 40.dp, bottom = 15.dp),
                //horizontalArrangement = Arrangement.Center,
                //verticalAlignment = Alignment.Top
            ) {
                Icon(
                    imageVector = Icons.Default.Call,
                    contentDescription = stringResource(id = R.string.telefono_2),
                    modifier = Modifier
                        .padding(start = 60.dp),
                    Color(0xFF1e7b4b)
                )
                Text(
                    text = telefono,
                    modifier = Modifier
                        .padding(start = 25.dp),
                    fontSize = 15.sp
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 40.dp, bottom = 15.dp),
            ) {

                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = stringResource(R.string.compartido_2),
                    modifier = Modifier
                        .padding(start = 60.dp),
                    Color(0xFF1e7b4b)
                )
                Text(
                    text = compartido,
                    modifier = Modifier
                        .padding(start = 25.dp),
                    fontSize = 15.sp
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 40.dp, bottom = 30.dp),
            ) {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = stringResource(id = R.string.correo_2),
                    modifier = Modifier
                        .padding(start = 60.dp),
                    Color(0xFF1e7b4b)
                )
                Text(
                    text = correo,
                    modifier = Modifier
                        .padding(start = 25.dp),
                    fontSize = 15.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TarjetaPreview() {
    TarjetaDEpresentacionTheme {
        Tarjeta(stringResource(R.string.nombre),
            stringResource(R.string.cargo),
            stringResource(R.string.telefono),
            stringResource(R.string.compartido),
            stringResource(R.string.correo))
    }
}