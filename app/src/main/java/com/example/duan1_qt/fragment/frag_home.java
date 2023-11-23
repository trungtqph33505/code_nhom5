package com.example.duan1_qt.fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.duan1_qt.R;
import com.example.duan1_qt.adapter.ClothingAdapter;
import com.example.duan1_qt.model.ClothingItem;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class frag_home extends Fragment {

     DrawerLayout drawerLayout;
     Toolbar toolbar;
    ListView listView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View v =inflater.inflate(R.layout.activity_frag_home,null);
        return v;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        listView= view.findViewById(R.id.listView);

        ArrayList<ClothingItem> clothingItems = new ArrayList<>();

        // Thêm các sản phẩm vào danh sách
        clothingItems.add(new ClothingItem(R.drawable.img_1, "Áo thun Teelab", "150.000đ"));
        clothingItems.add(new ClothingItem(R.drawable.img_2, "Áo thun Teelab ít họa tiết", "20.000đ"));
        clothingItems.add(new ClothingItem(R.drawable.img_3, "Áo gió Teelab", "650.000đ"));
        clothingItems.add(new ClothingItem(R.drawable.img_4, "Áo Bomber NewYork", "1.150.000đ"));
        clothingItems.add(new ClothingItem(R.drawable.img_5, "Quần Jean ống rộng", "190.000đ"));
        clothingItems.add(new ClothingItem(R.drawable.img_6, "Quần Jean óng xuông", "250.000đ"));
        // Thêm sản phẩm khác vào đây

           );listView(clothingItems



    private void funcion_listView(List<ClothingItem> clothingItems){
              listView
    }


    }
