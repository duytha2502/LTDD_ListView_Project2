package com.example.ltdd_listview_project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        List<LapTop> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomListAdapter(this, image_details));

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                LapTop laptop= (LapTop) o;
                Toast.makeText(MainActivity.this, "Selected :" + " " + laptop, Toast.LENGTH_LONG).show();
            }
        });
    }


    private  List<LapTop> getListData() {
        List<LapTop> list = new ArrayList<LapTop>();
        LapTop MSI = new LapTop("Laptop Gaming MSI Vector GP76 12UGS 610VN", "MSI", 57990000,48990000);
        LapTop Acer = new LapTop("Laptop gaming Acer Predator Helios 300 PH315 55 76KG", "Acer", 46990000,40990000  );
        LapTop Asus = new LapTop("Laptop gaming Asus ROG Flow Z13 GZ301ZC LD110W", "Asus", 49990000,44990000);


        list.add(MSI);
        list.add(Acer);
        list.add(Asus);

        return list;
    }

}
