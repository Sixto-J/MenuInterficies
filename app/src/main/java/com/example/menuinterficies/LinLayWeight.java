package com.example.menuinterficies;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class LinLayWeight extends AppCompatActivity {

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_linial);

        RadioGroup orientation = findViewById(R.id.orientation);
        orientation.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.horizontal:
                        orientation.setOrientation(LinearLayout.HORIZONTAL);
                        break;
                    case R.id.vertical:
                        orientation.setOrientation(LinearLayout.VERTICAL);
                        break;
                }
            }

        });


        RadioGroup gravity = findViewById(R.id.gravity);
        gravity.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {

                    case R.id.left:
                        gravity.setGravity(Gravity.LEFT);
                        break;
                    case R.id.center:
                        gravity.setGravity(Gravity.CENTER_HORIZONTAL);
                        break;
                    case R.id.right:
                        gravity.setGravity(Gravity.RIGHT);
                        break;
                }
            }

        });

    }

}