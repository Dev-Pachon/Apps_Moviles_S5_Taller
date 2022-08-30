package tech.devpachon.s5_taller

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class YoutubeAdapter : RecyclerView.Adapter<YoutubeActivity>() {

    private val ytPublications: ArrayList<YoutubePublication> = ArrayList()
    private lateinit var context: Context

    fun addYTPublication(ytPublication:YoutubePublication) {
        ytPublications.add(ytPublication)
        notifyItemInserted(itemCount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YoutubeActivity {
        context = parent.context
        val inflater = LayoutInflater.from(context)
        val row = inflater.inflate(R.layout.activity_youtube, parent, false)
        return YoutubeActivity(row)
    }

    override fun onBindViewHolder(holder: YoutubeActivity, position: Int) {
        val ytPublication = ytPublications[position]
        holder.channelImage.background = ContextCompat.getDrawable(context,R.drawable.mirador_salento_eje_cafetero)
        holder.videoImage.background = ContextCompat.getDrawable(context,R.drawable.mirador_salento_eje_cafetero)
        holder.channelName.text = ytPublication.channel
        holder.duration.text = ytPublication.duration
        holder.videoTitle.text = ytPublication.title
        holder.date.text = ytPublication.vistas.toString()
    }

    override fun getItemCount(): Int {
        return ytPublications.size
    }
}