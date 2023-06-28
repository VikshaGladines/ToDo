package com.ipi.todo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button btnAdd;
    private Button btnCancel;
    private Button menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu = findViewById(R.id.AddTodo);
        btnAdd = findViewById(R.id.btnAdd);
        btnCancel = findViewById(R.id.btnCancel);


        menu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddTodoActivity.class);
                startActivityForResult(intent, 2);

            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        // créé le menu à partir de la ressource
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected ( MenuItem item){

        switch (item.getItemId()) {
            case R.id.AddTodo:

                Intent intent = new Intent(getApplicationContext(), AddTodoActivity.class);

                startActivityForResult(intent, 2);

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
}