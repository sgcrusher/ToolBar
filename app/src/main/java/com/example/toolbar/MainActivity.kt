package com.example.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.tbaddperson -> Toast.makeText(this, "Anda Menekan Add Person", Toast.LENGTH_LONG).show()
            R.id.tbfavorite -> Toast.makeText(this, "Anda Menekan Favorite", Toast.LENGTH_LONG).show()
            R.id.tbsetting -> Toast.makeText(this, "Anda Menekan Setting", Toast.LENGTH_LONG).show()
            R.id.tbFeedback -> Toast.makeText(this, "Anda Menekan Feedback", Toast.LENGTH_LONG).show()
            // finish() => program selesai
            R.id.tbClose -> finish()

        }
        return true
    }
}