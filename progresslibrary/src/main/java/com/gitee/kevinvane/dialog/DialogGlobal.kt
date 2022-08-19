package com.gitee.kevinvane.dialog

import android.content.Context
import androidx.appcompat.app.AlertDialog

class DialogGlobal {

    companion object{

        private var dialog: AlertDialog? = null
        @JvmStatic
        fun show(context: Context?, message: String?){
            dialog = DialogProgress.wait(context, message)
            dialog?.show()
        }
        @JvmStatic
        fun dismiss(){
            dialog?.dismiss()
        }
    }
}