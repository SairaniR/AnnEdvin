package com.example.zerec;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MemberAdapter extends RecyclerView.Adapter<MemberAdapter.MemeberViewHolder> {

    public  static  class MemeberViewHolder extends RecyclerView.ViewHolder {
    public ImageView mImgaeView;
    public TextView mTextView;

        public MemeberViewHolder(@NonNull View itemView) {
            super(itemView);
            mImgaeView = itemView.findViewById(R.id.imageView);
            mTextView = itemView.findViewById(R.id.textViewLine1);
        }
    }

    @NonNull
    @Override
    public MemeberViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MemeberViewHolder memeberViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

