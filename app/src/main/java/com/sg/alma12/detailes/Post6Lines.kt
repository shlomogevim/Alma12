package com.sg.alma12.Posts.general

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import coil.load
import com.sg.alma12.R
import com.sg.alma12.detailes.PostGenerator
import com.sg.alma12.model.Post
import com.sg.alma12.utilities.CONSTANT
import com.sg.alma12.utilities.NOT_CONSTANT
import com.sg.alma12.utilities.Utility


class Post6Lines (val context: Context) {

    val util= Utility()

    private val image: ImageView =(context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout =(context as Activity).findViewById(R.id.mainLayout)
    private val postCreatorNew= PostGenerator(context , layout)

    fun post600() {
        val imageUri1 = "https://cdn.pixabay.com/photo/2021/03/27/05/10/pills-6127501_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 600
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2021/03/27/05/10/pills-6127501_1280.jpg"
            postText = arrayOf(
                "המיינד",
                "הוא כדור הרגעה",
                "מהאין סופיות של החיים,",
                "טוב להשתמש בו מידי פעם,",
                "אבל כדי לשמור קשר טוב למציאות",
                "רצוי שלא להתמכר אליו יותר מידי."
            )
            val di = 0
            val du=0
            postMargin =  arrayOf(
                arrayOf(0, -1+du, 0, 205+di),
                arrayOf(0, -1+du, 0, 173+di),
                arrayOf(0, -1+du, 0, 142+di),
                arrayOf(0, -1+du, 0, 110+di),
                arrayOf(0, -1+du, 0, 55+di),
                arrayOf(0, -1+du, 0, 0+di)
            )
            postBackground =  "263238"
            postTransparency = 0
            postTextSize = arrayOf(1, 30,18,18,18,18,18)
            postPadding = arrayOf(10, 0, 10, 0)
            postTextColor = arrayOf(CONSTANT,  "#ffffff")
            postFontFamily =240
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)
    }
    fun post601() {
        val imageUri1 = "https://cdn.pixabay.com/photo/2020/01/23/05/49/woman-4786974_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 601
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2020/01/23/05/49/woman-4786974_1280.jpg"
            postText = arrayOf(
                "אתה חי בתוך אגדה עתיקה",
                "גן העדן והגיהנום נמצאים כאן ועכשיו,",
                "ומי שמחליט לאיזה מחוזות תנוע בעולם הזה הוא:",
                "אתה.",
                "מה שנותר פתוח",
                "זו אותה אמונה באגדות עתיקות."
            )
            val di = 0
            val du=0
            postMargin =  arrayOf(
                arrayOf(0, -1+du, 0, 390+di),
                arrayOf(0, -1+du, 0, 295+di),
                arrayOf(0, -1+du, 0, 200+di),
                arrayOf(0, -1+du, 0, 150+di),
                arrayOf(0, -1+du, 0, 100+di),
                arrayOf(0, -1+du, 0, 10+di)
            )
            postBackground =  "263238"
            postTransparency = 0
            postTextSize = arrayOf(0, 30)
            postPadding = arrayOf(5, 0, 5, 0)
            val col = "#f6ff03"
            val col1 = "#1de9b6"
            postTextColor = arrayOf(NOT_CONSTANT, col, col, col, col, col, col1)
            postFontFamily =104
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)
    }
    fun post602() {
        val imageUri1 = "https://cdn.pixabay.com/photo/2018/11/02/09/50/human-3789910_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 602
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2018/11/02/09/50/human-3789910_1280.jpg"
            postText = arrayOf(
                "הגאומטריה של הסבל",
                "במשולש הקיום שלך שלשה קודקודים: ",
                "מה שאתה צריך,",
                "מה שאתה רוצה",
                "ומה שיש לך,",
                "וככול ששטח המשולש קטן יותר," +
                        " אתה פחות סובל."
            )
            val di = 0
            val du=0
            postMargin =  arrayOf(
                arrayOf(0,20+du, 0, -1+di),
                arrayOf(0, -1+du, 0, 220+di),
                arrayOf(0, -1+du, 0, 180+di),
                arrayOf(0, -1+du, 0, 150+di),
                arrayOf(0, -1+du, 0, 120+di),
                arrayOf(0, -1+du, 0, 0+di)
            )
            postBackground =  "428289"
            postTransparency = 0
            val size1=32
            val size2=28
            postTextSize = arrayOf(1,size1,size2,size2, size2,size2, size2)
            postPadding = arrayOf(10, 0,10, 0)
            postTextColor = arrayOf(CONSTANT,"#18FFFF")
            postFontFamily =200
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)
    }
    fun post603() {
        val imageUri1 = "https://cdn.pixabay.com/photo/2018/01/26/08/32/nature-3108066__480.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 603
            lineNum =6
            imageUri ="https://cdn.pixabay.com/photo/2018/01/26/08/32/nature-3108066__480.jpg"
            postText = arrayOf(
                " גן העדן והגיהנום ",
                "הם לא מקומות",
                "בעולם הבא,",
                "הם יותר צורת",
                "המחשבות שלך",
                "בעולם הזה."
            )
            val di = 0
            val du=30
            postMargin =  arrayOf(
                arrayOf(0,0+du, 0, -1+di),
                arrayOf(0,40+du, 0, -1+di),
                arrayOf(0,80+du, 0, -1+di),
                arrayOf(0,120+du, 0, -1+di),
                arrayOf(0, 160+du, 0, -1+di),
                arrayOf(0, 200+du, 0, -1+di)
            )
            postBackground =  "428289"
            postTransparency = 0
            postTextSize = arrayOf(0,24)
            postPadding = arrayOf(0, 0,0, 0)
            postTextColor = arrayOf(CONSTANT,"#007591")
            postFontFamily =240
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)
    }

}

