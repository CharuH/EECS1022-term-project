package com.example.termproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText password;
    private Button login;
    private String passcode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        password=(EditText)findViewById(R.id.password);
        login=(Button) findViewById(R.id.login);
        passcode="default";

    }
    public void validate(View view){
        String pass=password.getText().toString();
        if(pass.equals(passcode)){
            Intent intent = new Intent(this,main.class);
            startActivity(intent);
        }else {Toast.makeText(this,"Password Incorrect",Toast.LENGTH_SHORT).show();}
    }
}