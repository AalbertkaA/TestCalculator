package com.itproger.helloworldjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double a,b = 0;
    Integer IG = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onTestClick(View view){
        Button zero = (Button) findViewById(R.id.button0);
        Button one = (Button) findViewById(R.id.button1);
        Button two = (Button) findViewById(R.id.button2);
        Button three = (Button) findViewById(R.id.button3);
        Button four = (Button) findViewById(R.id.button4);
        Button five = (Button) findViewById(R.id.button5);
        Button six = (Button) findViewById(R.id.button6);
        Button seven = (Button) findViewById(R.id.button7);
        Button eight = (Button) findViewById(R.id.button8);
        Button nine = (Button) findViewById(R.id.button9);

        Button dot = (Button) findViewById(R.id.dot);

        Button clear = (Button) findViewById(R.id.clear);

        TextView out = (TextView) findViewById(R.id.output);

        zero.setOnClickListener(v -> {
            out.setText(out.getText()+"0");
        });

        one.setOnClickListener(v -> {
            out.setText(out.getText()+"1");
        });

        two.setOnClickListener(v -> {
            out.setText(out.getText()+"2");
        });

        three.setOnClickListener(v -> {
            out.setText(out.getText()+"3");
        });

        four.setOnClickListener(v -> {
            out.setText(out.getText()+"4");
        });

        five.setOnClickListener(v -> {
            out.setText(out.getText()+"5");
        });

        six.setOnClickListener(v -> {
            out.setText(out.getText()+"6");
        });

        seven.setOnClickListener(v -> {
            out.setText(out.getText()+"7");
        });

        eight.setOnClickListener(v -> {
            out.setText(out.getText()+"8");
        });

        nine.setOnClickListener(v -> {
            out.setText(out.getText()+"9");
        });

        dot.setOnClickListener(v -> {
            out.setText(out.getText()+".");
        });

        clear.setOnClickListener(v -> {
            out.setText("0");
            a = 0;
            b = 0;
        });


        switch (view.getId()){
            case R.id.plus:

                a = Double.valueOf(String.valueOf(out.getText()));
                out.setText("");
                IG = 0;
                break;
            case R.id.minus:
                a = Double.valueOf(String.valueOf(out.getText()));
                out.setText("");
                IG = 1;
                break;

            case R.id.umn:
                a = Double.valueOf(String.valueOf(out.getText()));
                out.setText("");
                IG = 2;
                break;

            case R.id.del:
                a = Double.valueOf(String.valueOf(out.getText()));
                out.setText("");
                IG = 3;
                break;

            case R.id.ravno:
                b = Double.valueOf(String.valueOf(out.getText()));
                if (IG==0) {
                    out.setText(String.valueOf(a+b));
                    break;
                }
                else if (IG==1) {
                    out.setText(String.valueOf(a-b));
                    break;
                }
                else if (IG==2) {
                    out.setText(String.valueOf(a*b));
                    break;
                }
                else if (IG==3) {
                    if (b==0) out.setText("Чи шо ебобо?");
                    else out.setText(String.valueOf(a/b));
                    break;
                }
                break;
        }
    }
}