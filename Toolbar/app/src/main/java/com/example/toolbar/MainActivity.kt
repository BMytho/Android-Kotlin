package com.example.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import com.example.toolbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),SearchView.OnQueryTextListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setSupportActionBar(binding.myToolbar)


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu,menu)
        val item = menu.findItem(R.id.actionAra)
        val searchView = item.actionView as SearchView
        searchView.setOnQueryTextListener(this)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId) {
            R.id.actionBilgi -> {
                Toast.makeText(applicationContext, "Bilgi Tıklandı", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.actionAyarlar -> {
                Toast.makeText(applicationContext, "Ayarlar Tıklandı", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.actionEkle -> {
                Toast.makeText(applicationContext, "Ekle Tıklandı", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.actionCikis -> {
                Toast.makeText(applicationContext, "Çıkış  Tıklandı", Toast.LENGTH_SHORT).show()
                return true
            }

            else ->return super.onOptionsItemSelected(item)
        }



    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        Log.e("OnQueryTextSubmit", query!!)
        return true
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        Log.e("OnQueryTextChange", newText!!)
       return true
    }


}
