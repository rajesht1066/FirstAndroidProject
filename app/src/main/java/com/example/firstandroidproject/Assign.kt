package com.example.firstandroidproject

import android.media.AudioAttributes
import android.media.AudioManager
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity


class Assign : AppCompatActivity() {

    // on below line we are creating a variable.
//    lateinit var videoView: VideoView
//    val videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4"


    // on below line we are creating
    // variable for both of our image buttons.
    lateinit var playIB: ImageButton
    lateinit var pauseIB: ImageButton
    lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.audio_main)

//        val text: TextView = findViewById(R.id.textView16)
//        val s: String = "This is <i>italic</i> <b>bold</b> <u>underlined</u> <br>Goto <a href='https://www.geeksforgeeks.org'>Geeks for Geeks</a>"
//        text.text = Html.fromHtml(s, Html.FROM_HTML_MODE_COMPACT)




//        // on below line we are initializing our variables.
//        videoView = findViewById(R.id.idVideoView)
//
//        // Uri object to refer the
//        // resource from the videoUrl
//        val uri = Uri.parse(videoUrl)
//
//        // sets the resource from the
//        // videoUrl to the videoView
//        videoView.setVideoURI(uri)
//
//        // creating object of
//        // media controller class
//        val mediaController = MediaController(this)
//
//        // sets the anchor view
//        // anchor view for the videoView
//        mediaController.setAnchorView(videoView)
//
//        // sets the media player to the videoView
//        mediaController.setMediaPlayer(videoView)
//
//        // sets the media controller to the videoView
//        videoView.setMediaController(mediaController);
//
//        // starts the video
//        videoView.start();



        // on below line we are initializing
        // our buttons with id.
        playIB = findViewById(R.id.idIBPlay)
        pauseIB = findViewById(R.id.idIBPause)

        // on below line we are
        // initializing our media player
        mediaPlayer = MediaPlayer()

        playIB.setOnClickListener {

            // on below line we are creating a variable for our audio url
            var audioUrl = "https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3"

            // on below line we are setting audio stream
            // type as stream music on below line.
            mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC)

            // on below line we are running a try
            // and catch block for our media player.
            try {
                // on below line we are setting audio
                // source as audio url on below line.
                mediaPlayer.setDataSource(audioUrl)

                // on below line we are
                // preparing our media player.
                mediaPlayer.prepare()

                // on below line we are
                // starting our media player.
                mediaPlayer.start()

            } catch (e: Exception) {

                // on below line we are handling our exception.
                e.printStackTrace()
            }
            // on below line we are displaying a toast message as audio player.
            Toast.makeText(applicationContext, "Audio started playing..", Toast.LENGTH_SHORT).show()

        }

        pauseIB.setOnClickListener {
            // on below line we are checking
            // if media player is playing.
            if (mediaPlayer.isPlaying) {
                // if media player is playing we
                // are stopping it on below line.
                mediaPlayer.stop()

                // on below line we are resetting
                // our media player.
                mediaPlayer.reset()

                // on below line we are calling
                // release to release our media player.
                mediaPlayer.release()

                // on below line we are displaying a toast message to pause audio/
                Toast.makeText(applicationContext, "Audio has been  paused..", Toast.LENGTH_SHORT)
                    .show()

            } else {
                // if audio player is not displaying we are displaying below toast message
                Toast.makeText(applicationContext, "Audio not played..", Toast.LENGTH_SHORT).show()
            }

        }
    }
}