package com.example.menuinterficies;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class RelativeLink extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);

        Button btn;
        btn = findViewById(R.id.ok);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = ((EditText) findViewById(R.id.entry)).getText().toString();
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(url)));
            }
        });

        Button bt2 = findViewById(R.id.cancel);
        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                EditText et = findViewById(R.id.entry);
                et.setText("");

            }
        });


    }

}
