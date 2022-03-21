package com.example.imagepro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SampleImagesActivity extends AppCompatActivity {

    RecyclerView sampleImagesRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_images);

        sampleImagesRecyclerView = findViewById(R.id.sample_images_recyclerview);

       final int[] sampleImagesList = {
               R.drawable.image_1,
               R.drawable.image_2,
               R.drawable.image_3,
               R.drawable.image_4,
               R.drawable.image_5,
               R.drawable.image_6,
               R.drawable.image_7,
               R.drawable.image_8,
               R.drawable.image_9,
               R.drawable.image_10,
               R.drawable.image_11,
               R.drawable.image_12,
               R.drawable.image_13,
               R.drawable.image_14,
               R.drawable.image_15,
               R.drawable.image_16,
               R.drawable.image_17,
               R.drawable.image_18,
               R.drawable.image_19,
               R.drawable.image_20,

       };

       SampleImagesAdapter adapter = new SampleImagesAdapter(this, sampleImagesList);
        sampleImagesRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        sampleImagesRecyclerView.setAdapter(adapter);

    }
}