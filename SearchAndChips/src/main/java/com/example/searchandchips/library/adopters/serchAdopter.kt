package com.example.searchandchips.library.adopters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.searchandchips.R


class serchAdopter(val data:ArrayList<String>,val ab:serchclick):RecyclerView.Adapter<serchAdopter.V>() {
    inner  class V(v:View):RecyclerView.ViewHolder(v)
    {
        val  text:TextView=v.findViewById(R.id.serchitem)
        init {
            text.setOnClickListener {
                ab.serchonclick(position,data[position])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): V {
        val lay=LayoutInflater.from(parent.context).inflate(R.layout.serchlayout,parent,false)
        return V(lay)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: V, position: Int) {
        val current=data[position]
        holder.text.text=current
    }
    interface serchclick{
        fun serchonclick(position: Int,data:String)
    }
}