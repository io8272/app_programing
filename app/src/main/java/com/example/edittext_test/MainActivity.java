package com.example.edittext_test;

import android.os.Bundle;
import android.view.View;
import android.widget.*; //import android.widget.Button; import android.widget.EditText; import android.widget.TextView; 다 들어감


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //에디트텍스트 eText
    //버튼 eButton
    //텍스트뷰 eTextView

    public EditText eText1;
    public EditText eText2;
    public EditText eText3;
    public Button eButton;
    public TextView eTextView1;

    public TextView eTextView2;

    public TextView eTextView3;



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

        eText1 = (EditText) findViewById(R.id.text);
        eText2 = (EditText) findViewById(R.id.textPassword);
        eText3 = (EditText) findViewById(R.id.phone);
        eButton = (Button) findViewById(R.id.sign);
        eTextView1 = (TextView) findViewById(R.id.id);
        eTextView2 = (TextView) findViewById(R.id.password);
        eTextView3 = (TextView) findViewById(R.id.phonenumber);

    }

    public void onClicked(View view) {
        String str1 = eText1.getText().toString();
        eTextView1.setText("아이디:" + str1);

        String str2 = eText2.getText().toString();
        eTextView2.setText("비밀번호:" + str2);

        String str3 = eText3.getText().toString();
        eTextView3.setText("전화번호:" + str3);

    }
}