package com.example.fraudcatcher_v11.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import com.example.fraudcatcher_v11.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Show and Hide Password
        cbShow.setOnClickListener {
            if (cbShow.isChecked){
                edtPass.transformationMethod = HideReturnsTransformationMethod.getInstance()
            } else {
                edtPass.transformationMethod = PasswordTransformationMethod.getInstance()
            }
        }

        // Login
        btn_login.setOnClickListener {
            val inten = Intent(this@LoginActivity, MainActivity::class.java)
            val user = edtUsr.text.toString()
            val pass = edtPass.text.toString()
            if (user == "admin" && pass == "admin"){
                startActivity(inten)
            }
        }
    }
}
