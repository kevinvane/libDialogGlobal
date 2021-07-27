package cn.dialog.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gitee.kevinvane.dialog.DialogGlobal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val dialog = DialogProgress.wait(this,null,true)
        // dialog?.show()
        // dialog?.dismiss()
        // DialogProgress.wait(this,"Hello World")?.show()
        //
        // val builder = DialogProgress.builder(this,"Hello World")

        DialogGlobal.show(this,"请等待")
        // DialogGlobal.dismiss()
    }
}