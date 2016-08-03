package itokcenter.com.listas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterRC adapterRC;
    List<ItemRc> itemRcs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.myRC);

        itemRcs.add(new ItemRc(R.mipmap.ic_launcher, "Andy"));
        itemRcs.add(new ItemRc(R.mipmap.ic_launcher, "Apple"));
        itemRcs.add(new ItemRc(R.mipmap.ic_launcher, "Google"));
        itemRcs.add(new ItemRc(R.mipmap.ic_launcher, "Facebook"));
        itemRcs.add(new ItemRc(R.mipmap.ic_launcher, "Twitter"));
        itemRcs.add(new ItemRc(R.mipmap.ic_launcher, "Tesla"));
        itemRcs.add(new ItemRc(R.mipmap.ic_launcher, "Tesla"));
        itemRcs.add(new ItemRc(R.mipmap.ic_launcher, "Tesla"));
        itemRcs.add(new ItemRc(R.mipmap.ic_launcher, "Tesla"));
        itemRcs.add(new ItemRc(R.mipmap.ic_launcher, "Tesla"));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
//        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(MainActivity.this, 2);

        recyclerView.setLayoutManager(layoutManager);

        adapterRC = new AdapterRC(itemRcs, MainActivity.this);
        recyclerView.setAdapter(adapterRC);

    }


}
