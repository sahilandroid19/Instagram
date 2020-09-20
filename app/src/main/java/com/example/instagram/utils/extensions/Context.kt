package com.example.instagram.utils.extensions

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Handler

inline fun <reified T : Activity> Context.startNewActivity() {
    startActivity(Intent(this, T::class.java))
}
