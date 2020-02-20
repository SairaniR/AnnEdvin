package com.example.zerec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Members extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_members);

        ArrayList<MemberItem> memberItem = new ArrayList<>();
        memberItem.add(new MemberItem(R.drawable.ic_black , "Mother"));
        memberItem.add(new MemberItem(R.drawable.ic_black , "Mother"));
        memberItem.add(new MemberItem(R.drawable.ic_black , "Mother"));
        memberItem.add(new MemberItem(R.drawable.ic_black , "Mother"));
        memberItem.add(new MemberItem(R.drawable.ic_black , "Mother"));
    }

    public static class MemberItem {
        private int mImageResource;
        private String mLine1;

        public MemberItem(int imageResource, String line1){
            mImageResource = imageResource;
            mLine1 = line1;
        }
        public int getmImageResource(){
            return mImageResource;
        }
        public String getmLine1(){
            return mLine1;
        }
    }
}
