package tech.devpachon.s5_taller

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class InstagramActivity(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var userImage: ImageView = itemView.findViewById(R.id.userIV)
    var userName: TextView = itemView.findViewById(R.id.userNameTV)
    var place: TextView = itemView.findViewById(R.id.placeTV)
    var publicationImage: ImageView = itemView.findViewById(R.id.publicationIV)
    var numLikes: TextView = itemView.findViewById(R.id.numLikesTV)
    var commentAuthor : TextView = itemView.findViewById(R.id.commentAuthorTV)
    var comment:TextView=itemView.findViewById(R.id.commentDescriptionTV)
    var date:TextView = itemView.findViewById(R.id.dateInstaTV)
    var myPhotoImage : ImageView = itemView.findViewById(R.id.myPhotoIV)
}