package org.sopt.project26th

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener {
            if(et_id.text.isNullOrBlank()||et_password.text.isNullOrBlank()){
                Toast.makeText(this,"아이디와 비밀번호를 확인하세요",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
        }
        tv_register.setOnClickListener {
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
