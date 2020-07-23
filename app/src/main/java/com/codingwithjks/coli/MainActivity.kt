package com.codingwithjks.coli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.Coil
import coil.api.load
import coil.request.LoadRequest
import coil.transform.CircleCropTransformation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //imageView.load("http://www.codingwithjks.tech/movies/Forrest_gump.jpg")

       /* imageView.load(R.drawable.jayant){
            crossfade(true)
            transformations(CircleCropTransformation())
        }

        */
       val imageLoader=Coil.imageLoader(this)
       val request=LoadRequest.Builder(this)
            .data(R.drawable.jayant)
           .crossfade(true)
           .transformations(CircleCropTransformation())
            .target(imageView)
            .build()
          imageLoader.execute(request)
    }
}