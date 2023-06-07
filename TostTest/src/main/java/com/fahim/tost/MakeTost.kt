package com.fahim.tost

import android.content.Context
import android.widget.Toast

public class MakeTost {
    companion object {
        fun showToast(context: Context, mes: String) {
            Toast.makeText(context, mes, Toast.LENGTH_SHORT)
        }
    }
}