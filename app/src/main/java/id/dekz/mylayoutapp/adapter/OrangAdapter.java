package id.dekz.mylayoutapp.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import id.dekz.mylayoutapp.R;
import id.dekz.mylayoutapp.pojo.Orang;
import id.dekz.mylayoutapp.viewholder.OrangViewHolder;

/**
 * Created by DEKZ on 6/19/2017.
 */

public class OrangAdapter extends RecyclerView.Adapter<OrangViewHolder> {

    private List<Orang> list;
    private Activity activity;

    public OrangAdapter (List<Orang> list, Activity activity){
        this.list = list;
        this.activity = activity;
    }

    @Override
    public OrangViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vh = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_recyclerview, parent, false);

        return new OrangViewHolder(vh);
    }

    @Override
    public void onBindViewHolder(OrangViewHolder holder, int position) {
        holder.bind(list.get(position), activity);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
