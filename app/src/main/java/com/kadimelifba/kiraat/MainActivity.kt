package com.kadimelifba.kiraat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.kadimelifba.kiraat.takdim.tarz.KıraatTheme
import com.kadimelifba.kiraat.takdim.unsurlar.OsmaniMetinSahasi

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()

        super.onCreate(savedInstanceState)
        setContent {
            KıraatTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SerLevha()
                }
            }
        }
    }
}

@Composable
fun SerLevha(modifier: Modifier = Modifier) {
    OsmaniMetinSahasi(modifier = modifier,osmaniMetin = "قديم الفبا" )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KıraatTheme {
        SerLevha()
    }
}