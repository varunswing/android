package rob.myappcompany.javafaithful

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import rob.myappcompany.javafaithful.R
import rob.myappcompany.javafaithful.Dog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDog = Dog("Tommy", 5)
    }
}