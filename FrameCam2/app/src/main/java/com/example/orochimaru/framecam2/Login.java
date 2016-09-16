package com.example.orochimaru.framecam2;

import android.content.*;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.*;
import android.widget.*;



/**
 * Created by Orochimaru on 15/09/2016.
 */
public class Login extends AppCompatActivity {
    private Button btnEntrar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        btnEntrar = (Button) (findViewById(R.id.btnEntrar));

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent();
                it.setClass(Login.this, MainActivity.class);
                startActivity(it);
                finish();;
            }
          });

    }
}