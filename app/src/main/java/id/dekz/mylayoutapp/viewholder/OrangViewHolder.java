package id.dekz.mylayoutapp.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import id.dekz.mylayoutapp.R;
import id.dekz.mylayoutapp.pojo.Orang;

/**
 * Created by DEKZ on 6/19/2017.
 */

public class OrangViewHolder extends RecyclerView.ViewHolder{

    private TextView nama;
    private TextView pekerjaan;

    public OrangViewHolder(View itemView) {
        super(itemView);

        nama = (TextView) itemView.findViewById(R.id.tv_nama);
        pekerjaan = (TextView) itemView.findViewById(R.id.tv_job);
    }

    public void bind(Orang data){
        nama.setText(data.getNama());
        pekerjaan.setText(data.getPekerjaan());
    }
}
