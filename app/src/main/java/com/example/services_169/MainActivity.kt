package com.example.services_169

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Button Fb jika diklik
        btn_fb.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/azizbonzeu.cxom"))
            startActivity(i)
        })
         // Button Ig Jika Di klik
            btn_ig.setOnClickListener({
                val i = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.instagram.com/bonzeu.doc"))
                startActivity(i)
            })
        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this,R.raw.rindu_sahabat)

            //button play
        btn_play.setOnClickListener {
            MediaPlayer?.start()
        }
        // Buttton Pause
        btn_pause.setOnClickListener {
            MediaPlayer?.pause()
        }
        //Buttton Stop
        btn_stop.setOnClickListener {
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}
