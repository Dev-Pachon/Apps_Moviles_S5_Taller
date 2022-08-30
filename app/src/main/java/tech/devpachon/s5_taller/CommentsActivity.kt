package tech.devpachon.s5_taller

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CommentsActivity(itemView:View) :RecyclerView.ViewHolder(itemView){

    var userName : TextView = itemView.findViewById(R.id.userNameTV)
    var userImage : ImageView = itemView.findViewById(R.id.videoIV)
    var commentDate : TextView = itemView.findViewById(R.id.channelTV)
    var commentDescription : TextView = itemView.findViewById(R.id.titleTV)
    var commentNumLikes : TextView = itemView.findViewById(R.id.durationTV)
}