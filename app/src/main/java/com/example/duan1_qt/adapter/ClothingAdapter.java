package com.example.duan1_qt.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.duan1_qt.R;
import com.example.duan1_qt.model.ClothingItem;

import java.util.ArrayList;

public class ClothingAdapter extends ArrayAdapter<ClothingItem> {
    public ClothingAdapter(Context context, ArrayList<ClothingItem> clothingItems) {
        super(context, 0, clothingItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ClothingItem clothingItem = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_clothing, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView nameTextView = convertView.findViewById(R.id.nameTextView);
        TextView priceTextView = convertView.findViewById(R.id.priceTextView);

        imageView.setImageResource(clothingItem.getImageResource());
        nameTextView.setText(clothingItem.getName());
        priceTextView.setText(clothingItem.getPrice());

        return convertView;
    }
}

