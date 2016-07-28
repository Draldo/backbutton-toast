package com.example.admin.backbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        switch (keyCode){
            case KeyEvent.KEYCODE_BACK:
                Toast.makeText(MainActivity.this,"Back button pressed", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onKeyUp(keyCode, event);
        }
    }
}
