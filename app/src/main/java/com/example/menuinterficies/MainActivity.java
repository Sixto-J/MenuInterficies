package com.example.menuinterficies;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

       // Intent intent = new Intent(MainActivity.this, RadioGroup.class);
       // MainActivity.this.startActivity(intent);

        Intent intent = new Intent(MainActivity.this, LinearLayoutWeight.class);
        MainActivity.this.startActivity(intent);

    }
}