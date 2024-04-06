package com.example.baitap;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    final EditText editText = (EditText) findViewById(R.id.editTextText2);
    final AlertDialog alertDialog = new AlertDialog.Builder(this).create();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if(event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                    String mess = editText.getText().toString();
                    alertDialog.setMessage(mess);
                    alertDialog.show();

                    return true;
                }
                return  false;
            }
        });
    }
}