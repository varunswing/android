package rob.myappcompany.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean rightIsShown = true;

    public void fade(View view){

        Log.i("Info", "Image Tapped");

        ImageView rightImageView = (ImageView) findViewById(R.id.rightImageView);

        ImageView leftImageView = (ImageView) findViewById(R.id.leftImageView);

        if(rightIsShown){

            rightIsShown = false;


            rightImageView.animate().alpha(0).setDuration(2000);

            leftImageView.animate().alpha(1).setDuration(2000);

        }else {

            rightIsShown = true;

            rightImageView.animate().alpha(1).setDuration(2000);

            leftImageView.animate().alpha(0).setDuration(2000);

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
