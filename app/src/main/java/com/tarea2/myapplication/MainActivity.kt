package com.tarea2.myapplication

import android.annotation.SuppressLint
import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var textView: TextView
    lateinit var editText1: EditText
    lateinit var editText2: EditText
    lateinit var alert: AlertDialog.Builder


    @SuppressLint("MissingInflatedId", "SetTextI18n", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(1000)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Mobile App"

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        textView = findViewById(R.id.textView)
        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)

        alert = AlertDialog.Builder(this)

        button1.setOnClickListener {

            val string_1: String = editText1.text.toString()
            val string_2: String = editText2.text.toString()

            if (string_1.isEmpty() || string_2.isEmpty()) {
                alert.setTitle("Warning!")
                    .setMessage("\nYou must add write something in both fields...")
                    .setCancelable(true)
                    .setNegativeButton("Ok") { dialogInteface, it -> dialogInteface.cancel() }
                    .show()
                println(">> Aviso: Ha ocurrido un error con los cantidad de datos ingresados")
            }
            else { textView.text = "$string_1" + " " + "$string_2"
                println(">> Aviso: Se ha realizado la concatenacion de forma correcta")
            }
        }

        button2.setOnClickListener {

            textView.text = "Result"
            println(">> Aviso: textView ha sido restablecido...")
            editText1.setText("")
            editText2.setText("")

        }

    }

}
