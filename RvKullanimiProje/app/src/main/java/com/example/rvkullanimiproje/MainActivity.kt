package com.example.rvkullanimiproje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.rvkullanimiproje.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var formalarArrayList:ArrayList<Formalar>
    private lateinit var adapter: FormalarAdapter




    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val f1 = Formalar(1,"Arsenal","arsenal",1500.00)
        val f2 = Formalar(2,"Galatasaray","galatasaray",2500.00)
        val f3 = Formalar(3,"Liverpool","liverpool",1199.99)
        val f4 = Formalar(4,"Milan","milan",1300.00)
        val f5 = Formalar(5,"Porto","porto",999.99)
        val f6 = Formalar(6,"Türkiye","turkiye",1100.00)

        formalarArrayList = ArrayList<Formalar>()

        formalarArrayList.add(f1)
        formalarArrayList.add(f2)
        formalarArrayList.add(f3)
        formalarArrayList.add(f4)
        formalarArrayList.add(f5)
        formalarArrayList.add(f6)


        adapter = FormalarAdapter(applicationContext,formalarArrayList)

        binding.rv.adapter = adapter






    }
}