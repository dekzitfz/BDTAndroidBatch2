package id.dekz.mylayoutapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by DEKZ on 6/21/2017.
 */

public class DetailActivity extends AppCompatActivity {

    private ImageView img;
    private TextView nama;
    private TextView pekerjaan;

    private String strName;
    private String strPekerjaan;
    private String strImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        img = (ImageView) findViewById(R.id.img_detail);
        nama = (TextView) findViewById(R.id.tv_detail_nama);
        pekerjaan = (TextView) findViewById(R.id.tv_detail_job);

        if(getIntent() != null){
            strName = getIntent().getStringExtra("nama");
            strPekerjaan = getIntent().getStringExtra("pekerjaan");
            strImage = getIntent().getStringExtra("image");

            Glide.with(this).load(strImage).into(img);
            nama.setText(strName);
            pekerjaan.setText(strPekerjaan);
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
