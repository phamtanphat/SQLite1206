package com.ptp.phamtanphat.sqlite1206;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

public class NhahangAdapter extends RecyclerView.Adapter<NhahangAdapter.ViewHolder>{

    Context context;
    ArrayList<Nhahang> mangnhahang;

    public NhahangAdapter(Context context, ArrayList<Nhahang> mangnhahang) {
        this.context = context;
        this.mangnhahang = mangnhahang;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.dong_item_nhahang,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Nhahang nhahang = mangnhahang.get(i);
        viewHolder.txtTenmonan.setText(nhahang.getTenmonan());
        viewHolder.txtGiamonan.setText(nhahang.getGiamonan() + " Dong");
        viewHolder.txtDiachi.setText(nhahang.getDiadiem());
    }

    @Override
    public int getItemCount() {
        return mangnhahang.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtTenmonan,txtGiamonan,txtDiachi;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtDiachi = itemView.findViewById(R.id.textviewDiachi);
            txtGiamonan = itemView.findViewById(R.id.textviewGiamonan);
            txtTenmonan = itemView.findViewById(R.id.textviewTenmonan);
        }
    }

}
