package com.byteshaft.al_quran;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pdfView=findViewById(R.id.pdfv);
        pdfView.fromAsset("java.pdf").swipeHorizontal(true)
                .enableAntialiasing(true)
                .enableSwipe(true)
                .load();
        pdfView.loadPages();
    }
}
