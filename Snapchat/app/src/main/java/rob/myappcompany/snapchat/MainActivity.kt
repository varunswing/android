package rob.myappcompany.snapchat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.fragment.app.FragmentActivity
import com.google.firebase.auth.FirebaseAuth
import rob.myappcompany.snapchat.R

class MainActivity : AppCompatActivity() {

    var emailEditText: EditText? = null
    var passwordEditText: EditText? = null
    val mAuth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emailEditText = findViewById(R.id.emailEditText)
        passwordEditText = findViewById(R.id.emailEditText)

        if(mAuth.currentUser != null){
            logIn()
        }
    }

    fun goClicked(view: View){
        // Check if we can log in the user
        mAuth.signInWithEmailAndPassword(emailEditText.text.toString(), passwordEditText.text.toString())
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        logIn()
                    } else {
                        // Sign up User
                        mAuth.createUserWithEmailAndPassword(emailEditText.text.toString(), passwordEditText.text.toString()).addOnCompleteListener(this){ task ->
                            if(task.isSuccessful){
                                logIn()
                            }
                        }

                    }
                }

        // Sign up the user
    }

    fun logIn(){
        // Move to next Activity
    }
}