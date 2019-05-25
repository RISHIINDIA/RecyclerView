package com.example.android.instimobops;
import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.MyViewHolder> {

    private List<Numbers> numbersList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView number;

        public MyViewHolder(View view) {
            super(view);
            number = (TextView) view.findViewById(R.id.list_item);

        }
    }

    public ViewAdapter(List<Numbers> list) {
            this.numbersList = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Numbers numbers = numbersList.get(position);
        holder.number.setText(numbers.getNumber());
    }

    @Override
    public int getItemCount() {
        return numbersList.size();
    }

}
