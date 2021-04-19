package rob.myappcompany.databasedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            SQLiteDatabase myDatabase = this.openOrCreateDatabase("Users", MODE_PRIVATE, null);
            myDatabase.execSQL("CREATE TABLE IF NOT EXISTS newUsers (name VARCHAR, age INT(3), id INTEGER PRIMARY KEY)");
            myDatabase.execSQL("INSERT INTO newUsers (name, age) VALUES ('Varun', 20)");
            myDatabase.execSQL("INSERT INTO newUsers (name, age) VALUES ('Ravi', 33)");
            myDatabase.execSQL("INSERT INTO newUsers (name, age) VALUES ('Sweta', 16)");

            myDatabase.execSQL("DELETE FROM users WHERE name = 'Ravi' AND name = 'Varun'");

            Cursor c = myDatabase.rawQuery("SELECT * FROM newUsers WHERE name LIKE '%r%' LIMIT 1", null);
            int nameIndex = c.getColumnIndex("name");
            int ageIndex = c.getColumnIndex("age");
            int idIndex = c.getColumnIndex("id");
            c.moveToFirst();

            while(c != null){
                Log.i("name", c.getString(nameIndex));
                Log.i("age", c.getString(ageIndex));
                Log.i("id", c.getString(idIndex));
                c.moveToNext();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}