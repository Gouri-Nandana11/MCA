package com.example.customtoast;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {
    EditText username,pwd;
    Button login;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        login=(Button)findViewById(R.id.buttonl);
        login.setOnClickListener((View.OnClickListener)this);
    username=findViewById(R.id.username);
    pwd=findViewById(R.id.pwd);}
    public void onClick(View v){
        if(v.getId()==R.id.buttonl){
            Toast t1;
            if(username.getText().toString().equals("gouri")&&pwd.getText().toString().equals("123")){
                LayoutInflater lin=getLayoutInflater();
                View appear=lin.inflate(R.layout.toast_layout,(ViewGroup)findViewById(R.id.toast_id) );
                t1=Toast.makeText(this,"",Toast.LENGTH_LONG);
                t1.setGravity(Gravity.TOP,0,200);
                t1.setView(appear);
                t1.show();
            }

            else
                Toast.makeText(this,"invalid login",Toast.LENGTH_LONG).show();
        }
    }
}

