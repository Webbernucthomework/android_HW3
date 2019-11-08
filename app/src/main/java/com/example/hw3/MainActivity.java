package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText C;
    private TextView F;
    private Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            C = findViewById(R.id.editText);
            F = findViewById(R.id.textView5);
            bt1 = findViewById(R.id.button);


            bt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int ccc = Integer.parseInt(C.getText().toString());
                    double sum = ccc*(9/5)+32;

                    F.setText(String.valueOf(sum));


                }
            });





    }




}
