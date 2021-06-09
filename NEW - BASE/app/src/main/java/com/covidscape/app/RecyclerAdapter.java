package com.covidscape.app;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private static final String TAG = "RecyclerAdapter";
    private List<covidModel> data;
    private Context context;


    public RecyclerAdapter(List<covidModel> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_layout, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called");
        for (int i = 0; i < data.size(); i++) {

            String api_data = "\nState :" + data.get(i).getProvinceState()
                    + "\nDeath :" + data.get(i).getDeaths()
                    + "\nConfirmed :" + data.get(i).getConfirmed()
                    + "\nActive :" + data.get(i).getActive();

            holder.dataHolder.setText(api_data);
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView dataHolder;
        RelativeLayout relativeLayout;

        ViewHolder(View view) {
            super(view);
            dataHolder = view.findViewById(R.id.DataHolder);
        }
    }

}
