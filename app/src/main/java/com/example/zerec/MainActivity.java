package com.example.zerec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button addButton;
    private Button modifyButton;
    private Button deleteButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        addButton = findViewById(R.id.addButton);
        modifyButton = findViewById(R.id.modifyButton);
        deleteButton = findViewById(R.id.deleteButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openAddActivity();
            }
        });
        modifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openModifyActivity();
            }
        });
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openDeleteActivity();
            }
        });

    }

   public void openAddActivity(){
       Intent intent = new Intent(this , AddActivity.class);
       startActivity(intent);
   }
    public void openModifyActivity(){
        Intent intent = new Intent(this , ModifyActivity.class);
        startActivity(intent);
    }
    public void openDeleteActivity(){
        Intent intent = new Intent(this , DeleteActivity.class);
        startActivity(intent);
    }



}
