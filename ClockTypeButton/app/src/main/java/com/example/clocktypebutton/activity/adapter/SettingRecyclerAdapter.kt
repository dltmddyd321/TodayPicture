package com.example.clocktypebutton.activity.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.clocktypebutton.R
import com.example.clocktypebutton.activity.dataclass.SettingList

class SettingRecyclerAdapter(private val context: Context) :
    RecyclerView.Adapter<SettingRecyclerAdapter.ViewHolder>() {

    var items = mutableListOf<SettingList>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SettingRecyclerAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_setting_recycler_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: SettingRecyclerAdapter.ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        private val settingMenuTitle : TextView = v.findViewById(R.id.settingMenuTitle)

        fun bind(item : SettingList) {
            settingMenuTitle.text = item.settingName
        }

    }
}