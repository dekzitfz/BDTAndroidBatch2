package id.dekz.mylayoutapp.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import id.dekz.mylayoutapp.R;
import id.dekz.mylayoutapp.pojo.Orang;
import id.dekz.mylayoutapp.pojo.User;
import id.dekz.mylayoutapp.viewholder.OrangViewHolder;

/**
 * Created by DEKZ on 6/19/2017.
 */

public class OrangAdapter extends RecyclerView.Adapter<OrangViewHolder> {

    private User[] users;
    private Activity activity;

    public OrangAdapter (User[] users, Activity activity){
        this.users = users;
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
        holder.bind(users[position], activity);
    }

    @Override
    public int getItemCount() {
        return users.length;
    }
}
