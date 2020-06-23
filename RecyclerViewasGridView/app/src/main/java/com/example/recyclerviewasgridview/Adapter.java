package com.example.recyclerviewasgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    List<String> title;
    List<Integer> images;
    Context context;
    LayoutInflater layoutInflater;

    public Adapter(List<String> title, List<Integer> images, Context context) {
        this.title = title;
        this.images = images;
        this.context = context;
        this.layoutInflater = layoutInflater.from(context);
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = layoutInflater.inflate(R.layout.list_items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.title.setText(title.get(position));
        holder.icons.setImageResource(images.get(position));

    }

    @Override
    public int getItemCount() {
        return title.size();
    }

    public class ViewHolder  extends RecyclerView.ViewHolder{

        TextView title;
        ImageView icons;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            icons = itemView.findViewById(R.id.imageView);
            
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Toast.makeText(view.getContext(), "Clicked ->" + getAdapterPosition(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }


}
