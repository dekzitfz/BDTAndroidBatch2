package id.dekz.mylayoutapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import id.dekz.mylayoutapp.adapter.OrangAdapter;
import id.dekz.mylayoutapp.pojo.Orang;

/**
 * Created by DEKZ on 6/14/2017.
 */

public class DashboardActivity extends AppCompatActivity {

    private RecyclerView rv;
    private OrangAdapter adapter;
    private List<Orang> orangs = new ArrayList<>();

    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String username = preferences.getString("username", "");
        getSupportActionBar().setSubtitle(username);

        rv = (RecyclerView) findViewById(R.id.rv);

        createDataDummy();
        adapter = new OrangAdapter(orangs, this);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_dashboard, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.menu_logout:
                //do something
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void createDataDummy(){
        Orang orang1 = new Orang("Samsul", "Tukang Ojek", "http://img.phone.baidu.com/public/uploads/store_7/c/d/5/cd553747471edd3e5a1e4e7ee9adccd5_200x200.png");
        Orang orang2 = new Orang("Mukidi", "Project Manager", "http://lorempixel.com/200/200/");
        Orang orang3 = new Orang("Muklis", "Software Developer", "http://lorempixel.com/200/200/");
        Orang orang4 = new Orang("Sumiyati", "Ibu Rumah Tangga", "http://lorempixel.com/200/200/");
        Orang orang5 = new Orang("Yanto", "Tukang Bubur", "http://lorempixel.com/200/200/");
        orangs.add(orang1);
        orangs.add(orang2);
        orangs.add(orang3);
        orangs.add(orang4);
        orangs.add(orang5);
    }
}
