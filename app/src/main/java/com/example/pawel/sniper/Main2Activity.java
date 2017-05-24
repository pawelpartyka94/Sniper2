package com.example.pawel.sniper;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;

public class Main2Activity extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_look);

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        context = getApplicationContext();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.items);
        // w celach optymalizacji
        recyclerView.setHasFixedSize(true);

        // ustawiamy LayoutManagera
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // ustawiamy animatora, który odpowiada za animację dodania/usunięcia elementów listy
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        // tworzymy adapter oraz łączymy go z RecyclerView

//        recyclerView.addOnScrollListener(new OnScrollListener() {
//                                             @Override
//                                             public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
//                                                 super.onScrollStateChanged(recyclerView, newState);
//                                             }
//                                         }

        recyclerView.setAdapter(new MyAdapter(Tab1Users.nameAllUsers, recyclerView));


    }
}
