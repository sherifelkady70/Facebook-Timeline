package com.route.facebook_timeline

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class MyAdapter(var itemsList:ArrayList<Items>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var profileName : TextView = itemView.findViewById(R.id.profileName)
        var writeOfPost : TextView = itemView.findViewById(R.id.writeOfPost)
        var numOfLikes : TextView = itemView.findViewById(R.id.numOfLikes)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view : View = LayoutInflater.from(parent.context)
            .inflate(R.layout.postitems,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.profileName.text = itemsList[position].nameProfile
        holder.numOfLikes.text = itemsList[position].numOfLikes.toString()
        holder.writeOfPost.text = itemsList[position].writeOfPost
    }
}