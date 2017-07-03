package id.dekz.mylayoutapp.viewholder;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;
import com.tapadoo.alerter.Alerter;

import id.dekz.mylayoutapp.DetailActivity;
import id.dekz.mylayoutapp.R;
import id.dekz.mylayoutapp.pojo.Orang;
import id.dekz.mylayoutapp.pojo.User;

/**
 * Created by DEKZ on 6/19/2017.
 */

public class OrangViewHolder extends RecyclerView.ViewHolder{

    private TextView nama;
    private TextView type;
    private ImageView img;

    public OrangViewHolder(View itemView) {
        super(itemView);

        nama = (TextView) itemView.findViewById(R.id.tv_nama);
        type = (TextView) itemView.findViewById(R.id.tv_type);
        img = (ImageView) itemView.findViewById(R.id.img);
    }

    public void bind(final User data, final Activity activity){
        nama.setText(data.getLogin());
        type.setText(data.getType());

        Glide.with(itemView.getContext())
                .load(data.getAvatar_url())
                .into(img);

        /*itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detail = new Intent(itemView.getContext(), DetailActivity.class);
                detail.putExtra("orang", data);
                itemView.getContext().startActivity(detail);
            }
        });*/
    }
}
