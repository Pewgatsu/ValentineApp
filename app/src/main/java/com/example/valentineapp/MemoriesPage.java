package com.example.valentineapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class MemoriesPage extends AppCompatActivity {

    GridView gridView;
    int[] pictures = {R.drawable.cm,R.drawable.garden_of_words1, R.drawable.dota2, R.drawable.hunterxhunter,
                      R.drawable.red_velvet, R.drawable.twice, R.drawable.rammee, R.drawable.sushi, R.drawable.elle,
                      R.drawable.yukki};
    int[] description = {R.string.desc1,R.string.desc2,R.string.desc3, R.string.desc4,R.string.desc5,R.string.desc6,
                         R.string.desc7,R.string.desc8,R.string.desc9, R.string.desc10 };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_memories);

        gridView = (GridView) findViewById(R.id.simpleGridView);

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(),pictures,description);
        gridView.setAdapter(customAdapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), MemoriesContent.class);
                intent.putExtra("image",pictures[position]);
                intent.putExtra("description",description[position]);
                startActivity(intent);
            }
        });

    }

}
