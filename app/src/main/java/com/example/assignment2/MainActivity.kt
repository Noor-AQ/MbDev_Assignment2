package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater= menuInflater
        inflater.inflate(R.menu.navigate_fragments_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val mediumFragment= Art_Medium()
        val customFragment= Paper_Customize()
        when(item.itemId){
            R.id.item1->{
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragmentContainerView,mediumFragment)
                    commit()
                }

            }
            R.id.item2->{
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragmentContainerView,customFragment)
                    commit()
                }
            }
        }
        return true;
    }
}