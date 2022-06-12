package com.example.compose_card_example.ui.components.molecules

import android.os.Build
import androidx.annotation.DrawableRes
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun InfoRow(@DrawableRes icon: Int, text: String, contentDescription: String) {
    Row(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 4.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = contentDescription,
        modifier = Modifier.padding(end = 44.dp)
        )
        Text(text = text)
    }
}

@Composable
@Preview
fun PreviewInfoRow() {
    InfoRow(
        icon = android.R.drawable.ic_menu_call,
        text = "+81 (080) 8111 0333",
        contentDescription = "Tel"
    )
}