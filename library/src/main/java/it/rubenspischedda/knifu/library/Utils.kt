package it.rubenspischedda.knifu.library

import android.util.Log

fun Any.logd(tag: String, prefix: String? = null, prefixSeparator: String = ":", throwable: Throwable? = null) {
    if(throwable != null) {
        Log.d(tag, if(prefix != null) "${prefix + prefixSeparator} " else "" + toString(), throwable)
    } else {
        Log.d(tag, if(prefix != null) "${prefix + prefixSeparator} " else "" + toString())
    }
}

fun Any.logi(tag: String, prefix: String? = null, prefixSeparator: String = ":", throwable: Throwable? = null) {
    if(throwable != null) {
        Log.i(tag, if(prefix != null) "${prefix + prefixSeparator} " else "" + toString(), throwable)
    } else {
        Log.i(tag, if(prefix != null) "${prefix + prefixSeparator} " else "" + toString())
    }
}

fun Any.loge(tag: String, prefix: String? = null, prefixSeparator: String = ":", throwable: Throwable? = null) {
    if(throwable != null) {
        Log.i(tag, if(prefix != null) "${prefix + prefixSeparator} " else "" + toString(), throwable)
    } else {
        Log.i(tag, if(prefix != null) "${prefix + prefixSeparator} " else "" + toString())
    }
}

fun Any.logw(tag: String, prefix: String? = null, prefixSeparator: String = ":", throwable: Throwable? = null) {
    if(throwable != null) {
        Log.w(tag, if(prefix != null) "${prefix + prefixSeparator} " else "" + toString(), throwable)
    } else {
        Log.w(tag, if(prefix != null) "${prefix + prefixSeparator} " else "" + toString())
    }
}