package com.example.alton.eselab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
    TextView r;
    Button b,b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.editText);
        e2=(EditText) findViewById(R.id.editText2);
        b=(Button) findViewById(R.id.button);
        r=(TextView) findViewById(R.id.textView2);
        b1=(Button) findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1=e1.getText().toString();
                String n2=e2.getText().toString();
                int one=Integer.parseInt(n1);
                int two=Integer.parseInt(n2);
                r.setText(Math.pow(one,two)+"");
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1=e1.getText().toString();
                String n2=e2.getText().toString();
                int one=Integer.parseInt(n1);
                int two=Integer.parseInt(n2);
                Log.i("Number 1:",n1);
                Log.i("Number 2:",n2);
                Log.i("Number 1:",one+"");
                Log.i("Number 2:",two+"");
                StringBuffer s=new StringBuffer();
                s.append("No. \tSquares\t Cubes\n");
                for(int i=one;i<=two;i=i+1)
                {
                    s.append(i+"\t"+(i*i)+"\t"+(i*i*i)+"\n");
                    Log.i("Result:",s.toString());
                }
                r.setText(s);

            }
        });
    }
}
