package com.example.lap11799.loadimage;

import android.Manifest;
import android.app.Application;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.request.RequestOptions;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    SimpleDraweeView draweeView;
    ImageView imageViewGlide;
    ImageView imageViewPicasso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(getApplicationContext());
        setContentView(R.layout.activity_main);

        // Load image using Fresco
        Uri uri = Uri.parse("http://frescolib.org/static/og_image.png");
        draweeView = (SimpleDraweeView) findViewById(R.id.my_image_view);
        draweeView.setImageURI(uri);

        // Load image using Glide
        imageViewGlide = (ImageView) findViewById(R.id.imageViewGlide);
        Glide.with(MainActivity.this)
                .load("http://androidcoban.com/wp-content/uploads/2016/11/thu-vien-glide-android.png")
                .into(imageViewGlide);

        // Load image using Picasso
        imageViewPicasso = findViewById(R.id.imageViewPicasso);
        Picasso.with(MainActivity.this)
                .load("https://images-na.ssl-images-amazon.com/images/I/61%2BUoXxCV1L.png")
                .into(imageViewPicasso);

    }
}
