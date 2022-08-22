package com.example.stuaid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NotenAdapter extends RecyclerView.Adapter<NotenVH>{

    List <String> items;

    public NotenAdapter(List<String> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public NotenVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);

        return new NotenVH(view).linkAdapter(this);
    }

    @Override
    public void onBindViewHolder(@NonNull NotenVH holder, int position) {
        holder.textView.setText(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}

class NotenVH extends RecyclerView.ViewHolder {

    TextView textView;
    private NotenAdapter adapter;

    public NotenVH(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.text);
        itemView.findViewById(R.id.delete).setOnClickListener(view -> {
            adapter.items.remove(getAdapterPosition());
            adapter.notifyItemRemoved(getAdapterPosition());
    });
    }

    public NotenVH linkAdapter(NotenAdapter adapter){
        this.adapter = adapter;
        return this;
    }

}

