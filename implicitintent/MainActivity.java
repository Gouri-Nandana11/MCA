package com.example.implicitintent;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View

        .OnClickListener {
    Button map,play,email,msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        map=findViewById(R.id.map);
        play=findViewById(R.id.play);
        email=findViewById(R.id.mail);
        msg=findViewById(R.id.msg);
        map.setOnClickListener(this);
        play.setOnClickListener(this);
        email.setOnClickListener(this);
        msg.setOnClickListener(this);

        ;
    }
    @Override
    public  void onClick(View view){
        Intent intent,chooser;
        if(view.getId()==R.id.map){
            intent=new Intent(Intent.ACTION_VIEW);
            Intent setData = intent.setData(Uri.parse("geo:10.065206,76.629128"));
            chooser=Intent.createChooser(intent, "Launch Maps");
            startActivity(chooser);
        }
        if(view.getId()==R.id.mail){
            intent=new Intent(Intent.ACTION_SEND);
            String[] to={"gourinandanam11@gmail.com"};
            intent.putExtra(Intent.EXTRA_EMAIL,to);
            intent.putExtra(intent.EXTRA_SUBJECT,"From emulator");
            intent.putExtra(intent.EXTRA_TEXT,"my first test mail");
            intent.setType("message/rfc822");
            chooser=Intent.createChooser(intent, "Email apps");
            startActivity(chooser);
        }
        if(view.getId()==R.id.play){
            intent=new Intent(Intent.ACTION_VIEW);
            Intent setData = intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=gov.nasa"));
            chooser=Intent.createChooser(intent, "google play");
            startActivity(chooser);
        }




    }
}