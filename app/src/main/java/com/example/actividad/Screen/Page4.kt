package com.example.actividad.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.actividad.R

@Composable
fun Content4(navHostController: NavHostController) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(listOf(
                    R.drawable.ic_launcher_img2, R.drawable.ic_launcher_img4, R.drawable.ic_launcher_img5,
                    R.drawable.ic_launcher_img7, R.drawable.ic_launcher_img9, R.drawable.ic_launcher_img10,
                    R.drawable.ic_launcher_img11
                )) { imgRes ->
                    ImgLit(img1 = imgRes, descript = "Remolacha")
                }
            }
        }

        item {
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(listOf(R.drawable.ic_launcher_img8, R.drawable.ic_launcher_img6)) { imgRes ->
                    Imgbig(img = imgRes, descript = "chocha")
                }
            }
        }

        items(listOf(
            "Descubre el auténtico sabor de Colombia en cada bocado. Nuestros productos, cultivados con esmero en tierras colombianas, son el resultado de un proceso totalmente natural. Desde la yuca hasta la cebolla, cada ingrediente es cultivado sin químicos ni pesticidas, garantizando frescura y calidad incomparables.",
            "En Granjas , nos enorgullece ofrecerte una selección de productos 100% colombianos, directamente desde nuestras tierras a tu mesa. Huevos frescos, plátanos maduros y más, todos cultivados con amor y cuidado, sin añadidos artificiales. ¡Con nosotros, disfruta lo mejor de la naturaleza colombiana!",
            "¿Buscas opciones saludables y auténticas? En Granjas Presiga, te ofrecemos una amplia variedad de productos naturales colombianos que deleitarán tu paladar y alimentarán tu cuerpo. Desde la tierra a tu hogar, cada producto refleja nuestra pasión por la calidad y el respeto por el medio ambiente.",
            "Siente el vínculo con la naturaleza en cada bocado. En Granjas, cultivamos nuestros productos con métodos tradicionales y respetuosos con el medio ambiente. Con cada compra, apoyas a agricultores locales y contribuyes a la preservación de nuestra herencia colombiana.",
            "¿Quieres darle a tu familia lo mejor de la tierra? Descubre nuestra gama de productos naturales colombianos, cultivados con cuidado y amor por generaciones de agricultores. Desde la siembra hasta la cosecha, cada paso se realiza con dedicación para ofrecerte lo mejor de nuestra tierra."
        )
        ) { text ->
            Text(
                text = text,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun ImgLit(
    img1: Int,
    descript: String,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = img1),
        contentDescription = descript,
        modifier = modifier
            .width(80.dp)
            .height(80.dp)
    )
}

@Composable
fun Imgbig(
    img: Int,
    descript: String,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = img),
        contentDescription = descript,
        modifier = modifier
            .width(230.dp)
            .height(210.dp)
    )
}