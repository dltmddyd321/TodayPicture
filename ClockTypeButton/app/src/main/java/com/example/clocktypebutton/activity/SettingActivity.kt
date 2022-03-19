package com.example.clocktypebutton.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.clocktypebutton.R
import com.example.clocktypebutton.activity.adapter.SettingRecyclerAdapter
import com.example.clocktypebutton.activity.dataclass.SettingList
import com.example.clocktypebutton.activity.util.HorizontalItemDecorator
import com.example.clocktypebutton.activity.util.VerticalItemDecorator
import kotlinx.android.synthetic.main.activity_setting.*

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
        settingRecyclerAdapter.setOnItemClickListener(object : SettingRecyclerAdapter.OnItemClickListener {
            override fun onItemClick(v: View, item: SettingList, position: Int) {
                Toast.makeText(this@SettingActivity, "제목 : ${item.settingName}", Toast.LENGTH_SHORT).show()
            }
        })

        settingMenuList.apply {
            add(SettingList(getString(R.string.background_setting)))
            add(SettingList(getString(R.string.delete_record)))
            add(SettingList(getString(R.string.version_info)))

            settingRecyclerAdapter.items = settingMenuList
            settingRecyclerAdapter.notifyDataSetChanged()
        }

        settingRecyclerView.addItemDecoration(VerticalItemDecorator(20))
        settingRecyclerView.addItemDecoration(HorizontalItemDecorator(10))
    }
}