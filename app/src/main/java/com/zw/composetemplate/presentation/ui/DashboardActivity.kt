package com.zw.composetemplate.presentation.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.bharadwaj.navigationbarmedium.MainActivity
import com.zw.composetemplate.R
import com.zw.composetemplate.presentation.viewmodels.DashboardViewModel
import dagger.hilt.android.AndroidEntryPoint
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@AndroidEntryPoint
class DashboardActivity : ComponentActivity() {
    private val viewModel: DashboardViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        // Handle the splash screen transition.
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        setContent {
            DashboardScreen()
        }

        // Keep the splash screen visible for this Activity.
        splashScreen.setKeepOnScreenCondition { viewModel.initialSataLoad.value == false }

        // Set up an OnPreDrawListener to the root view.
//        val content: View = findViewById(android.R.id.content)
//        content.viewTreeObserver.addOnPreDrawListener(
//            object : ViewTreeObserver.OnPreDrawListener {
//                override fun onPreDraw(): Boolean {
//                    // Check whether the initial data is ready.
//                    return if (viewModel.initialSataLoad.value == true) {
//                        // The content is ready. Start drawing.
//                        content.viewTreeObserver.removeOnPreDrawListener(this)
//                        true
//                    } else {
//                        // The content isn't ready. Suspend.
//                        false
//                    }
//                }
//            }
//        )
        viewModel.setLoaded(true)

//
//        // Add a callback that's called when the splash screen is animating to the
//        // app content.
//        splashScreen.setOnExitAnimationListener { splashScreenViewProvider ->
//            val splashScreenView = splashScreenViewProvider.view
//            // Create your custom animation.
//            val slideUp = android.animation.ObjectAnimator.ofFloat(
//                splashScreenView,
//                View.TRANSLATION_Y,
//                0f,
//                -splashScreenView.height.toFloat()
//            )
//            slideUp.interpolator = AnticipateInterpolator()
//            slideUp.duration = 200L
//
//            // Call SplashScreenView.remove at the end of your custom animation.
//            slideUp.doOnEnd { splashScreenViewProvider.remove() }
//
//            // Run your animation.
//            slideUp.start()
//
//
//            // Get the duration of the animated vector drawable.
//            val animationDuration = splashScreenView.iconAnimationDuration
//            // Get the start time of the animation.
//            val animationStart = splashScreenView.iconAnimationStart
//            // Calculate the remaining duration of the animation.
//            val remainingDuration = if (animationDuration != null && animationStart != null) {
//                (animationDuration - Duration.between(animationStart, Instant.now()))
//                    .toMillis()
//                    .coerceAtLeast(0L)
//            } else {
//                0L
//            }
//
//        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen() {
    val context = LocalContext.current
    Scaffold(
        topBar = { CenterAlignedTopAppBar(
            title = { Text(text = stringResource(R.string.app_name), fontSize = 18.ssp) }
        ) },
        content = { padding ->
            Column(modifier = Modifier.padding(padding)) {
                Text(text = "Bottom Navigation Demo", modifier = Modifier.clickable {
                    context.startActivity(Intent(context, MainActivity::class.java))
                }.fillMaxWidth().padding(8.sdp).padding(2.sdp), color = Color.White, fontSize = 16.ssp)
                Text(text = "Side Menu Navigation Demo", modifier = Modifier.clickable {
                    context.startActivity(Intent(context,com.example.jpsampledrawer.MainActivity::class.java))
                }.fillMaxWidth().padding(8.sdp).padding(2.sdp), color = Color.White, fontSize = 16.ssp)
            }
        },
        containerColor = colorResource(R.color.colorPrimaryDark) // Set background color to avoid the white flashing when you switch between screens
    )
}
