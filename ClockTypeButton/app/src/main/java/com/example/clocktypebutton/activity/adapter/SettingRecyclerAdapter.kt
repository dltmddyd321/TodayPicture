package com.example.clocktypebutton.activity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.clocktypebutton.R
import com.example.clocktypebutton.activity.dataclass.SettingList

class SettingRecyclerAdapter(private val items : ArrayList<SettingList>) :
    RecyclerView.Adapter<SettingRecyclerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SettingRecyclerAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_setting_recycler_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: SettingRecyclerAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val settingMenuTitle : TextView = v.findViewById(R.id.settingMenuTitle)
    }
}