package com.deckle.ecougars

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.MotionEvent
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.swiping)

    findViewById<ImageButton>(R.id.like_button).setOnClickListener {
        
    }

    findViewById<ImageButton>(R.id.dislike_button).setOnClickListener {

    }




    }
}