package com.nguyendinhdoan.view_binding_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nguyendinhdoan.view_binding_kotlin.bindings.bind
import com.nguyendinhdoan.view_binding_kotlin.databinding.ActivityMainBinding
import com.nguyendinhdoan.view_binding_kotlin.models.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val user = User(1, "doannd", 12)
        binding?.bind(user)
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }
}
