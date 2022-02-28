package com.example.clocktypebutton.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.clocktypebutton.R
import com.example.clocktypebutton.activity.adapter.SettingRecyclerAdapter
import com.example.clocktypebutton.activity.dataclass.SettingList
import com.example.clocktypebutton.activity.util.HorizontalItemDecorator
import com.example.clocktypebutton.activity.util.VerticalItemDecorator

class SettingActivity : AppCompatActivity() {
    lateinit var settingRecyclerAdapter: SettingRecyclerAdapter
    private lateinit var settingRecyclerView : RecyclerView
    private val settingMenuList = mutableListOf<SettingList>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        settingRecyclerView = findViewById(R.id.settingActivityRecyclerView)

        initView()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun initView() {
        settingRecyclerAdapter = SettingRecyclerAdapter(this)
        settingRecyclerView.adapter = settingRecyclerAdapter

        settingMenuList.apply {
            add(SettingList("배경 설정"))
            add(SettingList("기록 삭제"))
            add(SettingList("버전 정보"))

            settingRecyclerAdapter.items = settingMenuList
            settingRecyclerAdapter.notifyDataSetChanged()
        }

        settingRecyclerView.addItemDecoration(VerticalItemDecorator(20))
        settingRecyclerView.addItemDecoration(HorizontalItemDecorator(10))
    }
}