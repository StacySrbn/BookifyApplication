package com.example.homelibrary.presentation.home_main.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.*
import coil.compose.rememberAsyncImagePainter
import com.example.homelibrary.R
import com.example.homelibrary.domain.model.MyAuthor
import com.example.homelibrary.presentation.Dimens

@Composable
fun AuthorCardViewHolder(
    author: MyAuthor,
    lastItemEndPadding: Dp
){
    Column {
        Box(
            modifier = Modifier
                .wrapContentSize()
                .padding(start = Dimens.MediumPadding, end = lastItemEndPadding)
                .clickable { }
        ) {
            Image(
                modifier = Modifier
                    .size(102.dp)
                    .clip(CircleShape),
                painter = rememberAsyncImagePainter(author.photoUrl),
                contentScale = ContentScale.Crop,
                contentDescription = null
            )
            Spacer(modifier = Modifier.height(Dimens.ExtraSmallPadding))
            Text(
                text = author.name,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = author.profession,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                color = colorResource(id = R.color.graphite),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}