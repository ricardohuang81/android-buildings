package qcc.cuny.ch5_huang;

import android.content.Intent;
import android.os.Bundle;
import android.app.ListActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.net.Uri;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // create a string array
        String[] attraction = {"Brooklyn Bridge", "CN Tower", "Freedom", "Taipei101",  "Burj"};
        // Display the array values using android.R.layout
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, attraction));
    }
    //
    // when user selects by clicking on one of the array elements in the array list

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        {
            switch (position) {
                case 0:
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.newyork-english.edu/rookie-blog/wp-content/uploads/2015/01/121212.png")));
                    break;
                case 1:
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://i.pinimg.com/originals/fd/82/b6/fd82b631b1db400a14f5b7c50487c9f3.png")));
                    break;
                case 2:
                    startActivity(new Intent(MainActivity.this, activity_freedom.class));
                    break;
                case 3:
                    startActivity(new Intent(MainActivity.this, taipei101_activity.class));
                    break;
                case 4:
                    startActivity(new Intent(MainActivity.this, activity_burj.class));
                    break;

            }
        }
    }
}
