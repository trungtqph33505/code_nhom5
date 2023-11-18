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
    String User = "CREATE TABLE User (" +
                "ID TEXT PRIMARY KEY AUTOINCREMENT, " +
                "taiKhoan TEXT NOT NULL, " +
                "matKhau TEXT NOT NULL )";
    sqLiteDatabase.execSQL(User);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    if ( i < i1 ){
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS User");
        onCreate(sqLiteDatabase);
    }
    }

    public boolean Insert(String taiKhoan, String matKhau){
    SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("taiKhoan",taiKhoan );
        contentValues.put("matKhau",matKhau);
        long result = sqLiteDatabase.insert("User", null,contentValues);
        if (result == -1 ){
            return false;
        }else {
            return true;
        }
    }

    public Boolean CheckUsername (String taiKhoan){
    SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM User WHERE taiKhoan=?", new String[]{taiKhoan} );
        if (cursor.getCount() > 0){
            return false;
        }else {
            return true;
        }
    }

    public Boolean CheckLogin (String taiKhoan , String matKhau){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM User WHERE taiKhoan=? AND matKhau=?", new String[]{taiKhoan, matKhau} );
        if (cursor.getCount() > 0){
            return false;
        }else {
            return true;
        }
    }

}
