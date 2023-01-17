package project.stn991617988.practice01greeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.TextView
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Step 2: Declaring Views
        val textView: TextView = findViewById(R.id.textViewy)
        val btn: Button = findViewById(R.id.btn)
        val editText: EditText = findViewById(R.id.editText1)
        var name: Editable? = editText.text

        // Step 3: Adding the functionality
        btn.setOnClickListener { greeting(name)}

    }

    private fun greeting(name: Editable?) {
        Toast.makeText(this, "Hello $name", Toast.LENGTH_LONG).show()
    }

}