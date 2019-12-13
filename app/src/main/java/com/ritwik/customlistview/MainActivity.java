package com.ritwik.customlistview;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    List<Custom> customList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customList = new ArrayList<>();
        customList.add(new Custom(R.drawable.spiderman, "Spiderman", "Avengers"));
        customList.add(new Custom(R.drawable.joker, "Joker", "Injustice Gang"));
        customList.add(new Custom(R.drawable.ironman, "Iron Man", "Avengers"));
        customList.add(new Custom(R.drawable.doctorstrange, "Doctor Strange", "Avengers"));
        customList.add(new Custom(R.drawable.captainamerica, "Captain America", "Avengers"));
        customList.add(new Custom(R.drawable.batman, "Batman", "Justice League"));
    }
}
