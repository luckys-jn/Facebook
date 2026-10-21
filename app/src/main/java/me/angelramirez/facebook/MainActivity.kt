package me.angelramirez.facebook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import me.angelramirez.facebook.ui.screens.ForgotPasswordScreen
import me.angelramirez.facebook.ui.theme.FacebookTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FacebookTheme {
                val myNavController = rememberNavController()

                NavHost(
                    navController = myNavController,
                    startDestination = "login",
                    modifier = Modifier.fillMaxSize()
                ) {
                    // 1. Pantalla de Login
                    composable(route = "login") {
                        FacebookLoginScreen(navController = myNavController)
                    }

                    // 2. Pantalla de Registro
                    composable(route = "register") {
                        FacebookRegisterScreen(navController = myNavController)
                    }

                    // 3. Pantalla Olvidaste tu contraseña
                    composable(route = "forgot_password") {
                        ForgotPasswordScreen(navController = myNavController)
                    }
                    }
                }
            }
        }
    }
