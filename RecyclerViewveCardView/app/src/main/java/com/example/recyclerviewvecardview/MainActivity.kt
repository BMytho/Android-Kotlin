package com.example.recyclerviewvecardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerviewvecardview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var ulkelerList:ArrayList<Ulkeler>
    private lateinit var adapter: RVAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rv.setHasFixedSize(true)
        //binding.rv.layoutManager = LinearLayoutManager(this)
        binding.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
       // binding.rv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        val u1 = Ulkeler(1,"Türkiye")
        val u2 = Ulkeler(2,"İtalya")
        val u3 = Ulkeler(3,"Japonya")
        val u4 = Ulkeler(4,"Rusya")

        ulkelerList = ArrayList<Ulkeler>()
        ulkelerList.add(u1)
        ulkelerList.add(u2)
        ulkelerList.add(u3)
        ulkelerList.add(u4)

        adapter = RVAdapter(this,ulkelerList)

        binding.rv.adapter = adapter



    }
}