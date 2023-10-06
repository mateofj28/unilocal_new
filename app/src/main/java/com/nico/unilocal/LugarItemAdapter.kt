package com.nico.unilocal

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nico.unilocal.models.Lugar

class LugarItemAdapter(private var items: List<Lugar>): RecyclerView.Adapter<LugaresViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LugaresViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.lugar_item, parent, false)
        return LugaresViewHolder(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: LugaresViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}




