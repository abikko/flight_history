package kz.edu.astanait.android.ilonmaskflighthistory

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import kz.edu.astanait.android.ilonmaskflighthistory.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val appBarConfiguration = AppBarConfiguration(
            setOf(R.id.savedFlightHistoryFragment, R.id.flightHistoryFragment)
        )
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        val navController = navHostFragment.navController
        NavigationUI.setupWithNavController(binding.bottomNavBar, navController)
        NavigationUI.setupWithNavController(binding.toolbar, navController, appBarConfiguration)
    }
}