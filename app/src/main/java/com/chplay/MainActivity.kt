package com.chplay

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.chplay.adapter.ListAppAdapter
import com.chplay.data.DataSource
import com.chplay.databinding.ActivityMainBinding
import com.chplay.databinding.ListAppBinding
import com.chplay.model.ListApp

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var listAppBinding: ListAppBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        listAppBinding = ListAppBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listAppSet: List<ListApp> = listOf(
            ListApp("Social App", DataSource().loadSocialApp()),
            ListApp("Popular App", DataSource().loadPopularApp()),
            ListApp("Game", DataSource().loadGame()),
            ListApp("Productivity App", DataSource().loadProductivityApp())
        )

        binding.listItemRecyclerView.adapter = ListAppAdapter(this, listAppSet);


    }
}
