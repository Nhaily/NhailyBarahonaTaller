package dev.nhaily.nhailybarahonataller.Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun addScreens(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Magenta
                ),
                title = { Text("Animales", color = Color.White) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowLeft,
                            contentDescription = "Go Back"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize(), // Asegura que la columna ocupe todo el espacio disponible
            verticalArrangement = Arrangement.SpaceBetween // Coloca el contenido separado
        ) {
            // Lista de animales
            Column {
                ItemContact(name = "Tigre")
                ItemContact(name = "Leon")
                ItemContact(name = "Elefante")
                ItemContact(name = "Jirafa")
                ItemContact(name = "Hormiga")
                ItemContact(name = "Koala")
                ItemContact(name = "Panda")
                ItemContact(name = "Mariposa")
                ItemContact(name = "Pinguino")
                ItemContact(name = "Oso")
            }

            // Botón al final
            Button(
                onClick = { navController.navigate("home") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black
                ),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally) // Centra el botón horizontalmente
                    .padding(16.dp) // Espaciado alrededor del botón
            ) {
                Text("Regresar", color = Color.White)
            }
        }
    }
}
