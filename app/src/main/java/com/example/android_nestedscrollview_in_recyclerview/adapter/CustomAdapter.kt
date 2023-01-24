package com.example.android_nestedscrollview_in_recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android_nestedscrollview_in_recyclerview.R
import com.example.android_nestedscrollview_in_recyclerview.model.Member

class CustomAdapter(var context: Context, var members: List<Member>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemCount(): Int {
        return members.size
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(viewGroup.getContext())
            .inflate(R.layout.item_custom_layout_view, viewGroup, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is CustomViewHolder) {

        }
    }


}

class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}