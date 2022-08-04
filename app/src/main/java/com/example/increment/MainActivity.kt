package com.example.increment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.increment.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val songObjects: MutableList<Song> = mutableListOf<Song>()
        songObjects.add(Song(title = "hello", description = "just descrption"))
        songObjects.add(Song(title = "hello2", description = "just description2"))
        songObjects.add(Song(title = "my song", description = "just description3"))
        songObjects.add(Song(title = "listen", description = "just description4"))
        songObjects.add(Song(title = "123song", description = "just description5"))
        songObjects.add(Song(title = "daljit", description = "just description6"))
        songObjects.add(Song(title = "latest song", description = "just description7"))
        songObjects.add(Song(title = "latest song2", description = "just description8"))
        songObjects.add(Song(title = "latest song3", description = "just description9"))
        songObjects.add(Song(title = "latest song4", description = "just description10"))


        binding.songList.adapter = MyAdapter(songObjects)
        binding.songList.layoutManager = LinearLayoutManager(this)


    }
}