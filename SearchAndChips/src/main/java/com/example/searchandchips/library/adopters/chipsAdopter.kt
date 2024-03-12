package com.example.searchandchips.library.adopters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.searchandchips.R


class chipsAdopter(var data:ArrayList<String>,val accesser:chipsclick):RecyclerView.Adapter<chipsAdopter.V>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): chipsAdopter.V {
        val lay=LayoutInflater.from(parent.context).inflate(R.layout.chips,parent,false)
        return V(lay)
    }

    override fun onBindViewHolder(holder: chipsAdopter.V, position: Int) {
        val current=data[position]
        holder.text.text=current
    }

    override fun getItemCount(): Int {
        return data.size
    }
    inner   class V(v:View):RecyclerView.ViewHolder(v)
    {
        val text:TextView=v.findViewById(R.id.chipstext)
        val buttom:ImageView=v.findViewById(R.id.chipsbutton)
        init {
            buttom.setOnClickListener {
                accesser.deleteitem(position,data[position])
            }
        }
    }
    interface chipsclick{
        fun deleteitem(position: Int,deletdata:String)
    }
}