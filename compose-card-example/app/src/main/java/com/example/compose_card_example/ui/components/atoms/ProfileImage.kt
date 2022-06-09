package com.example.compose_card_example.ui.components.atoms

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter

@Composable
fun ProfileImage(url: String?) {
    Image(
        painter = rememberAsyncImagePainter(url ?: "https://user-images.githubusercontent.com/59087018/171071634-8c67e0a3-3e1c-4108-b63e-eb7616c5672f.jpg"),
        contentDescription = "profile image",
        modifier = Modifier
            .size(128.dp)
            .clip(CircleShape)
            .fillMaxSize()
            .border(2.dp, Color.Gray, CircleShape),
        contentScale = ContentScale.Crop
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewImage() {
    ProfileImage(url = "https://user-images.githubusercontent.com/59087018/171071634-8c67e0a3-3e1c-4108-b63e-eb7616c5672f.jpg")
}