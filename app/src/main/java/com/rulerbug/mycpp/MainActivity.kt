package com.rulerbug.mycpp

import android.os.Bundle
import android.os.Environment
import androidx.appcompat.app.AppCompatActivity
import com.rulerbug.bugutils.Utils.BugDirUtils
import com.rulerbug.bugutils.Utils.BugLogUtils
import com.rulerbug.myldemo.Demo
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val videoPath: String =
            BugDirUtils.getDirPathByDirName("zcf") + "/a.mp4"
        val demo = Demo()
        // Example of a call to a native method
        BugLogUtils.e(videoPath)
        demo.play(videoPath, sv)
    }


}
