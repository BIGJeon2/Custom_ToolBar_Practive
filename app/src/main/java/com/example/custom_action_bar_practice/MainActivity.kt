package com.example.custom_action_bar_practice

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar
import com.example.custom_action_bar_practice.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setSupportActionBar(findViewById(R.id.toolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.tool_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.intent -> {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            true
        }
        R.id.text_sizedown -> {
            binding.TextView.setTextSize(10F)
            true
        }
        R.id.text_sizeup -> {
            binding.TextView.setTextSize(15F)
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}