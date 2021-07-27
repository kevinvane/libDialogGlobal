package com.gitee.kevinvane.dialog

import android.content.Context
import android.view.LayoutInflater
import android.widget.TextView
import androidx.appcompat.app.AlertDialog


class DialogProgress {

    companion object{

        fun wait(context: Context?, message: String?):AlertDialog?{

            return builder(context,message)
                ?.setCancelable(false)
                ?.create()
        }

        fun wait(context: Context?, message: String?, cancelable:Boolean):AlertDialog?{

            return builder(context,message)
                ?.setCancelable(cancelable)
                ?.create()
        }

        fun builder(context: Context?, message: String?):AlertDialog.Builder?{

            context?.let {
                val view = LayoutInflater.from(context).inflate(R.layout.dialog_my_progress, null)
                message?.let { msg->
                    val tvMessage = view.findViewById<TextView>(R.id.tvMessage)
                    tvMessage.text = msg
                }

                return AlertDialog.Builder(context, R.style.MyProgressDialog)
                    .setView(view)
                    .setCancelable(false)
            }
            return null
        }
    }
}