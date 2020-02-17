package com.example.valentineapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    final String PASSWORD = "0214";
    Button loginButton;
    EditText field1, field2, field3, field4;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginButton);
        field1 = findViewById(R.id.field1);
        field2 = findViewById(R.id.field2);
        field3 = findViewById(R.id.field3);
        field4 = findViewById(R.id.field4);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = field1.getText().toString() + field2.getText().toString() +
                        field3.getText().toString() + field4.getText().toString();

                if(input.equals(PASSWORD)){
                    Intent intent = new Intent(getApplicationContext(),MenuPage.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
