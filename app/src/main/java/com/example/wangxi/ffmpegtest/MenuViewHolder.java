package com.example.wangxi.ffmpegtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by wangxi on 2017/11/10.
 */

public class MenuViewHolder extends RecyclerView.ViewHolder{
    private TextView tvMenu;

    public MenuViewHolder(ViewGroup parent) {
        super(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu_layout,parent,false));
    }

    public void setData(final String menu){
        tvMenu=((TextView)itemView.findViewById(R.id.tv_menu));
        tvMenu.setText(menu);
        tvMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(menu=="输出YUV,h264"){
                   VideoUtils.videoOut(Constant.SRC_VIDEO_PATH,FileConstantPath.getAppDataPath(tvMenu.getContext()));
               }
            }
        });
    }
}
