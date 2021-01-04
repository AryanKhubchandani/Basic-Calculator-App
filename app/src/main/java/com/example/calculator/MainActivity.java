package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edt1;
    private EditText edt2;
    private TextView tvresult;
    private Button btnadd, btnsub, btnmul, btndiv, btnres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        tvresult = (TextView) findViewById(R.id.tvresult);
    }

    public void btnadd(View view) {
        int n1 = Integer.parseInt(edt1.getText().toString());
        int n2 = Integer.parseInt(edt2.getText().toString());
        int res = n1 + n2;
        tvresult.setText(String.valueOf(res));
    }

    public void btnsub(View view) {
        int n1 = Integer.parseInt(edt1.getText().toString());
        int n2 = Integer.parseInt(edt2.getText().toString());
        int res = n1 - n2;
        tvresult.setText(String.valueOf(res));
    }

    public void btnmul(View view) {
        int n1 = Integer.parseInt(edt1.getText().toString());
        int n2 = Integer.parseInt(edt2.getText().toString());
        int res = n1 * n2;
        tvresult.setText(String.valueOf(res));
    }

    public void btndiv(View view) {
        int n1 = Integer.parseInt(edt1.getText().toString());
        int n2 = Integer.parseInt(edt2.getText().toString());
        if (n2 == 0) { 
            String res = "Not defined";
            tvresult.setText(res);

        }
        else{
            int res = n1 / n2;
            tvresult.setText(String.valueOf(res));
        }
    }

}