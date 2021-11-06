package org.pytorch.trafficmode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.main_gallery_click_view).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, GalleryActivity.class)));
        findViewById(R.id.main_camera_click_view).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CameraActivity.class)));
    }
}