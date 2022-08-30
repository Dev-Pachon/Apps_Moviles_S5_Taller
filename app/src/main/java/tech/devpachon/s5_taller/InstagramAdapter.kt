package tech.devpachon.s5_taller

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class InstagramAdapter : RecyclerView.Adapter<InstagramActivity>() {

    private val instaPublications: ArrayList<InstagramPublication> = ArrayList()
    private lateinit var context: Context

    fun addInstaPublication(instaPublication:InstagramPublication) {
        instaPublications.add(instaPublication)
        notifyItemInserted(itemCount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InstagramActivity {
        context = parent.context
        val inflater = LayoutInflater.from(context)
        val row = inflater.inflate(R.layout.activity_instagram, parent, false)
        return InstagramActivity(row)
    }

    override fun onBindViewHolder(holder: InstagramActivity, position: Int) {
        val instaPublication = instaPublications[position]
        holder.userName.text = instaPublication.userName
        holder.place.text = instaPublication.place
        holder.date.text = instaPublication.date
        holder.commentAuthor.text = instaPublication.author
        holder.comment.text = instaPublication.comment
        holder.numLikes.text = instaPublication.numLikes.toString()
    }

    override fun getItemCount(): Int {
        return instaPublications.size
    }
}