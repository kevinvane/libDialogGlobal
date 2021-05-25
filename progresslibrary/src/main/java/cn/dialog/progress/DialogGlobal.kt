package cn.dialog.progress

import android.content.Context
import androidx.appcompat.app.AlertDialog

class DialogGlobal {

    companion object{

        private var dialog: AlertDialog? = null
        fun show(context: Context?, message: String?){
            dialog = DialogProgress.wait(context,message)
            dialog?.show()
        }

        fun dismiss(){
            dialog?.dismiss()
        }
    }
}