package tech.devpachon.s5_taller

import android.icu.text.SimpleDateFormat
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isInvisible
import androidx.recyclerview.widget.LinearLayoutManager
import tech.devpachon.s5_taller.databinding.ActivityInstagramBinding
import tech.devpachon.s5_taller.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    private lateinit var layoutM : LinearLayoutManager

    private lateinit var adapter :CommentsAdapter
    private lateinit var adapterYT :YoutubeAdapter
    private lateinit var adapterInsta: InstagramAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.addElementBtn.text = "+"

        layoutM = LinearLayoutManager(this)

        binding.mainRV.layoutManager = layoutM

        binding.mainRV.setHasFixedSize(true)

        adapter = CommentsAdapter()
        adapterYT = YoutubeAdapter()
        adapterInsta = InstagramAdapter()

        var num :Int = 0

        binding.addElementBtn.setOnClickListener {
            binding.options.isInvisible = !binding.options.isInvisible
        }

        binding.addCommentBtn.setOnClickListener{
            val comment = Comment("img1.jps","test $num", "lorem*5  ",
                SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(Date()),50)
            binding.mainRV.adapter = adapter
            adapter.addComment(comment)
            num++
        }

        binding.addYoutubeBtn.setOnClickListener{
            val ytPublication = YoutubePublication("img1.jps","img2.jpg", "canal $num"," A LA verga me vale vherga"
                ,"02:20",SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(Date()),50)
            binding.mainRV.adapter = adapterYT
            adapterYT.addYTPublication(ytPublication)
            num++
        }

        binding.addInstaBtn.setOnClickListener{
            val instaPublication = InstagramPublication("img1.jps","UserTest1", "","cALI Colombia"
                ,"JuanTest1",500,"Im the best", SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(Date()), "")
            binding.mainRV.adapter = adapterInsta
            adapterInsta.addInstaPublication(instaPublication)
            num++
        }
    }
}