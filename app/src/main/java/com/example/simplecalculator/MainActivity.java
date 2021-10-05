package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.widget.Button;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private enum Operator {none,add,minus,multiply,divide}
    private double data1 = 0, data2 = 0;
    private Operator optr = Operator.none;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_00Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"0");
    }

    public void btn_01Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"1");
    }

    public void btn_02Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"2");
    }

    public void btn_03Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"3");
    }

    public void btn_04Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"4");
    }

    public void btn_05Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"5");
    }

    public void btn_06Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"6");
    }

    public void btn_07Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"7");
    }

    public void btn_08Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"8");
    }

    public void btn_09Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"9");
    }

    public void btn_AddClick(View view) {
        optr = Operator.add;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btn_MinusClick(View view) {
        optr = Operator.minus;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btn_MultiplyClick(View view) {
        optr = Operator.multiply;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btn_DivideClick(View view) {
        optr = Operator.divide;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btn_ClearClick(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText("");
    }

    public void btn_DotClick(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+".");
    }

    public void onClickNumericalButton(View view) {

        int pressID = view.getId();

        TextView curText = (TextView)findViewById(R.id.resultEdit);

        switch (pressID) {
            case R.id.btn00:
                curText.setText(curText.getText()+"0");
                break;
            case R.id.btn01:
                curText.setText(curText.getText()+"1");
                break;
            case R.id.btn02:
                curText.setText(curText.getText()+"2");
                break;
            case R.id.btn03:
                curText.setText(curText.getText()+"3");
                break;
            case R.id.btn04:
                curText.setText(curText.getText()+"4");
                break;
            case R.id.btn05:
                curText.setText(curText.getText()+"5");
                break;
            case R.id.btn06:
                curText.setText(curText.getText()+"6");
                break;
            case R.id.btn07:
                curText.setText(curText.getText()+"7");
                break;
            case R.id.btn08:
                curText.setText(curText.getText()+"8");
                break;
            case R.id.btn09:
                curText.setText(curText.getText()+"9");
                break;
            case R.id.btnDot:
                curText.setText(curText.getText()+".");
                break;
            default:
                curText.setText("ERROR");
                Log.d("Error","Error: Unknown Button Pressed!");
                break;

        }
    }

    public void btn_EqualClick(View view) {
        if (optr != Operator.none) {
            EditText eText = (EditText) findViewById(R.id.resultEdit);
            data2 = Double.parseDouble(eText.getText().toString());
            double result = 0;
            if (optr == Operator.add) {
                result = data1+data2;
            }
            else if (optr == Operator.minus) {
                result = data1-data2;
            }
            else if (optr == Operator.multiply){
                result = data1*data2;
            }
            else if (optr == Operator.divide){
                result = data1/data2;
            }
            optr = Operator.none;
            data1 = result;
            if((result-(int)result)!= 0)
                eText.setText(String.valueOf(result));
            else
                eText.setText(String.valueOf((int)result));
        }
    }
}