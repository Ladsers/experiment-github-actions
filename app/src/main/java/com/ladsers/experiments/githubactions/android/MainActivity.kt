package com.ladsers.experiments.githubactions.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.ladsers.experiments.githubactions.android.ui.theme.GithubActionsAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GithubActionsAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val version = BuildConfig.VERSION_NAME
                    val verCode = BuildConfig.VERSION_CODE
                    val buildType = BuildConfig.BUILD_TYPE

                    val msg = "Version: $version\nCode: $verCode\nBuild type: $buildType"
                    ShowMsg(msg)
                }
            }
        }
    }
}

@Composable
fun ShowMsg(msg: String, modifier: Modifier = Modifier) {
    Text(
        text = msg,
        fontSize = 22.sp,
        textAlign = TextAlign.Center,
        modifier = modifier
    )
}