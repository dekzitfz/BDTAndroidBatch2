package id.dekz.mylayoutapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import id.dekz.mylayoutapp.pojo.Orang;

/**
 * Created by DEKZ on 6/21/2017.
 */

public class DetailActivity extends AppCompatActivity {

    private ImageView img;
    private TextView nama;
    private TextView pekerjaan;

    /*private String strName;
    private String strPekerjaan;
    private String strImage;*/

    private Orang person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        img = (ImageView) findViewById(R.id.img_detail);
        nama = (TextView) findViewById(R.id.tv_detail_nama);
        pekerjaan = (TextView) findViewById(R.id.tv_detail_job);

        if(getIntent() != null){
            person = (Orang) getIntent().getSerializableExtra("orang");

            Glide.with(this).load(person.getImageURL()).into(img);
            nama.setText(person.getNama());
            pekerjaan.setText(person.getPekerjaan());
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        DetailActivity.this.finish();
    }
}
