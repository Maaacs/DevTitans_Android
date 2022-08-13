package com.example.recyclerviewtitan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewtitan.adapter.ParentItemAdapter;
import com.example.recyclerviewtitan.model.ChildItem;
import com.example.recyclerviewtitan.model.ParentItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity
        extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView ParentRecyclerViewItem = findViewById(R.id.parent_recyclerview);

        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        ParentItemAdapter parentItemAdapter = new ParentItemAdapter(ParentItemList());

        ParentRecyclerViewItem.setAdapter(parentItemAdapter);
        ParentRecyclerViewItem.setLayoutManager(layoutManager);
    }

    private List<ParentItem> ParentItemList()
    {
        List<ParentItem> itemList = new ArrayList<>();

        ParentItem item0 = new ParentItem( "Rock", ChildItemList('a'));
        itemList.add(item0);
        ParentItem item1 = new ParentItem("Pop", ChildItemList('b'));
        itemList.add(item1);
        ParentItem item2 = new ParentItem("Hip Hop", ChildItemList('c'));
        itemList.add(item2);
        ParentItem item3 = new ParentItem("Eletrônica", ChildItemList('d'));
        itemList.add(item3);
        ParentItem item4 = new ParentItem("Indie", ChildItemList('e'));
        itemList.add(item4);
           return itemList;
    }

    private List<ChildItem> ChildItemList(char musicas)
    {
        List<ChildItem> ChildItemList
                = new ArrayList<>();

        switch (musicas){
            case 'a':
                ChildItemList.add(new ChildItem("Nirvana",9));
                ChildItemList.add(new ChildItem("Red Hot", 8));
                ChildItemList.add(new ChildItem("U2", 10));
                ChildItemList.add(new ChildItem("Iron Maiden",7));
                ChildItemList.add(new ChildItem("Pink Floyd",5));
                ChildItemList.add(new ChildItem("Queen",10));
                break;
            case 'b':
                ChildItemList.add(new ChildItem("Justin Bieber",10));
                ChildItemList.add((new ChildItem("Taylor Swift",10)));
                ChildItemList.add(new ChildItem("Adele",8));
                ChildItemList.add(new ChildItem("Drake",7));
                ChildItemList.add(new ChildItem("BTS",9));
                ChildItemList.add(new ChildItem("Doja Cat",5));
                break;
            case 'c':
                ChildItemList.add(new ChildItem("50CENT",10));
                ChildItemList.add(new ChildItem("Akon",10));
                ChildItemList.add(new ChildItem("Lil Wayne",10));
                ChildItemList.add(new ChildItem("Chris Brown",10));
                ChildItemList.add(new ChildItem("Drake",10));
                ChildItemList.add(new ChildItem("NE-YO5",10));
                break;
            case 'd':
                ChildItemList.add(new ChildItem("David Guetta",2));
                ChildItemList.add(new ChildItem("Martin Garrix",2));
                ChildItemList.add(new ChildItem("Tiesto",10));
                ChildItemList.add(new ChildItem("Skrilles",2));
                ChildItemList.add(new ChildItem("Steve Aoki",1));
                break;
            case 'e':
                ChildItemList.add(new ChildItem("Snow patrol",10));
                ChildItemList.add(new ChildItem("Arcade Fire",2));
                ChildItemList.add(new ChildItem("PARAMORE",10));
                ChildItemList.add(new ChildItem("The Strokes",8));
                ChildItemList.add(new ChildItem("The Killers",9));
                ChildItemList.add(new ChildItem("The Shins",10));
                break;
        }
        return ChildItemList;
    }
}