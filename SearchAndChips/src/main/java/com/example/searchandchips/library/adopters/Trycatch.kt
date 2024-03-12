package com.example.searchandchips.library.adopters

import android.util.Log

class Trycatch (val trycatch:()->Unit){
    init {
        try {
            trycatch()
        }catch (E:Exception)
        {
            Log.e("error ","$E")
        }
    }
}