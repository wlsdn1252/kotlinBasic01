package com.example.kotlinbasic01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickBtn.setOnClickListener {
            Log.d("메인화면", "버튼이 클릭되었습니다.") // 버튼이 클릭됐을때 로그 출력하기
        }

    }
}