package com.example.bednieradaasaqme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val images = listOf<Image>(
            Image("ფარშევანგმა გაშალა კუდი", R.drawable.farshevangi1),
            Image("მალე ფინალურია", R.drawable.farshevangi2),
            Image("იმედია ფინალურზეც გაშლის ფარშევანგი კუდს", R.drawable.farshevangi3),
            Image("ეს ყველაზე ლამაზი ფარშევანგია", R.drawable.farshevangi4),
            Image("ბედნიერედაა საქმე?", R.drawable.farshevangi5)
        )

        val recyclerView = findViewById<RecyclerView>(R.id.imagesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, images)

    }
}

