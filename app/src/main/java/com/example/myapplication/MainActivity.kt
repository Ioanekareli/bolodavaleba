package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.tools.dataclass
import com.example.myapplication.tools.programingadapter

class MainActivity : AppCompatActivity() {
    private  lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val programireba = ArrayList<dataclass>()

        programireba.add(dataclass("https://cdn3.iconfinder.com/data/icons/logos-and-brands-adobe/512/267_Python-512.png","Python"))
        programireba.add(dataclass("https://user-images.githubusercontent.com/42747200/46140125-da084900-c26d-11e8-8ea7-c45ae6306309.png","C++"))
        programireba.add(dataclass("https://cdn.iconscout.com/icon/free/png-512/c-programming-569564.png","C Programming Languange"))
        programireba.add(dataclass("https://cdn.iconscout.com/icon/free/png-256/java-60-1174953.png","Java "))
        programireba.add(dataclass("https://cdn3.iconfinder.com/data/icons/payment-method-1/64/_Paypal-39-512.png","PayPal"))
        programireba.add(dataclass("https://e7.pngegg.com/pngimages/466/228/png-clipart-android-studio-integrated-development-environment-logo-android-studio-logo.png","Android Studio"))
        programireba.add(dataclass("https://images.vexels.com/media/users/3/166383/isolated/preview/6024bc5746d7436c727825dc4fc23c22-html-programming-language-icon-by-vexels.png","HTML5"))


        val adapter= programingadapter(programireba)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

    }
}