package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buGetAge.setOnClickListener{
            //add code when you click
                ButtonClick()

        }
    }
        fun ButtonClick() {
            var userDOB : Int = Integer.parseInt(etDOB.text.toString())
            var currentYear:Int = Calendar.getInstance().get(Calendar.YEAR)
            var userAgeInYears:Int = currentYear - userDOB
            tvShowAge.text= "Tuổi của bạn là $userAgeInYears tuổi"
        }

}