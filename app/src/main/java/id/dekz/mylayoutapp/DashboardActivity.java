package id.dekz.mylayoutapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by DEKZ on 6/14/2017.
 */

public class DashboardActivity extends AppCompatActivity {

    private ListView listview;
    private String[] strings;
    private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        listview = (ListView) findViewById(R.id.listview);
        strings = new String[]{"Jeruk", "Apel", "Mangga", "Manggis", "Pisang"};
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);
        listview.setAdapter(arrayAdapter);
    }
}
