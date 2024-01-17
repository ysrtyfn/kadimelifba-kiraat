package com.kadimelifba.kiraat.takdim.unsurlar

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import com.kadimelifba.kiraat.takdim.tarz.kadimElifbaTemel


@Composable
fun OsmaniMetinSahasi(
    modifier: Modifier = Modifier,
    osmaniMetin: String,
    metinBediiyeti : TextStyle = MaterialTheme.typography.kadimElifbaTemel ){

    Text(text = osmaniMetin,
        style = metinBediiyeti,
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.then(modifier) )
}
