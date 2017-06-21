package id.dekz.mylayoutapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        rv = (RecyclerView) findViewById(R.id.rv);

        createDataDummy();
        adapter = new OrangAdapter(orangs);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
    }

    private void createDataDummy(){
        Orang orang1 = new Orang("Samsul", "Tukang Ojek", "http://lorempixel.com/200/200/");
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
