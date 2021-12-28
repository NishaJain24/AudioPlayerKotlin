package com.nishajain.audioplayerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rv: RecyclerView
    lateinit var adapter: AudioAdapter
    var list = ArrayList<AudioModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv = findViewById(R.id.rv)
        rv.layoutManager = LinearLayoutManager(this)
        loadtracks()
    }

    fun loadtracks() {
        list.clear()
        list.add(AudioModel("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3"))
        list.add(AudioModel("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-2.mp3"))
        list.add(AudioModel("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-9.mp3"))
        list.add(AudioModel("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-13.mp3"))
        list.add(AudioModel("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-16.mp3"))

        adapter = AudioAdapter(this, list)
        rv.adapter = adapter

    }

}