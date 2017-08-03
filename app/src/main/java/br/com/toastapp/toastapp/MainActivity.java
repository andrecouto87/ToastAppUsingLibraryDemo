package br.com.toastapp.toastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.mylib.mylib.CustomToast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (BuildConfig.REPORT_CRASH) {
            CustomToast.showToast(this, "REPORT CRASH");
        } else {
            CustomToast.showToast(this, "NO REPORT CRASH");
        }


    }
}
