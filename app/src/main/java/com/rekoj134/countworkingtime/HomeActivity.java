package com.rekoj134.countworkingtime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    Button btnProcess, btnConfig, btnReset;
    EditText etStart, etEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnProcess = findViewById(R.id.btnProcess);
        etStart = findViewById(R.id.etStart);
        etEnd = findViewById(R.id.etEnd);

        btnProcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                intent.putExtra("start", etStart.getText().toString());
                intent.putExtra("end", etEnd.getText().toString());
                startActivity(intent);
            }
        });

    }
}