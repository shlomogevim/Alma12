package com.sg.alma12.Posts.general

import android.app.Activity
import android.content.Context
import android.provider.ContactsContract
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import coil.load
import com.sg.alma12.R
import com.sg.alma12.detailes.PostGenerator
import com.sg.alma12.model.Post
import com.sg.alma12.utilities.CONSTANT
import com.sg.alma12.utilities.Utility


class Post8Lines(val context: Context) {

    private val image: ImageView = (context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.mainLayout)
    private val postCreatorNew = PostGenerator(context, layout)
    private val util= Utility()



    fun post800() {
        val imageUri1 ="https://cdn.pixabay.com/photo/2017/09/03/09/17/question-2709670_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 800
            lineNum =8
            imageUri ="https://cdn.pixabay.com/photo/2017/09/03/09/17/question-2709670_1280.jpg"
            postText  = arrayOf(
                "על החיים:",
                "האדם שמחפש משמעות בחיים",
                "דומה לאחד שקיבל כלי מופלא",
                "והוא ממש נבוך מהמתנה הזו,",
                "מצד אחד",
                "הוא שמע מכולם שהכלי הזה מדהים ברמות,",
                "אבל מהצד השני",
                "הוא לא יודע  מה לעזאזל עושים עם זה."
            )
            postBackground ="a9dce3"
            postTransparency =9
            val di=0
            val dd=-80
            postMargin = arrayOf(
                arrayOf(0,-1+di,0,365+dd),
                arrayOf(0,-1+di,0,330+dd),
                arrayOf(0,-1+di, 0, 295+dd),
                arrayOf(0,-1+di, 0, 260+dd),
                arrayOf(0,-1+di, 0,225+dd),
                arrayOf(0,-1+di, 0,170+dd),
                arrayOf(0,-1+di, 0,135+dd),
                arrayOf(0,-1+di, 0,80+dd)
            )
           val size1=16
            val size2=0
            postTextSize =  arrayOf(0, size1,size2)
            postPadding =  arrayOf(0, 0,0, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayOf(CONSTANT, col, col1, col1)
            postFontFamily =103
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)
    }


    }


