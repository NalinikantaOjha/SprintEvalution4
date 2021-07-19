package com.example.sprint4evalution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button mBtnLogin;
    private EditText etEmail;
    private EditText etPassword;
    private ImageView Imchekbox;
    private String email_validation="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isEmailValid=isEmailValid();
                boolean isPasswordValid=isPasswordValid();
                if (isEmailValid&&isPasswordValid){
                    Intent intent=new Intent(MainActivity.this,HomeScreenActivity.class);
                    startActivity(intent);
                }
            }
        });

    }

    private void initView() {
        mBtnLogin=findViewById(R.id.mBtnLogin);
        etEmail=findViewById(R.id.etEmail);
        etPassword=findViewById(R.id.etPassword);
    }
    private boolean isEmailValid(){
        if(etEmail.getText().toString().matches(email_validation)){
            return true;
        }else {
            etEmail.setError("Invalid email");
            return false;
        }
    }
    private boolean isPasswordValid(){
        if (etPassword.getText().toString().length()>6){
            return true;
        }else {
            etPassword.setError("Invalid Password");
            return false;
        }
    }
}