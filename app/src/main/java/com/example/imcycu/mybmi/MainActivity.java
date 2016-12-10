package com.example.imcycu.mybmi;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtx_height, edtx_weight;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtx_height = (EditText) findViewById(R.id.editText2);
        edtx_weight = (EditText) findViewById(R.id.editText);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float height = Float.parseFloat(edtx_height.getText().toString());
                float weight = Float.parseFloat(edtx_weight.getText().toString());
                float bmi = 0;

                height = height/100;

                bmi = weight/(height*height);

               // Toast.makeText(getApplicationContext(), String.valueOf(bmi), Toast.LENGTH_LONG).show();

                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("System Message")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("Your BMI is " + bmi)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        })
                        .setCancelable(false)
                        .show();


            }
        });
    }
}
