package ru.clementl.vk_sdk_template.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.clementl.vk_sdk_template.R
import ru.clementl.vk_sdk_template.models.FriendModel

class FriendsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var mFriendsList: ArrayList<FriendModel> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.cell_friend, parent, false)
        return FriendsViewHolder(itemView = itemView)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return mFriendsList.size

    }

    class FriendsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

}