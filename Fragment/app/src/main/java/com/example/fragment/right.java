package com.example.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class right extends Fragment {
    private MyAdapter adapter;
    private List<Product> productList=new ArrayList<>();
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.right,container,false);
        hellodata();
        RecyclerView recyclerView =(RecyclerView) view.findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager =new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        MyAdapter adapter = new MyAdapter(productList);
        recyclerView.setAdapter(adapter);
        return  view;
    }

    private  void hellodata(){
        for(int i=1;i<4;i++){
            Product a=new Product("1",R.drawable.shenli,"一");
            productList.add(a);
            Product b=new Product("2",R.drawable.shenli,"二");
            productList.add(b);
            Product c=new Product("3",R.drawable.shenli,"三");
            productList.add(c);
            Product d=new Product("4",R.drawable.shenli,"四");
            productList.add(d);
            Product e=new Product("5",R.drawable.shenli,"五");
            productList.add(e);
            Product f=new Product("6",R.drawable.shenli,"六");
            productList.add(f);



        }
    }
}
