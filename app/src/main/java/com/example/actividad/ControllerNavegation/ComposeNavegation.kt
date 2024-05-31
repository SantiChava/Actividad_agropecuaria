package com.example.actividad.ControllerNavegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.actividad.Screen.Content3
import com.example.actividad.Screen.Content4
import com.example.actividad.Screen.Main



@Composable
fun NavComponent(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "view_1"){
        composable(route = "view_1"){
            Main(navController)
        }
        composable(route = "view_2"){
            Content4(navController)
        }
    }
}
