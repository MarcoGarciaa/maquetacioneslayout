package com.example.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.layouts.ui.theme.LayoutsTheme
import android.content.Intent
import android.view.View
import android.widget.Button

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1: Button = findViewById(R.id.boton1)
        val boton2: Button = findViewById(R.id.boton2)
        val boton3: Button = findViewById(R.id.boton3)
        val boton4: Button = findViewById(R.id.boton4)
        val boton5: Button = findViewById(R.id.boton5)
        val boton6: Button = findViewById(R.id.boton6)

        boton1.setOnClickListener {
            val intent = Intent(this@MainActivity, LinearLayoutA::class.java)
            startActivity(intent)
        }

        boton2.setOnClickListener {
            val intent = Intent(this@MainActivity, LinearLayoutB::class.java)
            startActivity(intent)
        }

        boton3.setOnClickListener {
            val intent = Intent(this@MainActivity, TableLayoutA::class.java)
            startActivity(intent)
        }

        boton4.setOnClickListener {
            val intent = Intent(this@MainActivity, TableLayoutB::class.java)
            startActivity(intent)
        }

        boton5.setOnClickListener {
            val intent = Intent(this@MainActivity, ConstraintLayoutA::class.java)
            startActivity(intent)
        }

        boton6.setOnClickListener {
            val intent = Intent(this@MainActivity, ConstrainLayoutB::class.java)
            startActivity(intent)
        }
    }
}