package com.test.androidlibrary_202301;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.test.mylibrary_2023_1.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ModelClass modelClass=new ModelClass();
        modelClass.modelFunction(100);

    }
}