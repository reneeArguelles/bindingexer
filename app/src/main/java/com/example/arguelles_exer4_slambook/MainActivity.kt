package com.example.arguelles_exer4_slambook

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.arguelles_exer4_slambook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val person: Person = Person()
    private lateinit var clickableViews: Array<View>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.person = person


        binding.doneButton.setOnClickListener{
            //some function
            displayInfo()
        }
    }

    private fun setListeners(){
        binding.apply{
            person?.name = nameEditText.text.toString()
            person?.nickname = nicknameEdit.text.toString()
            person?.age = ageEdit.text.toString()
            //person?.
        }
    }


    private fun displayInfo(){

    }
}
