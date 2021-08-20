package com.example.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fragment.R;
import com.example.fragment.Product;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Product> mProductList;
    static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private ImageView image;
        private TextView number;

        public ViewHolder(View view) {
            super(view);
            number=(TextView) view.findViewById(R.id.number_l);
            name=(TextView) view.findViewById(R.id.name_l);
            image=(ImageView) view.findViewById(R.id.image_l);
        }
    }
    public MyAdapter(List<Product> productList){
        mProductList=productList;
    }
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.cell,parent
                ,false);
        ViewHolder holder =new ViewHolder(view) ;
        return holder;
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
        Product product = mProductList.get(position);
        holder.name.setText(product.getName());
        holder.image.setImageResource(product.getImageId() );
        holder.number.setText(product.getNumber());
    }

    @Override
    public int getItemCount() {
        // TODO: Add for test
        return mProductList.size();
    }



}