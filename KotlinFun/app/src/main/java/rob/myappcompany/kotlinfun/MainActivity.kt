 package rob.myappcompany.kotlinfun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

 class MainActivity : AppCompatActivity() {

     var count = 0
     var textView = findViewById<TextView>(R.id.textView)

     fun reset(view : View){
         count = 0
         textView.text = count.toString()
     }

     fun plusOne(view : View){
         count++
         textView.text = count.toString()
     }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = "0"
    }
}