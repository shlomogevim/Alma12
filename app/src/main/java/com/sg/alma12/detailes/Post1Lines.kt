package com.sg.alma12.detailes

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import coil.load
import com.sg.alma12.R
import com.sg.alma12.model.Post
import com.sg.alma12.utilities.CONSTANT


class Post1Lines(val context: Context) {

    private val image: ImageView = (context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.mainLayout)
    private val postGenerator = PostGenerator(context, layout)

    fun post100() {
        val imageUri1 = "https://cdn.pixabay.com/photo/2015/08/26/11/06/people-talking-908342_1280.jpg"
        image.load(imageUri1)
        val post= Post()
        with(post){
            postNum=100
             lineNum = 1
             imageUri = "https://cdn.pixabay.com/photo/2015/08/26/11/06/people-talking-908342_1280.jpg"
            postText = arrayOf(
                "כל אחד מדבר את מה שהוא."
            )
            val dd=0
            val du=0
            postMargin = arrayOf(arrayOf(0, 0+du, 0, -1+dd))
            postBackground = "263238"
            postTransparency = 4
            postTextSize = arrayOf(0,30)
            postPadding = arrayOf(10, 0, 10, 0)
            postTextColor = arrayOf(CONSTANT, "#f6ff03")
            postFontFamily=200
            postRadiuas
        }
       postGenerator.createPost(post)
    }

    fun post101() {
        val imageUri1 ="https://cdn.pixabay.com/photo/2018/02/13/23/41/nature-3151869_1280.jpg"
        image.load(imageUri1)
        val post= Post()
        with(post){
            postNum=101
            lineNum = 1
            imageUri ="https://cdn.pixabay.com/photo/2018/02/13/23/41/nature-3151869_1280.jpg"
            postText  = arrayOf(
                "אתה הוא האור שבו אתה חי."
            )
            val dd=0
            val du=0
            postMargin = arrayOf(arrayOf(0, 0+du, 0, 0+dd))
            postBackground= "263238"
            postTransparency = 0
            postTextSize = arrayOf(0,30)
            postPadding = arrayOf(40, 0, 40, 0)
            postTextColor = arrayOf(CONSTANT,  "#f6ff03")
            postFontFamily=200
            postRadiuas=15
        }
        postGenerator.createPost(post)
    }

    fun post102() {
        val imageUri1 ="https://cdn.pixabay.com/photo/2013/07/18/15/09/death-164761_1280.jpg"
        image.load(imageUri1)
        val post= Post()
        with(post){
            postNum=102
            lineNum = 1
            imageUri ="https://cdn.pixabay.com/photo/2013/07/18/15/09/death-164761_1280.jpg"
            postText  = arrayOf(
                "גם מחיים שלווים לגמרי מתים בסוף."
            )
            val dd=0
            val du=0
            postMargin  = arrayOf(arrayOf(0, -1+du, 0, 0+dd))
            postBackground = "263238"
            postTransparency = 1
            postTextSize  = arrayOf(0,30)
            postPadding = arrayOf(40, 0, 40, 0)
            postTextColor  = arrayOf(CONSTANT, "#f6ff03")
            postFontFamily=200
            postRadiuas=15
        }
        postGenerator.createPost(post)
    }

}