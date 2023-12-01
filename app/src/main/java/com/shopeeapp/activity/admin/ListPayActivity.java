package com.shopeeapp.activity.admin;

import static com.shopeeapp.utilities.AccountSessionManager.user;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.google.android.material.switchmaterial.SwitchMaterial;
import com.shopeeapp.R;
import com.shopeeapp.adapter.BillAdapter;
import com.shopeeapp.dbhelper.BillDbHelper;
import com.shopeeapp.entity.Bill;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListPayActivity extends AppCompatActivity {

    @BindView(R.id.btnBack)
    ImageButton btnBack;
    @BindView(R.id.swViewAll)
    SwitchMaterial swViewAll;
    @BindView(R.id.rvBillHistory)
    RecyclerView rvBillHistory;
    @BindView(R.id.noMoreBills)
    LinearLayout noMoreBills;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pay);

        ButterKnife.bind(this);

        btnBack.setOnClickListener(view -> finish());
        swViewAll.setOnClickListener(view -> setBillSDisplay());
        setBillSDisplay();
    }

    private void setBillSDisplay() {
        BillDbHelper billDbHelper = new BillDbHelper(this);
        ArrayList<Bill> bills = new ArrayList<>();
        if (swViewAll.isChecked())
            bills = billDbHelper.getAllBillsAdmin();
        else
            bills = billDbHelper.getUnpaidBillsAdmin();
        if (bills.size() > 0) {
            BillAdapter adapter = new BillAdapter(bills, this);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
            rvBillHistory.setLayoutManager(layoutManager);
            rvBillHistory.setAdapter(adapter);
            rvBillHistory.setVisibility(View.VISIBLE);
            noMoreBills.setVisibility(View.GONE);
            for (Bill bill : bills) {
                System.out.println(bill);
            }
        } else {
            rvBillHistory.setVisibility(View.GONE);
            noMoreBills.setVisibility(View.VISIBLE);
        }
    }
}