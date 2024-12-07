package com.example.menuinterficies;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        RadioGroup menu = (RadioGroup) findViewById(R.id.menu);
        menu.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {

                    case R.id.radio_group:
                        Intent intent1 = new Intent(MainActivity.this, Radio_Group.class);
                        MainActivity.this.startActivity(intent1);
                        break;
                    case R.id.ll_weight:
                        Intent intent2 = new Intent(MainActivity.this, LinLayWeight.class);
                        MainActivity.this.startActivity(intent2);
                        break;
                    case R.id.rel_link:
                        Intent intent3 = new Intent(MainActivity.this, RelativeLink.class);
                        MainActivity.this.startActivity(intent3);
                        break;
                    case R.id.overlap:
                        Intent intent4 = new Intent(MainActivity.this, Overlap.class);
                        MainActivity.this.startActivity(intent4);
                        break;
                    case R.id.form:
                        Intent intent5 = new Intent(MainActivity.this, Form.class);
                        MainActivity.this.startActivity(intent5);
                        break;


                }
            }

        });

    }

}