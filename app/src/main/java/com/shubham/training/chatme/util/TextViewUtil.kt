package com.shubham.training.chatme.util

import android.widget.TextView

internal var TextView.diffedValue: String
    get() = text.toString()
    set(value) {
        if (text.toString() == value) return
        text = value
    }