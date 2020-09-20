package com.example.instagram.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.instagram.R
import com.example.instagram.utils.extensions.startNewActivity
import kotlinx.android.synthetic.main.layout_bottom_navigation_view.*

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(setLayout())

        setUpData()
    }

    abstract fun setLayout(): Int

    open fun setUpData() {}
}