package com.example.a25_05_2026_resourcesinandroid_demo;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Resources resources;
    int colourGreen;
    int valueOfOne;
    int [] numbers;
    String welcomeAndroid;
    String [] students;
    float width;
    TypedArray colourNames;
    ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        resources = getResources();
        colourGreen = resources.getColor(R.color.green,null);
        valueOfOne = resources.getInteger(R.integer.one);
        numbers = resources.getIntArray(R.array.numbers);
        welcomeAndroid = resources.getString(R.string.welcome_android);
        students = resources.getStringArray(R.array.students);
        width = resources.getDimension(R.dimen.width);
        colourNames = resources.obtainTypedArray(R.array.colour_names);

        imageView1.setImageResource(R.drawable.image_1);
        Log.e("tag","" + colourGreen);
        Log.e("tag",valueOfOne + "");
        Log.e("tag" ,welcomeAndroid);

        for(int i = 0; i < numbers.length; i++) {
            Log.e("tag",numbers[i] + "");
        }

        Log.e("tag","===========================");

//      for each loop
        for (int eachNumber: numbers) {
            Log.e("tag",eachNumber + "");
        }

        Log.e("tag","===========================");
        for (String eachStudent : students) {
            Log.e("tag",eachStudent);
        }
    }
}