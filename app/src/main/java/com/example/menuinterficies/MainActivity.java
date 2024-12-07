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

        Intent intent5 = new Intent(MainActivity.this, Form.class);
        MainActivity.this.startActivity(intent5);
        /*
         Intent intent4 = new Intent(MainActivity.this, Overlap.class);
        MainActivity.this.startActivity(intent4);

         Intent intent3 = new Intent(MainActivity.this, RelativeLink.class);
         MainActivity.this.startActivity(intent3);

         Intent intent2 = new Intent(MainActivity.this, LinLayWeight.class);
         MainActivity.this.startActivity(intent2);

         Intent intent = new Intent(MainActivity.this, RadioGroup.class);
         MainActivity.this.startActivity(intent);
        */

    }
}