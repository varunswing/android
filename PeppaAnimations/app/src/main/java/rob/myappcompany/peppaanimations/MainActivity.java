package rob.myappcompany.peppaanimations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){

        Log.i("Info", "ImageView Tapped");

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        imageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        imageView.setX(-1000);

        imageView.animate().translationXBy(1000).rotation(3600).setDuration(2000);

    }
}
