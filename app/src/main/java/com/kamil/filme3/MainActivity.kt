package com.kamil.filme3

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kamil.filme3.ui.theme.Filme3Theme
import com.kamil.filme3.ui.theme.ListOfMemories
import com.kamil.filme3.ui.theme.MemoryData
import com.kamil.filme3.ui.theme.loadMemoryCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Filme3Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    LoadUI()
                }
            }
        }
    }
}

@Preview
@Composable
fun LoadUI() {
    Column(modifier = Modifier.padding(5.dp)) {
        Column(
            modifier = Modifier
                .padding(5.dp)
                .verticalScroll(rememberScrollState())
        ){
            ListOfMemories().forEach{ memoryData ->
                loadMemoryCard(memoryData = memoryData)
            }
        }

    }
}
