package com.eimtest.sds.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import com.eimtest.sds.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach


@AndroidEntryPoint
class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val viewModel by viewModels<MainViewModel>()

    private val progressBar by lazy {
        findViewById<ProgressBar>(R.id.progressbar)
    }

    private val imageView by lazy {
        findViewById<ImageView>(R.id.imageView)
    }

    private val textView by lazy {
        findViewById<TextView>(R.id.textView)
    }

    private val buttonPrev by lazy {
        findViewById<Button>(R.id.buttonPrev)
    }

    private val buttonNext by lazy {
        findViewById<Button>(R.id.buttonNext)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonPrev.setOnClickListener(this)
        buttonNext.setOnClickListener(this)

        viewModel.state
            .onEach { state ->
                progressBar.isVisible = state.isLoading
                if (!state.isLoading && state.playlists.isNotEmpty()) {
                    // TODO:
                    //  - Play the music.
                    //  - Show image on image view.
                    //  - Display initials text on text view.
                    Toast.makeText(this, "Data", Toast.LENGTH_SHORT).show()
                }
            }
            .launchIn(lifecycleScope)

        viewModel.getPlaylist()
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.buttonPrev -> {
                // TODO:
                //  - Back to previous playlist
                Toast.makeText(this, "Previous clicked!", Toast.LENGTH_SHORT).show()
            }

            R.id.buttonNext -> {
                // TODO:
                //  - Go to next playlist
                Toast.makeText(this, "Next clicked!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}