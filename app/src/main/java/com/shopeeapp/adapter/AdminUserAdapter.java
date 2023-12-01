package com.shopeeapp.adapter;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.shopeeapp.R;
import com.shopeeapp.dbhelper.UserDbHelper;
import com.shopeeapp.entity.User;

import java.util.ArrayList;

public class AdminUserAdapter extends ArrayAdapter<User> {
    Activity context;
    ArrayList<User> users;
    int layoutResource;

    private UserDbHelper userDbHelper;

    public AdminUserAdapter(Activity context, int resource, ArrayList<User> objects, UserDbHelper userDbHelper)
    {
        super(context, resource, objects);
        this.context = context;
        this.users = objects;
        this.layoutResource = resource;
        this.userDbHelper = userDbHelper;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=this.context.getLayoutInflater();
        View row=layoutInflater.inflate(this.layoutResource,null);
        TextView userId = row.findViewById(R.id.txt_row_show_idUser);
        userId.setText(users.get(position).getId().toString());
        TextView userName = row.findViewById(R.id.txt_row_show_nameUser);
        userName.setText(users.get(position).getFullname());

        row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDeleteConfirmationDialog(position, userDbHelper, users);
            }
        });

        return row;
    }

    private void showDeleteConfirmationDialog(final int position, UserDbHelper userDbHelper, ArrayList<User> userId) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Confirm Delete");
        builder.setMessage("Are you sure you want to delete this item?");

        builder.setPositiveButton("Yes", (dialog, which) -> {
            // Perform deletion or any action here
            // Example: userDbHelper.deleteUser(users.get(position).getId());
            int result = userDbHelper.delete(userId.get(position));
            if (result > 0){
                Toast.makeText(context, "Successfully", Toast.LENGTH_SHORT).show();
                userId.clear();
                userId.addAll(userDbHelper.getAllUser());
                notifyDataSetChanged();
            }
            notifyDataSetChanged();
        });

        builder.setNegativeButton("No", (dialog, which) -> dialog.dismiss());

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
