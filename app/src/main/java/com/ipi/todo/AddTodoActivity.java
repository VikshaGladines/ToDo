package com.ipi.todo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.ipi.todo.pojos.Todo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTodoActivity extends AppCompatActivity {

    private EditText EditName;
    private Button btnAdd;


    @Override
    protected void onCreate(Bundle save
                              dInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_todo);


        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);

        Spinner spinner = (Spinner) findViewById(R.id.SpnUrgency);
        Button btnSpn = (Button) findViewById(R.id.btnSpn);


        String[] urgency = new String[]{
                "Low urgency",
                "Medium urgency",
                "High urgency"
        };


    final List<String> urgencyList = new ArrayList<>(Arrays.asList(urgency));

    final ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String> (this,R.layout.spinner_item,urgencyList);

        spinnerArrayAdapter.setDropDownViewResource(R.layout.spinner_item);
        spinner.setAdapter(spinnerArrayAdapter);

        btnAdd.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (EditName.getText().length() > 3){

                    Todo todo = new Todo(EditName.toString(), urgency.toString());

                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("todo", todo);
                    setResult(RESULT_OK, resultIntent);
                    finish();
                }
            }
        }));


    }


    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}