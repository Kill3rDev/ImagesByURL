package com.example.listadeimagenesinternet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView c1,c2,c3,c4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1=findViewById(R.id.image1);
        c2=findViewById(R.id.image2);
        c3=findViewById(R.id.image3);
        c4=findViewById(R.id.image4);


        Picasso.with(this).load("https://store.ubi.com/dw/image/v2/ABBS_PRD/on/demandware.static/-/Sites-masterCatalog/default/dwdf41a589/images/large/56c494ad88a7e300458b4d5a.jpg?sw=341&sh=450&sm=fit.jpg").into(c1);
        Picasso.with(this).load("https://www.muycomputer.com/wp-content/uploads/2020/08/Android.jpg").into(c2);
        Picasso.with(this).load("https://www.muycomputer.com/wp-content/uploads/2020/08/Android11.png").into(c3);
        Picasso.with(this).load("https://www.muycomputer.com/wp-content/uploads/2019/12/android.jpg").into(c4);
    }
}