package com.example.soumik.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button demo_button;
    private TextView check_box_text;
    private CheckBox check_box;
    private RadioButton radioButton;
    int count=0;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        demo_button=(Button) findViewById(R.id.demo_button);
        check_box_text=(TextView) findViewById(R.id.checkbox_text);
        check_box=(CheckBox) findViewById(R.id.checkbox);
        radioButton=(RadioButton) findViewById(R.id.radiobutton);
        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Radio button is clicked",Toast.LENGTH_SHORT).show();
            }
        });
        check_box.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_box_text.setText("checkbox is clicked");
            }
        });
        demo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Demo button is clicked "+(++count)+" times",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
