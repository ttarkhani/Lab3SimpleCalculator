package com.example.lab3simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private enum Operator {none, add , minus, multiply, divide}
    private double data1 = 0, data2 = 0;
    private Operator optr = Operator.none;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void btnEQ(View view) {
        if (optr != Operator.none) {
            TextView eText = (TextView)findViewById(R.id.resultEdit);
            data2 = Double.parseDouble((eText.getText().toString()));
            double result = 0;
            if (optr == Operator.add) {
                result = data1 + data2;
            } else if (optr == Operator.minus) {
                result = data1 - data2;
            } else if (optr == Operator.multiply) {
                result = data1 * data2;
            } else if (optr == Operator.divide) {
                result = data1 / data2;
            }
            optr = Operator.none;
            data1 = result;
            if ((result - (int) result) != 0) {
                eText.setText(String.valueOf(result));
            } else {
                eText.setText(String.valueOf((int) result));
            }
        }
    }
    public void btn00(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "0");
    }
    public void btn01(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "1");
    }
    public void btn02(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "2");
    }
    public void btn03(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "3");
    }
    public void btn04(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "4");
    }
    public void btn05(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "5");
    }
    public void btn06(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "6");
    }
    public void btn07(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "7");
    }
    public void btn08(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "8");
    }
    public void btn09(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "9");
    }
    public void btnAdd(View view) {
        optr = Operator.add;
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText(" ");
    }
    public void btnSub(View view) {
        optr = Operator.minus;
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText(" ");
    }
    public void btnMult(View view) {
        optr = Operator.multiply;
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText(" ");
    }
    public void btnDiv(View view) {
        optr = Operator.divide;
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText(" ");
    }
    public void btnCE(View view) {
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(" ");
    }
    public void btnDot(View view) {
        TextView eText= (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + ".");
    }
}