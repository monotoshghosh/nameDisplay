package com.example.namedispay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    public static final String Extra_Name="key"; // take key as UNIQUE so that it could not conflict

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void openActivity(View view){
        Toast.makeText(this, "Going to Second Screen", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        name=findViewById(R.id.name);
        String nameText=name.getText().toString();
        intent.putExtra(Extra_Name,nameText);
        startActivity(intent);
    }
}