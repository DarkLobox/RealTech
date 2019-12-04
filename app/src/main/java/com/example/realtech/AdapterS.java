package com.example.realtech;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterS extends RecyclerView.Adapter<AdapterS.ViewHolder>{
    private LayoutInflater layoutInflater;
    private List<Item> items;
    public AdapterS(Context context, List<Item> items){
        this.layoutInflater = LayoutInflater.from(context);
        this.items=items;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.card_item_car, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = items.get(position);

        holder.title.setText(item.getTitle());
        holder.image.setImageResource(item.getImage());
        holder.mount.setText(item.getMount()+"");
        holder.total.setText("$ "+item.getTotal());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder  extends RecyclerView.ViewHolder{
        TextView title, mount,total;
        ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            mount=itemView.findViewById(R.id.mount);
            image=itemView.findViewById(R.id.image);
            total=itemView.findViewById(R.id.total);

        }
    }
}
