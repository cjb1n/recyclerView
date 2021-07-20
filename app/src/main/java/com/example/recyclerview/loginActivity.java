package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class loginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViewById(R.id.btn_login).setOnClickListener(onClickListener);
        findViewById(R.id.btn_password).setOnClickListener(onClickListener);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_login:
                    //                   login();
                    mystartactivity(MainActivity.class);
                    break;
            }
        }
    };

    //   private void login(){
    //       String email = ((EditText)findViewById(R.id.btn_email)).getText().toString();
    //       String password = ((EditText)findViewById(R.id.btn_password)).getText().toString();

// 로그인 조건 만들어야함


// }
    private  void  mystartactivity(Class c){
        Intent intent=new Intent(this,c);
        intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}