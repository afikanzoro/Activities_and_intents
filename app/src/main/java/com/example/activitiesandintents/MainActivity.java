package com.example.activitiesandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static String LOG_TAG = "MainActivity.class.getSimpleName()";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     public void lauchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent= new Intent(this,SecondActivity.class);
        String message= messageEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent, TEXT_REQUEST);

     }

}
