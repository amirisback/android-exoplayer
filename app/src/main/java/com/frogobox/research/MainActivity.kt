package com.frogobox.research

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.frogobox.research.databinding.ActivityMainBinding
import com.frogobox.research.exoplayer.WatchActivity
import com.frogobox.research.util.Constant

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG = MainActivity::class.java.simpleName
        val VIDEO_URL = "https://www.youtube.com/watch?v=kRlF1zmWkYI&amp;list=PLLW55ltXv2-LqhgxSxIYocD8yAuLKX-kx&amp;index=9&amp;ab_channel=FaisalAmirTV"
        val VIDEO_TITLE = ""
    }

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupUI()
    }

    private fun setupUI() {
        binding.apply {
            btnWatch.setOnClickListener {
                startActivity(Intent(this@MainActivity, WatchActivity::class.java).apply {
                    putExtra(Constant.Extra.EXTRA_VIDEO_URL, VIDEO_URL)
                    putExtra(Constant.Extra.EXTRA_VIDEO_TITLE, VIDEO_TITLE)
                })
            }
        }
    }
}