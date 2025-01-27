package com.example.playerapp.ui.screen.playlistDetailScreen

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.playerapp.R

@Composable
fun PlaylistDetailScreenPoster(modifier: Modifier = Modifier, @DrawableRes drawable: Int) {
    Card(
        modifier = modifier,
        shape = CircleShape.copy(CornerSize(32.dp)),
        elevation = CardDefaults.cardElevation(defaultElevation = 20.dp)
    ) {
        Image(painter = painterResource(id = drawable), contentDescription = "poster")
    }
}


@Preview
@Composable
fun PlaylistDetailScreenPosterPreview() {
    PlaylistDetailScreenPoster(drawable = R.drawable.img_poster)
}