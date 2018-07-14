package com.example.abhi.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bmin,bdiv,bmul,bequal;

    float mValueOne , mValueTwo ;

    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;
    TextView t1,operator,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b0=(Button)findViewById(R.id.button10);
        badd=(Button)findViewById(R.id.button11);
        bmin=(Button)findViewById(R.id.button12);
        bdiv=(Button)findViewById(R.id.button13);
        bmul=(Button)findViewById(R.id.button14);
        bequal=(Button)findViewById(R.id.button15);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"0");
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1==null){
                    t1.setText("");
                }else{
                    mValueOne =Float.parseFloat(t1.getText()+"");
                    mAddition=true;
                    t1.setText(null);
                }
            }
        });

        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne=Float.parseFloat(t1.getText()+"");
                mSubtract=true;
                t1.setText(null);
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne=Float.parseFloat(t1.getText()+"");
                mMultiplication=true;
                t1.setText(null);
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(t1.getText()+"");
                mDivision=true;
                t1.setText(null);
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo=Float.parseFloat(t1.getText()+"");

                if(mAddition==true){
                    t1.setText(mValueOne+mValueTwo+"");
                    mAddition=false;
                }
                if(mSubtract==true){
                    t1.setText(mValueOne-mValueTwo+"");
                    mSubtract=false;
                }
                if(mMultiplication==true){
                    t1.setText(mValueOne*mValueTwo+"");
                    mSubtract=false;
                }
                if(mDivision==true){
                    t1.setText(mValueOne/mValueTwo+"");
                }
            }
        });
    }
}
