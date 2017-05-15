package com.cuongmv162.cubertodialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cuongmv162.cubertodialog.dialog.CubertoDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CubertoDialog cubertoDialog = new CubertoDialog();
        cubertoDialog.show(getFragmentManager(), "Cuberto dialog");
    }
}
