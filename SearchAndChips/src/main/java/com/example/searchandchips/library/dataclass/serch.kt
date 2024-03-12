package com.example.searchandchips.library.dataclass


import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.searchandchips.R
import com.example.searchandchips.library.adopters.Trycatch
import com.example.searchandchips.library.adopters.chipsAdopter
import com.example.searchandchips.library.adopters.serchAdopter

class serch(val context: Context) : serchAdopter.serchclick, chipsAdopter.chipsclick {
    val capturedata = Data.data
    fun init() {
        Data.r1?.layoutManager = LinearLayoutManager(context)
        Data.r2?.layoutManager = GridLayoutManager(context, 2)
        Trycatch {
            Data.edit?.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                    Data.serchDara.removeAll(Data.serchDara)
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    Data.data.forEachIndexed { index, String ->
                        if (String.contains(s.toString(), true)) {
                            Data.serchDara.add(String)
                            Data.r1?.adapter = serchAdopter(Data.serchDara, this@serch)
                        }
                    }
                }

                override fun afterTextChanged(s: Editable?) {
                    if (Data.edit?.text!!.isEmpty()) {

                        Data.r1?.visibility = View.GONE
                        Data.b?.setImageResource(R.drawable.search)
                    }else
                    {Data.r1?.visibility = View.VISIBLE
                        Data.b?.setImageResource(R.drawable.cancel)

                    }
                    Data.b?.setOnClickListener {

                        Data.r1?.visibility = View.GONE
                        Data.b?.setImageResource(R.drawable.search)
                    }
                }

            })
        }

    }

    override fun serchonclick(position: Int, data: String) {
        Trycatch {
            Data.chips.add(data)
            Data.r2?.adapter = chipsAdopter(Data.chips, this@serch)

        }
    }

    override fun deleteitem(position: Int, deletdata: String) {
        Trycatch {
            if (position in 0 until Data.chips.size) {
                Data.chips.removeAt(position)
                Data.r2?.adapter = chipsAdopter(Data.chips, this@serch)
            } else {
                // Handle the case where position is out of bounds
                Log.e("Delete Item", "Invalid position: $position")
                Data.chips.removeAll(Data.chips)
                Data.r2?.adapter = chipsAdopter(Data.chips, this@serch)
            }
        }
    }

    fun decoration(Decor: (View) -> Unit) {


    }
}