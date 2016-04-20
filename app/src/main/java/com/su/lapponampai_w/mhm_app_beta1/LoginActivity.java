package com.su.lapponampai_w.mhm_app_beta1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    MyManage myManage;

    //ปุ่มต่างๆจาก activity_login.xml
    Button buttonLogin;
    EditText editTextUser, editTextPassword;

    //ค่า String ของ editText
    String stringUser, stringPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        myManage = new MyManage(this);

        // เชื่อมปุ่มต่างๆ
        bindWidget();

        // เมื่อทำการกดปุ่ม buttonLogin
        Click_buttonLogin();


    } //Main Method

    private void Click_buttonLogin() {
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringUser = editTextUser.getText().toString();
                stringPassword = editTextPassword.getText().toString();

                if (stringUser.equals("") || stringPassword.equals("")) {
                    Toast t = Toast.makeText(LoginActivity.this, "มีค่าว่าง", Toast.LENGTH_SHORT);
                    t.show();
                }

            }
        });

    } //Click_buttonLogin Method

    private void bindWidget() {
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        editTextUser = (EditText) findViewById(R.id.editTextLoginUser);
        editTextPassword = (EditText) findViewById(R.id.editTextLoginPassword);
    } // bindWidget Method


}  //Main Class
