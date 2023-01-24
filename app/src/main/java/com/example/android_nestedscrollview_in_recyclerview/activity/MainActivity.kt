package com.example.android_nestedscrollview_in_recyclerview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_nestedscrollview_in_recyclerview.R
import com.example.android_nestedscrollview_in_recyclerview.adapter.CustomAdapter
import com.example.android_nestedscrollview_in_recyclerview.model.Member

class MainActivity : AppCompatActivity() {

    var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        intiViews()

        val members = preapreMemberList()
        refreshAdapter(members)
    }


    private fun intiViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView!!.layoutManager = GridLayoutManager(this, 1)
        recyclerView!!.isNestedScrollingEnabled = true
    }

    private fun refreshAdapter(members: List<Member>) {
        val adapter = CustomAdapter(this, members = members);
        recyclerView!!.adapter = adapter
    }

    private fun preapreMemberList(): List<Member> {
        val members = ArrayList<Member>()
        for (i in 0..29) {
            members.add(Member("", ""))
        }
        return members
    }
}