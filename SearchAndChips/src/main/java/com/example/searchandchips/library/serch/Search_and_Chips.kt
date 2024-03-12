package com.example.searchandchips.library.serch

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.searchandchips.R
import com.example.searchandchips.library.adopters.Trycatch
import com.example.searchandchips.library.adopters.serchAdopter
import com.example.searchandchips.library.dataclass.Data

class Search_and_Chips @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : RelativeLayout(context, attrs, defStyleAttr) {



    init {
       Trycatch{ LayoutInflater.from(context).inflate(R.layout.searchandchips, this, true)
           Data.r1 = findViewById(R.id.serchresult)

           Data.r2 = findViewById(R.id.chips)

           Data.edit = findViewById(R.id.search)
           Data.b=findViewById(R.id.serchbutton)


       }

    }


}
