package edu.alexandra.limonada

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.alexandra.limonada.ui.theme.LimonadaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LimonadaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PreparacionLimonada()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PreparacionLimonada() {

    var pasoActual by remember { mutableStateOf(1) }
    var aleatorio by remember { mutableStateOf(1) }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = {
                Text(text = stringResource(id = R.string.app_name),
                    fontWeight = FontWeight.Bold)
            },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color.Yellow
                )
            )
        }
    ) { innerPadding ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.tertiaryContainer),
            color = MaterialTheme.colorScheme.background
        ) {
            when (pasoActual) {
                1 -> {
                    ImagenTexto(
                        imagen = R.drawable.lemon_tree,
                        descripcionContenido = R.string.limonero,
                        descripcion = R.string.limonero_desc,
                        imagenClic = { pasoActual = 2
                            aleatorio=(2..8).random()},
                    )
                }

                2 -> {
                    ImagenTexto(
                        imagen = R.drawable.lemon_squeeze,
                        descripcionContenido = R.string.limon,
                        descripcion = R.string.limon_desc,
                        imagenClic = {
                            aleatorio--
                            if (aleatorio<=0){
                                pasoActual = 3
                            }
                        },
                    )
                }

                3 -> {
                    ImagenTexto(
                        imagen = R.drawable.lemon_drink,
                        descripcionContenido = R.string.limonada,
                        descripcion = R.string.limonada_desc,
                        imagenClic = { pasoActual = 4 },
                    )
                }

                4 -> {
                    ImagenTexto(
                        imagen = R.drawable.lemon_restart,
                        descripcionContenido = R.string.vaso,
                        descripcion = R.string.vaso_desc,
                        imagenClic = { pasoActual = 1 },
                    )
                }
            }
        }
    }
}

@Composable
fun ImagenTexto(imagen: Int, descripcionContenido:Int, descripcion:Int, imagenClic: () -> Unit){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Button (onClick = imagenClic,
            shape = RoundedCornerShape(40.dp),
            colors = ButtonDefaults.buttonColors(Color(95,195,206)),
            border = BorderStroke(width = 2.dp, color = Color(105,205,216))
        ){
            Image(
                painter = painterResource(imagen),
                contentDescription = stringResource(descripcionContenido),
                modifier = Modifier
                    .wrapContentSize()
            )
        }
        Spacer(modifier = Modifier.height(32.dp))
        Text(text = stringResource(descripcion),
            modifier=Modifier.padding(top = 16.dp),
            fontSize = 18.sp)

    }
}

@Preview(showBackground = true)
@Composable
fun PreparacionLimonadaPreview() {
    LimonadaTheme {
        PreparacionLimonada()
    }
}