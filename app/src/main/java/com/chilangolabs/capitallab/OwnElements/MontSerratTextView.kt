package com.chilangolabs.capitallab.OwnElements

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView

/**
 * @author Gorro
 */

class MontSerratTextView : TextView {
    constructor(context: Context) : super(context) {
        FontManager(context).initStyle(this)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        if (!isInEditMode) {
            FontManager(context).initStyle(this, attrs)
        }
    }
}