package com.sg.alma12.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.sg.alma12.Posts.general.*
import com.sg.alma12.R
import com.sg.alma12.databinding.ActivityAddPostBinding
import com.sg.alma12.detailes.Post1Lines
import com.sg.alma12.utilities.Utility

class AddPostActivity : AppCompatActivity() {

    lateinit var binding: ActivityAddPostBinding

    lateinit var post1Lines: Post1Lines
    lateinit var post2Lines: Post2Lines
    lateinit var post3Lines: Post3Lines
    lateinit var post4Lines: Post4Lines
    lateinit var post5Lines: Post5Lines
    lateinit var post6Lines: Post6Lines
    lateinit var post7Lines: Post7Lines
    lateinit var post8Lines: Post8Lines
    lateinit var post9Lines: Post9Lines

    val util = Utility()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddPostBinding.inflate(layoutInflater)
      setContentView(binding.root)




        post1Lines = Post1Lines(this)
        post2Lines = Post2Lines(this)
        post3Lines = Post3Lines(this)
        post4Lines = Post4Lines(this)
        post5Lines = Post5Lines(this)
        post6Lines = Post6Lines(this)
        post7Lines = Post7Lines(this)
        post8Lines = Post8Lines(this)
        post9Lines = Post9Lines(this)

      //  post1Lines.post100()
        // post1Lines.post101()
        //post1Lines.post102()

      //  post2Lines.post200()
        // post2Lines.post201()
        //  post2Lines.post202()
        //post2Lines.post203()
        //post2Lines.post204()
        //post2Lines.post205()
        // post2Lines.post206()
        //  post2Lines.post207()
        //  post2Lines.post208()
        //  post2Lines.post209()
        //    post2Lines.post210()
        //   post2Lines.post211()
        //  post2Lines.post212()
        //  post2Lines.post213()
        // post2Lines.post214()
        // post2Lines.post215()
        //  post2Lines.post216()
        // post2Lines.post217()


       // post3Lines.post300()
        //post3Lines.post301()
        //  post3Lines.post302()
        //post3Lines.post303()
        // post3Lines.post304()
        //  post3Lines.post305()
        //  post3Lines.post306()
          post3Lines.post307()

        // post4Lines.post400()
        //     post4Lines.post401()


        //post5Lines.post500()


        //   post6Lines.post600()
       //post6Lines.post601()
        //    post6Lines.post602()
        //   post6Lines.post603()

        //post7Lines.post700()

        //post8Lines.post800()

        // post9Lines.post900()


    }
}