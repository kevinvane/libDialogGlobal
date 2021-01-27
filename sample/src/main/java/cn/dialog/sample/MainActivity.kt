package cn.dialog.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.dialog.progress.DialogProgress

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DialogProgress.wait(this,null,true)?.show()

        // DialogProgress.wait(this,"Hello World")?.show()
        //
        // val builder = DialogProgress.builder(this,"Hello World")

    }
}