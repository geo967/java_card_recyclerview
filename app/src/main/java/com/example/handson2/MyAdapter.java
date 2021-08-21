package com.example.handson2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    List<Model> list;
    MyAdapter(List<Model> list){this.list=list;}
    Context context;
    RecyclerView recycler;

    @NonNull
    @Override
    public MyAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        context=parent.getContext();
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyHolder holder, int position) {
        holder.image.setImageResource(list.get(position).getImage());
        holder.text.setText(list.get(position).getDescription());

        holder.showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(context, "hello world", Toast.LENGTH_SHORT).show();
                Snackbar snack=Snackbar.make(v,"image is 1",Snackbar.LENGTH_LONG);
                snack.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView text;
        Button showButton;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            text=itemView.findViewById(R.id.text);
            showButton=itemView.findViewById(R.id.button);

        }
    }


}
