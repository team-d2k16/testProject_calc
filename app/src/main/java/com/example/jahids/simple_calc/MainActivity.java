package com.example.jahids.simple_calc;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String str="";
    char op;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        result=(TextView)findViewById(R.id.result);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    public void btn_1(View view)
    {
        str=str+'1';
        result.setText(str);
        //Toast.makeText(MainActivity.this, "button press 1", Toast.LENGTH_SHORT).show();
    }
    public void btn_2(View view)
    {
        str=str+'2';
        result.setText(str);
        //Toast.makeText(MainActivity.this, "button press 1", Toast.LENGTH_SHORT).show();
    }
    public void btn_3(View view)
    {
        str=str+'3';
        result.setText(str);
        //Toast.makeText(MainActivity.this,str, Toast.LENGTH_SHORT).show();
    }
    public void btn_4(View view)
    {
        str=str+'4';
        result.setText(str);
       // Toast.makeText(MainActivity.this, "button press 1", Toast.LENGTH_SHORT).show();
    }
    public void btn_5(View view)
    {
        str=str+'5';
        result.setText(str);
        //Toast.makeText(MainActivity.this, "button press 1", Toast.LENGTH_SHORT).show();
    }
    public void btn_6(View view)
    {
        str=str+'6';
        result.setText(str);
        //Toast.makeText(MainActivity.this, "button press 1", Toast.LENGTH_SHORT).show();
    }
    public void btn_7(View view)
    {
        str=str+'7';
        result.setText(str);
        //Toast.makeText(MainActivity.this, "button press 1", Toast.LENGTH_SHORT).show();
    }
    public void btn_8(View view)
    {
        str=str+'8';
        result.setText(str);
        //Toast.makeText(MainActivity.this, "button press 1", Toast.LENGTH_SHORT).show();
    }
    public void btn_9(View view)
    {
        str=str+'9';
        result.setText(str);
        //Toast.makeText(MainActivity.this, "button press 1", Toast.LENGTH_SHORT).show();
    }
    public void btn_0(View view)
    {
        str=str+'0';
        result.setText(str);
        //Toast.makeText(MainActivity.this, "button press 1", Toast.LENGTH_SHORT).show();
    }
    public void btn_dot(View view)
    {
        str=str+'.';
        result.setText(str);
        //Toast.makeText(MainActivity.this, "button press 1", Toast.LENGTH_SHORT).show();
    }
    public void btn_C(View view)
    {
        str="";
        result.setText(str);
        //Toast.makeText(MainActivity.this, "button press 1", Toast.LENGTH_SHORT).show();
    }
    public void btn_add(View view)
    {
        str=str+'+';
        result.setText(str);
        //Toast.makeText(MainActivity.this, "button press 1", Toast.LENGTH_SHORT).show();
    }
    public void btn_sub(View view)
    {
        str=str+'-';
        result.setText(str);
        //Toast.makeText(MainActivity.this, "button press 1", Toast.LENGTH_SHORT).show();
    }
    public void btn_equ(View view)
    {
        //str=str+'=';
        //result.setText(str);
        String num1="",num2="",r;
        float n1,n2,res;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='+'||str.charAt(i)=='-')
            {
                num1=str.substring(0,i);
                num2=str.substring(i+1,str.length());
                op=(char)str.charAt(i);
                break;
            }
        }
        n1= Float.parseFloat(num1);
        n2= Float.parseFloat(num2);
        if(op=='+')
        {
            res=n1+n2;
            r = Float.toString(res);
            result.setText(r);

        }
        if(op=='-')
        {
            res=n1-n2;
            r = Float.toString(res);
            result.setText(r);

        }
        //Toast.makeText(MainActivity.this, "button press 1", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("EXIT")
                .setMessage("Exit from Calculator?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("No", null)
                .show();
    }
}
