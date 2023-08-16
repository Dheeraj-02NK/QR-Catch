package com.example.qr_scan;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
    }

    private void initComponents(){
        findViewById(R.id.buttonTakePicture).setOnClickListener(this);
        findViewById(R.id.buttonScanBarcode).setOnClickListener(this);
    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        int viewId = view.getId();
        if (viewId == R.id.buttonScanBarcode) {
            startActivity(new Intent(this, ScannerBarcodeActivity.class));
        } else if (viewId == R.id.buttonTakePicture) {
            startActivity(new Intent(this, PictureBarcodeActivity.class));
        }
    }
}