package com.example.search_and_chips

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.searchandchips.library.dataclass.Data
import com.example.searchandchips.library.dataclass.serch
import com.example.searchandchips.library.serch.Search_and_Chips


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val randomWords = listOf("apple", "banana", "orange", "grape", "kiwi", "pear", "melon", "pineapple", "strawberry", "blueberry", "raspberry", "blackberry", "cherry", "peach", "apricot", "plum", "mango", "papaya", "lime", "lemon")
val f:Search_and_Chips
// Add random words to the data list
        repeat(100) {
            val randomIndex = (0 until randomWords.size).random()
            Data.data.add(randomWords[randomIndex])
        }

        Data.data.add("yusuf")
        val serc= serch(this)
        serc.init()
    }
}