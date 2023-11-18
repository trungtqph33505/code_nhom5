package com.example.duan1_qt.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

private static final String DATABASE_NAME ="duan1.db";
private static final int DATABASE_VESION = 1;


public DBHelper(@Nullable Context context){
    super(context, DATABASE_NAME, null,DATABASE_VESION);

}
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    }


