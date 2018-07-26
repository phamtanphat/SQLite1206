package com.ptp.phamtanphat.sqlite1206;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    SQLitedatabase sqLitedatabase;

    RecyclerView recyclerView;
    ArrayList<Nhahang> mangnhahang;
    NhahangAdapter nhahangAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tao database
        sqLitedatabase = new SQLitedatabase(this,"Quanlynhahang.sql",null,1);
        //Tao bang
//        Tenmonan - Giamonan - diadiem
//        String createtable = "CREATE TABLE IF NOT EXISTS Nhahang(Id INTEGER PRIMARY KEY AUTOINCREMENT , Tenmonan VARCHAR , Giamonan INTEGER , Diadiem VARCHAR ) ";
//        sqLitedatabase.QueryData(createtable);

        //Them du lieu
//        String inserttable = "INSERT INTO Nhahang VALUES(null,'Lau bo',150000,'Quan 4')";
//        sqLitedatabase.QueryData(inserttable);
        //lay du lieu
        recyclerView = findViewById(R.id.recyclerViewNhahang);
        mangnhahang = new ArrayList<>();
        nhahangAdapter = new NhahangAdapter(MainActivity.this,mangnhahang);

        LinearLayoutManager gridLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(nhahangAdapter);
        Cursor cursor = sqLitedatabase.GetData("SELECT * FROM Nhahang");
        while (cursor.moveToNext()){
            int id = cursor.getInt(0);
            String tenmonan = cursor.getString(1);
            Integer giamonan = cursor.getInt(2);
            String diadiem = cursor.getString(3);
            mangnhahang.add(new Nhahang(id,tenmonan,giamonan,diadiem));
        }
        nhahangAdapter.notifyDataSetChanged();
    }
}
