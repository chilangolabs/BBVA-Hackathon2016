package com.chilangolabs.capitallab.OwnElements

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.chilangolabs.capitallab.R

/**
 * Created by Gorro on 29/10/16.
 */
class FontManager(val context: Context?) {

    fun initStyle(view: View) {
        setTypeFace(view)
    }

    fun initStyle(view: View, attrs: AttributeSet) {
        val typedArray = context?.theme?.obtainStyledAttributes(attrs, R.styleable.montserrat_font, 0, 0)
        var tp: Typeface
        when (typedArray?.getInteger(R.styleable.montserrat_font_font, 0)) {
            0 -> tp = Typeface.createFromAsset(context?.assets, "fonts/Montserrat-Black.otf")
            1 -> tp = Typeface.createFromAsset(context?.assets, "fonts/Montserrat-Bold.otf")
            2 -> tp = Typeface.createFromAsset(context?.assets, "fonts/Montserrat-ExtraBold.otf")
            3 -> tp = Typeface.createFromAsset(context?.assets, "fonts/Montserrat-Hairline.otf")
            4 -> tp = Typeface.createFromAsset(context?.assets, "fonts/Montserrat-Light.otf")
            5 -> tp = Typeface.createFromAsset(context?.assets, "fonts/Montserrat-Regular.otf")
            6 -> tp = Typeface.createFromAsset(context?.assets, "fonts/Montserrat-SemiBold.otf")
            7 -> tp = Typeface.createFromAsset(context?.assets, "fonts/Montserrat-UltraLight.otf")
            else -> {
                tp = Typeface.createFromAsset(context?.assets, "fonts/Montserrat-Regular.otf")
            }
        }
        typedArray?.recycle()
        setTypeFace(view, tp)
    }

    fun setTypeFace(view: View, tp: Typeface = Typeface.createFromAsset(context?.assets, "fonts/Montserrat-Regular.otf")) {
        when (view) {
            is TextView -> view.typeface = tp
            is EditText -> view.typeface = tp
            is Button -> view.typeface = tp
        }
    }

}