package com.example.patterninputfiltersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_demo.*
import java.util.regex.Pattern

class DemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)

        etInput.filters = arrayOf(PatternInputFilter(Pattern.compile(REGEX_3)))
    }
}
