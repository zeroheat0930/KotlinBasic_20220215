package com.zeroheat.kotlinbasic_20220215

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // btnLog가 눌리면 어떤 코드를 실행할지, 할 일을 설정.
        btnLog.setOnClickListener {

            // 로그를 찍어보는 기능 실행. => btnLog가 클릭될 떄 마다 실행.
            Log.d("메인화면", "로그 버튼 눌림")
            Log.d("메인화면", "추가 로그 찍어보기")
            Log.e("메인화면", "e로 로그 찍기")
        }

        btnToast.setOnClickListener {
            // 토스트 버튼이 눌리면, Toast를 만들고 (makeText) 보여주기 (show)
//            Toast.makeText(this,"토스트를 띄워봅시다.", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "토스트 자동완성으로 활용", Toast.LENGTH_SHORT).show()
        }

        btnVariable.setOnClickListener {
            // 변수에 대한 문법 연습용 코드

//            본인의 이름을 변수에 담아보자. => 토스트로 띄우자.

            var myName = "정동준"
            val girlfriend = "김민지"
//            val girfriend : String
//            girfriend = "왜안됨"
//            girfriend = "김민지" val에는 새 값 교체 불가


            Toast.makeText(this, myName, Toast.LENGTH_SHORT).show()

            var myBirthYear = 1992

            var myHeight = 181.3


        }

        btnCondition.setOnClickListener {

            //조건문 연습

            val userAge = 15
            // 사용자의 나이가 20살 이상? 맞으면 성인입니다를 토스트로 띄워봄

            if (userAge>=20){

                //사용자 나이가 20살 이상일때만 실행할 내용
                Toast.makeText(this, "성인입니다.", Toast.LENGTH_SHORT).show()
            } else if(userAge>= 17){
                Toast.makeText(this, "고등학생입니다.", Toast.LENGTH_SHORT).show()
            } else if(userAge >=14){
//                17살 미만, 14살 이상.
                Toast.makeText(this, "중학생입니다.", Toast.LENGTH_SHORT).show()
            } else if(userAge >=8){
                Toast.makeText(this, "초등학생입니다.", Toast.LENGTH_SHORT).show()
            }
            else{
//                위의 모든 질문이 다 틀렸을때만 실행할 내용
                Toast.makeText(this, "미취학 아동입니다.", Toast.LENGTH_SHORT).show()
            }

        }
    }
}