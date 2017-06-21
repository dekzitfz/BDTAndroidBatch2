package id.dekz.mylayoutapp.viewholder;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;
import com.tapadoo.alerter.Alerter;

import id.dekz.mylayoutapp.R;
import id.dekz.mylayoutapp.pojo.Orang;

/**
 * Created by DEKZ on 6/19/2017.
 */

public class OrangViewHolder extends RecyclerView.ViewHolder{

    private TextView nama;
    private TextView pekerjaan;
    private ImageView img;

    public OrangViewHolder(View itemView) {
        super(itemView);

        nama = (TextView) itemView.findViewById(R.id.tv_nama);
        pekerjaan = (TextView) itemView.findViewById(R.id.tv_job);
        img = (ImageView) itemView.findViewById(R.id.img);
    }

    public void bind(final Orang data, final Activity activity){
        nama.setText(data.getNama());
        pekerjaan.setText(data.getPekerjaan());

        Glide.with(itemView.getContext())
                .load(data.getImageURL())
                .into(img);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Alerter.create(activity)
                        .setTitle(data.getNama())
                        .setText(data.getPekerjaan())
                        .show();
            }
        });
    }
}
