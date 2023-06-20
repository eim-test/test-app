package com.eimtest.sds.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.eimtest.sds.R
import dagger.hilt.android.AndroidEntryPoint

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
        
        // TODO: Load playlist data
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.buttonPrev -> {
                // TODO: Back to previous playlist
            }

            R.id.buttonNext -> {
                // TODO: Go to next playlist
            }
        }
    }
}