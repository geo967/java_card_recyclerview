package com.example.handson2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Model> list=new ArrayList<>();
    MyAdapter myAdapter;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler=findViewById(R.id.recyler);
        recycler.setHasFixedSize(true);

        getContent();

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recycler.setLayoutManager(layoutManager);
        myAdapter=new MyAdapter(list);
        recycler.setAdapter(myAdapter);

/*
        Button showButton;
        showButton=findViewById(R.id.button);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello1", Toast.LENGTH_SHORT).show();
            }
        });
*/


    }

    public void getContent(){
        list.add(new Model((R.drawable.hello1),"this is hello1"));
        list.add(new Model((R.drawable.hello2),"this is hello2"));
        list.add(new Model((R.drawable.hello3),"this is hello3"));
        list.add(new Model((R.drawable.hello4),"this is hello4"));
        list.add(new Model((R.drawable.hello5),"this is hello5"));
        list.add(new Model((R.drawable.hello6),"this is hello6"));
        list.add(new Model((R.drawable.hello7),"this is hello7"));
        list.add(new Model((R.drawable.hello8),"this is hello8"));
        list.add(new Model((R.drawable.hello9),"this is hello9"));

        list.add(new Model((R.drawable.hello1),"this is hello1"));
        list.add(new Model((R.drawable.hello2),"this is hello2"));
        list.add(new Model((R.drawable.hello3),"this is hello3"));
        list.add(new Model((R.drawable.hello4),"this is hello4"));
        list.add(new Model((R.drawable.hello5),"this is hello5"));
        list.add(new Model((R.drawable.hello6),"this is hello6"));
        list.add(new Model((R.drawable.hello7),"this is hello7"));
        list.add(new Model((R.drawable.hello8),"this is hello8"));
        list.add(new Model((R.drawable.hello9),"this is hello9"));

        list.add(new Model((R.drawable.hello1),"this is hello1"));
        list.add(new Model((R.drawable.hello2),"this is hello2"));
        list.add(new Model((R.drawable.hello3),"this is hello3"));
        list.add(new Model((R.drawable.hello4),"this is hello4"));
        list.add(new Model((R.drawable.hello5),"this is hello5"));
        list.add(new Model((R.drawable.hello6),"this is hello6"));
        list.add(new Model((R.drawable.hello7),"this is hello7"));
        list.add(new Model((R.drawable.hello8),"this is hello8"));
        list.add(new Model((R.drawable.hello9),"this is hello9"));

        list.add(new Model((R.drawable.hello1),"this is hello1"));
        list.add(new Model((R.drawable.hello2),"this is hello2"));
        list.add(new Model((R.drawable.hello3),"this is hello3"));
        list.add(new Model((R.drawable.hello4),"this is hello4"));
        list.add(new Model((R.drawable.hello5),"this is hello5"));
        list.add(new Model((R.drawable.hello6),"this is hello6"));
        list.add(new Model((R.drawable.hello7),"this is hello7"));
        list.add(new Model((R.drawable.hello8),"this is hello8"));
        list.add(new Model((R.drawable.hello9),"this is hello9"));

        list.add(new Model((R.drawable.hello1),"this is hello1"));
        list.add(new Model((R.drawable.hello2),"this is hello2"));
        list.add(new Model((R.drawable.hello3),"this is hello3"));
        list.add(new Model((R.drawable.hello4),"this is hello4"));
        list.add(new Model((R.drawable.hello5),"this is hello5"));
        list.add(new Model((R.drawable.hello6),"this is hello6"));
        list.add(new Model((R.drawable.hello7),"this is hello7"));
        list.add(new Model((R.drawable.hello8),"this is hello8"));
        list.add(new Model((R.drawable.hello9),"this is hello9"));

        list.add(new Model((R.drawable.hello1),"this is hello1"));
        list.add(new Model((R.drawable.hello2),"this is hello2"));
        list.add(new Model((R.drawable.hello3),"this is hello3"));
        list.add(new Model((R.drawable.hello4),"this is hello4"));
        list.add(new Model((R.drawable.hello5),"this is hello5"));
        list.add(new Model((R.drawable.hello6),"this is hello6"));
        list.add(new Model((R.drawable.hello7),"this is hello7"));
        list.add(new Model((R.drawable.hello8),"this is hello8"));
        list.add(new Model((R.drawable.hello9),"this is hello9"));
    }

}