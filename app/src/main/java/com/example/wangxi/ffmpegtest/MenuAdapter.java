package com.example.wangxi.ffmpegtest;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangxi on 2017/11/10.
 */

public class MenuAdapter extends RecyclerView.Adapter {
    private List<String> datas=new ArrayList();

    public MenuAdapter(List<String> list){
        this.datas=list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MenuViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MenuViewHolder menuViewHolder= (MenuViewHolder) holder;
        menuViewHolder.setData(datas.get(position));
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }
}
