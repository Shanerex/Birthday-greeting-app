package com.example.birthdaygreeter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {
        val name=nameInput.editableText.toString()
        Toast.makeText(this,"Card is being prepared for $name",Toast.LENGTH_SHORT).show()
        val intent=Intent(this, BirthdayGreeterActivity::class.java)
        intent.putExtra(BirthdayGreeterActivity.NAME_EXTRA,name)
        startActivity(intent)
    }
}