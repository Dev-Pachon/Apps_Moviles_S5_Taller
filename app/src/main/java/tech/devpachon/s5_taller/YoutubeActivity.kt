package tech.devpachon.s5_taller

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class YoutubeActivity(itemView:View) :RecyclerView.ViewHolder(itemView){

    var videoImage : ImageView = itemView.findViewById(R.id.videoIV)
    var channelImage : ImageView = itemView.findViewById(R.id.channelIV)
    var channelName : TextView = itemView.findViewById(R.id.channelTV)
    var videoTitle : TextView = itemView.findViewById(R.id.titleTV)
    var duration : TextView = itemView.findViewById(R.id.durationTV)
    var date : TextView = itemView.findViewById(R.id.dateTV)
}