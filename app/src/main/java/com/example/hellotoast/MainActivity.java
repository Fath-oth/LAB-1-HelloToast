package com.example.hellotoast;

import android.os.Bundle;import android.widget.Button;import android.widget.TextView;import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;import com.example.hellotoast.R;
public class MainActivity extends AppCompatActivity {


    private int count = 0;


    private TextView textCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textCount = findViewById(R.id.textcounter);
        Button buttonToast = findViewById(R.id.buttontoast7);

        Button buttonCount = findViewById(R.id.buttoncount7);


        buttonToast.setOnClickListener(v -> {
            Toast.makeText(this, "Bonjour !", Toast.LENGTH_SHORT).show();
        });

        buttonCount.setOnClickListener(v -> {
            count++;
            textCount.setText(String.valueOf(count));
        });
    }
}