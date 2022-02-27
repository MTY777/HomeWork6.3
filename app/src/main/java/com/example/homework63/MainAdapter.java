package com.example.homework63;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework63.databinding.ItemBinding;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private ArrayList<Model> data;
    private OnClickListener onClickListener;

    public MainAdapter(ArrayList<Model> data, OnClickListener onClickListener) {
        this.data = data;
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolder(ItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.bind(data.get(position));

    }

    @Override
    public int getItemCount() {
        return data.size();
    }



    class MainViewHolder extends RecyclerView.ViewHolder{
        private ItemBinding binding;

        public MainViewHolder(ItemBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }


        public void bind(Model model) {
            binding.tvNumber.setText(model.getNumber());
            binding.tvName.setText(model.getName());
            binding.tvAvtor.setText(model.getAvtor());
            binding.tvTime.setText(model.getTime());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onClickListener.onClick(data.get(getLayoutPosition()));
                }
            });
        }
    }
}
