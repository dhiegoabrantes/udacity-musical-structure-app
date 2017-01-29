package com.example.android.miwok.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.android.miwok.repository.MusicRepository;
import com.example.android.miwok.R;

import java.util.List;

public class BluesActivity extends AppCompatActivity {

    private MusicRepository musicRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blues);

        this.musicRepository = new MusicRepository();

        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        fillMusicList();
    }

    private void fillMusicList(){
        List<String> musicList = this.musicRepository.getBluesMusic();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                musicList );

        ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(arrayAdapter);
    }
}
