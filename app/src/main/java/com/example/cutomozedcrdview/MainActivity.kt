package com.example.cutomozedcrdview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cutomozedcrdview.ui.theme.CutomozedCrdviewTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CutomozedCrdviewTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   // this place
                    BackgroundImage()
                }
            }
        }
    }
}
@Preview
@Composable
fun BackgroundImage(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Gray)){

         val painter= painterResource(id = R.drawable.customizeed)
        Image(painter = painter, contentDescription = "",
            modifier = Modifier
                .fillMaxSize()
                .clip(MaterialTheme.shapes.medium),
            contentScale = ContentScale.Crop)
              UI()

    }

}

@Composable
fun UI(){
    Text(text = "Cardview Ui",
        color = Color.White,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,

        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 50.dp)

        )
    //***************************************************
    
   LazyVerticalGrid(columns = GridCells.Fixed(2), modifier = Modifier
       .padding(16.dp)
       .fillMaxSize()

       .padding(top = 147.dp)){

       item {
           card(title = "Home",
               icon = Icons.Default.Home,
               backgroundColor = Color.White,
               elevation = 8.dp
           )
       }

       item {
           card(title = "Notification",
               icon = Icons.Default.Notifications,
               backgroundColor = Color.White,
               elevation = 8.dp
           )
       }

       item {
           card(title = "Date Range",
               icon = Icons.Default.DateRange,
               backgroundColor = Color.White,
               elevation = 8.dp
           )
       }


       item {
           card(title = "call",
               icon = Icons.Default.Call,
               backgroundColor = Color.White,
               elevation = 8.dp
           )
       }


       item {
           card(title = "Account Box",
               icon = Icons.Default.AccountBox,
               backgroundColor = Color.White,
               elevation = 8.dp
           )
       }


       item {
           card(title = "Add Circle",
               icon = Icons.Default.AddCircle,
               backgroundColor = Color.White,
               elevation = 8.dp
           )
       }


       item {
           card(title = "Add",
               icon = Icons.Default.Add,
               backgroundColor = Color.White,
               elevation = 8.dp
           )
       }


       item {
           card(title = "faverite",
               icon = Icons.Default.Favorite,
               backgroundColor = Color.White,
               elevation = 8.dp
           )
       }


   }

}

@Composable
fun card(title:String,icon:ImageVector,backgroundColor:Color,elevation: Dp){
    Card(modifier = Modifier
        //.padding(top = .dp)
        .fillMaxSize()
        .padding(8.dp)
        .height(145.dp)


        .clickable { /* Handle click if needed */ }
       // .background(color = backgroundColor)
       // .clip(MaterialTheme.shapes.medium),
        .clip(RoundedCornerShape(18.dp)) // Set corner radius here
        .shadow(elevation),


       // .shadow(elevation),

    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Icon(
                modifier = Modifier.size(50.dp),
                imageVector = icon,
                contentDescription = null,
                tint = Color.White
            )
            Spacer(modifier = Modifier.height(0.dp))
            Text(
                text = title,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )

        }

    }

}
