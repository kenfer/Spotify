package com.example.kenneth.spotify;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarBadge;
import com.roughike.bottombar.OnMenuTabClickListener;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    LinearLayoutManager layoutManager;
    List<Songs> songs;
    SongAdapter songAdapter;
    RecyclerView recyclerView;
    BottomBar bottomBar,Bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomBar = BottomBar.attach(this,savedInstanceState);
        bottomBar.setItemsFromMenu(R.menu.menu_main, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(int menuItemId) {

            }

            @Override
            public void onMenuTabReSelected(int menuItemId) {

            }
        });
        BottomBarBadge unread;
        unread = bottomBar.makeBadgeForTabAt(3,"#212121",13);
        unread.show();

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar);

        functions();
    }
    public void functions(){
        songs = SongDetails.getList();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        songAdapter = new SongAdapter(MainActivity.this,songs);
        recyclerView.setAdapter(songAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
}
