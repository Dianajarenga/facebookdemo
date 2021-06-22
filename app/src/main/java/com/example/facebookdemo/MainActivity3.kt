package com.example.facebookdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)
        castView()


    }

    lateinit var etname: EditText
    lateinit var spgender: Spinner
    lateinit var etpassword: EditText
    lateinit var etphone: EditText
    lateinit var etemail: EditText
    lateinit var btnsignin: Button
    fun castView() {
        btnsignin = findViewById<Button>(R.id.btnsignin)
        etname = findViewById(R.id.etname)//edit text is the type of etname
        etpassword = findViewById(R.id.etpassword)
        spgender = findViewById(R.id.spgender)
        etphone = findViewById(R.id.etphone)
        etemail = findViewById(R.id.etemail)
        btnsignin = findViewById(R.id.btnsignin)
        var gendertype = arrayOf("Male", "Female")
        var gendertypeAdopter =
            ArrayAdapter(baseContext, android.R.layout.simple_spinner_item, gendertype)
        gendertypeAdopter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spgender.adapter = gendertypeAdopter


    }

    fun clickRegister() {
        btnsignin.setOnClickListener {
            var name = etname.text.toString()
            var password = etpassword.text.toString()
            var gender = ""
            var phone = etphone.text.toString()
            var email = etemail.text.toString()
            if (email.isEmpty()) {
                etemail.setError("name is required")
            }
            var details = Details(name, password, gender, phone, email)
            val intent=Intent(baseContext,MainActivity2::class.java)
            startActivity(intent)


            Toast.makeText(baseContext, details.toString(), Toast.LENGTH_LONG).show()

        }
    }
}
data class Details(var name:String, var gender:String,var phone:String,var email:String,var password:Any)
