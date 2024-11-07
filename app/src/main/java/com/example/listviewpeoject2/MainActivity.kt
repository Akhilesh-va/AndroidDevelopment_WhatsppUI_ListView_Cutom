package com.example.listviewpeoject2

import MyAdapter
import User
import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var userArrayList : ArrayList<User>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
            val name = arrayOf("You","Didi","Mami","Papa","Official")
            val lastMsg = arrayOf("www.androiddev.com","Phuch gye ghr?" ,"Market se dhaniya le ana","paise bhej diye beta","Surprise Test")
            val time = arrayOf("12:11 AM","2:35 PM","6:30 PM","11:17 AM","8:32 PM")
            val phoneNum = arrayOf("+916736743783", "+916736743783", "+91234567890", "+9155347890", "+954534567890")
            val imageId= intArrayOf(R.drawable.pic0,R.drawable.pic1,R.drawable.pic3,R.drawable.pic2,R.drawable.pic0)
        userArrayList=ArrayList()
        for(eachIndex in name.indices){
            val user=User(name[eachIndex],lastMsg[eachIndex],time[eachIndex],phoneNum[eachIndex],imageId[eachIndex])
            // yaha pe object bnaya hai user class hai ye sb uske parameter hai
            userArrayList.add(user)

        }
        // adapter bnayenge
        val listView = findViewById<ListView>(R.id.lv)
        listView.isClickable=true
        listView.adapter=MyAdapter(this,userArrayList)

    }
}