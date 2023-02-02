package com.vt.kotlinexamples.inheritence

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.vt.kotlinexamples.R
import com.vt.kotlinexamples.TestInterface
import com.vt.kotlinexamples.databinding.ActivityChildClassBinding

class ChildClass : ParentClass(), TestInterface {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityChildClassBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityChildClassBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_child_class)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

    }

    override fun testMethod() {
        TODO("Not yet implemented")
    }

//    override fun onSupportNavigateUp(): Boolean {
//        val navController = findNavController(R.id.nav_host_fragment_content_child_class)
//        return navController.navigateUp(appBarConfiguration)
//                || super.onSupportNavigateUp()
//    }
}