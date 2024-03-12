package com.example.searchandchips.library.dataclass

import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import java.lang.ref.WeakReference


object Data {
    var data = ArrayList<String>()
    val serchDara = ArrayList<String>()
    val chips=ArrayList<String>()

    private var r1Ref: WeakReference<RecyclerView>? = null
    private var r2Ref: WeakReference<RecyclerView>? = null
    private var bRef: WeakReference<ImageView>? = null
    private var editRef: WeakReference<EditText>? = null
    var r1: RecyclerView?
        get() = r1Ref?.get()
        set(value) {
            r1Ref = if (value == null) null else WeakReference(value)
        }

    var r2: RecyclerView?
        get() = r2Ref?.get()
        set(value) {
            r2Ref = if (value == null) null else WeakReference(value)
        }

    var b: ImageView?
        get() = bRef?.get()
        set(value) {
            bRef = if (value == null) null else WeakReference(value)
        }

    var edit: EditText?
        get() = editRef?.get()
        set(value) {
            editRef = if (value == null) null else WeakReference(value)
        }
}
