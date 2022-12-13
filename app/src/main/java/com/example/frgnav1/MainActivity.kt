package com.example.frgnav1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.frgnav1.databinding.ActivityMainBinding

import org.w3c.dom.Text
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var button_app: Button
    private lateinit var edit_tex : EditText
    private lateinit var first_fragment_text: TextView




    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = Navigation.findNavController(this, R.id.nav_fragment)
        setupWithNavController(binding.bottomNavigation, navController)

//        button_app.setOnClickListener {
//            val userName = edit_tex.text
//            val massage = "Welcome  $userName"
//            first_fragment_text.text = massage
//        }

    }
}