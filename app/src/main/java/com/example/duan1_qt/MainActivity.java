package com.example.duan1_qt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.example.duan1_qt.adapter.ClothingAdapter;
import com.example.duan1_qt.fragment.frag_giohang;
import com.example.duan1_qt.fragment.frag_home;
import com.example.duan1_qt.fragment.frag_thongbao;
import com.example.duan1_qt.fragment.frag_thongtin;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    frag_giohang fg_giohang;
    frag_home fg_home;
    frag_thongbao fg_thongbao;

    frag_thongtin fg_thongtin;
    FragmentManager fm;
    FrameLayout frameLayout;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fg_thongtin = new frag_thongtin();
        fg_giohang = new frag_giohang();
        fg_home = new frag_home();
        fg_thongbao = new frag_thongbao();

        frameLayout = findViewById(R.id.frameLayout);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        fm = getSupportFragmentManager();

        fm.beginTransaction().replace(R.id.frameLayout, fg_home).commit();


        bottomNavigationView.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
            if (item.getItemId() == R.id.HomePage){
                fm.beginTransaction().replace(R.id.frameLayout, fg_home).commit();
            }else if (item.getItemId() == R.id.ThongBao){
                fm.beginTransaction().replace(R.id.frameLayout, fg_thongbao).commit();
            }else if (item.getItemId() == R.id.GioHang){
                fm.beginTransaction().replace(R.id.frameLayout, fg_giohang).commit();
            }else if (item.getItemId() == R.id.Account){
                fm.beginTransaction().replace(R.id.frameLayout, fg_thongtin).commit();
            }

            }
        });

    }
}