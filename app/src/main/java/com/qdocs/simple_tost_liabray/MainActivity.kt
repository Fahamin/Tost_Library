package com.qdocs.simple_tost_liabray

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fahim.tost.MakeTost

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MakeTost.showToast(this,"Fahamin")
    }
}