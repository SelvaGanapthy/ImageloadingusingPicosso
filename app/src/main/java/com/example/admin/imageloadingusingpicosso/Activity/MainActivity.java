package com.example.admin.imageloadingusingpicosso.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.admin.imageloadingusingpicosso.Adapter.DataAdapter;
import com.example.admin.imageloadingusingpicosso.POJO.Androidversion;
import com.example.admin.imageloadingusingpicosso.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    ArrayList<Androidversion> android;
    public  String android_version_names[] = {
            "Donut",
            "Eclair",
            "Froyo",
            "Gingerbread",
            "Honeycomb",
            "Ice Cream Sandwich",
            "Jelly Bean",
            "KitKat",
            "Lollipop",
            "Marshmallow"
    };
    public  String android_image_urls[] = {

            "https://api.learn2crack.com/android/images/donut.png",
            "https://api.learn2crack.com/android/images/eclair.png",
            "https://api.learn2crack.com/android/images/froyo.png",
            "https://api.learn2crack.com/android/images/ginger.png",
            "https://api.learn2crack.com/android/images/honey.png",
            "https://api.learn2crack.com/android/images/icecream.png",
            "https://api.learn2crack.com/android/images/jellybean.png",
            "https://api.learn2crack.com/android/images/kitkat.png",
            "https://api.learn2crack.com/android/images/lollipop.png",
            "https://api.learn2crack.com/android/images/marshmallow.png"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        android = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new DataAdapter(MainActivity.this, loaddata()));


        //recyclerView.setAdapter(new DataAdapter(this,loaddata()));
    }

    public ArrayList<Androidversion> loaddata() {
        for (int i = 0; i < android_image_urls.length; i++) {
            Androidversion androidversion = new Androidversion();
            androidversion.setA_vname(android_version_names[i]);
            androidversion.setA_iv(android_image_urls[i]);
            android.add(androidversion);

        }
        return  android;
    }
}
