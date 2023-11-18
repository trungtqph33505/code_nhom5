package com.example.duan1_qt;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawer_layout);




        NavigationView navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // Xử lý khi một mục trong Navigation Drawer được chọn
                        int id = menuItem.getItemId();
                        // Xử lý click vào từng mục menu ở đây
                        return true;
                    }
                });

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        ListView listView = findViewById(R.id.listView);
        ArrayList<ClothingItem> clothingItems = new ArrayList<>();

        // Thêm các sản phẩm vào danh sách
        clothingItems.add(new ClothingItem(R.drawable.img_1, "Áo thun Teelab", "150.000đ"));
        clothingItems.add(new ClothingItem(R.drawable.img_2, "Áo thun Teelab ít họa tiết", "20.000đ"));
        clothingItems.add(new ClothingItem(R.drawable.img_3, "Áo gió Teelab", "650.000đ"));
        clothingItems.add(new ClothingItem(R.drawable.img_4, "Áo Bomber NewYork", "1.150.000đ"));
        clothingItems.add(new ClothingItem(R.drawable.img_5, "Quần Jean ống rộng", "190.000đ"));
        clothingItems.add(new ClothingItem(R.drawable.img_6, "Quần Jean óng xuông", "250.000đ"));
        // Thêm sản phẩm khác vào đây

        ClothingAdapter adapter = new ClothingAdapter(this, clothingItems);
        listView.setAdapter(adapter);
    }
}