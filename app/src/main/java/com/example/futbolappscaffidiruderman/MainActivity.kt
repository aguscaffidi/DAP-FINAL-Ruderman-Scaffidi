package com.example.futbolappscaffidiruderman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore

class MainActivity : AppCompatActivity() {
  private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val db = Firebase.firestore

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.logInFragment) as? NavHostFragment
        if (navHostFragment != null) {
            navController = navHostFragment.navController
        } else {

        }
    }
    }