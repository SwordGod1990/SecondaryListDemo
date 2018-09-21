package com.zyjk.secondarylistdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<SecondaryListAdapter.DataTree<String, String>> datas = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);

        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);
        rv.addItemDecoration(new RvDividerItemDecoration(this, LinearLayoutManager.VERTICAL));


        RecyclerAdapter adapter = new RecyclerAdapter(this);

        adapter.setData(datas);
        rv.setAdapter(adapter);
    }

    {

        List<String> group = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            datas.add(new SecondaryListAdapter.DataTree<String, String>(String.valueOf("阿莫西林颗粒" + i), new
                    ArrayList<String>() {{
                        add("我是二级菜单1");
                        add("我是二级菜单2");
                        add("我是二级菜单3");
                    }}));

        }

    }
}
