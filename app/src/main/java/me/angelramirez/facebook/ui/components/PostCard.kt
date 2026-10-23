package me.angelramirez.facebook.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun PostCard() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        PostHeader(
            username = "Angel Ramirez",
            time = "Hace 2 horas"
        )
        Text(
            text = "Por fin termine la Pantalla de login",
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp)
        )
        AsyncImage(
            model = "https://images.unsplash.com/photo-1618005182384-a83a8bd57fbe",
            contentDescription = "Post Image Example",
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .padding(top = 8.dp),
            contentScale = ContentScale.Crop
        )
        PostStats(
            likesCount = "124",
            commentsAndSharesText = "45 comentarios · 12 compartidos"
        )
        PostActions()
    }
}

@Preview(showBackground = true)
@Composable
fun PostCardPreview() {
    PostCard()
}
