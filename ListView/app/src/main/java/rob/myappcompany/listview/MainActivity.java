package rob.myappcompany.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView friendsListView = findViewById(R.id.friendsListView);

        final ArrayList<String> myFriends = new ArrayList<String>(asList("Mark", "John", "Sara", "Sussy"));

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFriends);

        friendsListView.setAdapter(arrayAdapter);

        friendsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Toast.makeText(getApplicationContext(), "Hi " + myFriends.get(i), Toast.LENGTH_SHORT).show();

            }
        });

    }
}
