package com.example.recipebook.view

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class AppActivity {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = AppActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // навигация + отслеживание нажатия
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setupWithNavController(navController)

        navController.addOnDestinationChangedListener { _, _, arguments ->
            binding.bottomNavigation.isVisible =
                arguments?.getBoolean("ShowAppBar", false) == true
        }
    }
}