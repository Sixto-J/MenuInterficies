package com.example.menuinterficies;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.appcompat.app.AppCompatActivity;


public class Radio_Group extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    CheckBox cb1, cb2, cb3;

    @Override
    public void onCreate(Bundle icicle) {

        super.onCreate(icicle);

        setContentView(R.layout.activity_radio_group);

        cb1 = (CheckBox) findViewById(R.id.check);
        cb2 = (CheckBox) findViewById(R.id.check2);
        cb3 = (CheckBox) findViewById(R.id.check3);

        cb1.setOnCheckedChangeListener(this);
        cb2.setOnCheckedChangeListener(this);
        cb3.setOnCheckedChangeListener(this);

    }

    public void onCheckedChanged(CompoundButton buttonView,
                                 boolean isChecked) {
        if (isChecked) {
            buttonView.setText("This checkbox is: checked");

        } else {
            buttonView.setText("This checkbox is: unchecked");

        }

    }

}