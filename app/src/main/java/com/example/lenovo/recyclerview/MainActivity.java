package com.example.lenovo.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    String[] country = {"dsfsr","reyrthf","fgjghjsr","ewrtefgd","aertgdf","rfgerfg","asfgqasgd","dsrfgds","aerfg","qaertggf","tyghgf","asrdgsdfg","rwysy","vbndfg","yfgjfbh","rtyhgj","khjgh","qaewtfgjn","sdfdhf"};
    String[] capital = {"dsfsr","reyrthf","fgjghjsr","ewrtefgd","aertgdf","rfgerfg","asfgqasgd","dsrfgds","aerfg","qaertggf","tyghgf","asrdgsdfg","rwysy","vbndfg","yfgjfbh","rtyhgj","khjgh","qaewtfgjn","sdfdhf"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        adapter = new RecyclerAdapter(country,capital);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

    }
}
