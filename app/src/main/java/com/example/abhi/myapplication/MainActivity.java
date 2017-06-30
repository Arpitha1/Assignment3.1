package com.example.abhi.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    EditText name;
    Button search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.etname);
        search = (Button) findViewById(R.id.search);

    }


            public void openbrowser(View v) {

                String data=name.getText().toString();

                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com?q="+data));
                startActivity(intent);
            }
        }




