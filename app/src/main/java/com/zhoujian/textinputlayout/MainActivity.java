package com.zhoujian.textinputlayout;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    private TextInputEditText mText_phone;
    private TextInputEditText mText_password;
    private Button mLogin;
    private TextInputLayout mText_phone_layout;
    private TextInputLayout mText_password_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView()
    {
        mText_phone_layout = (TextInputLayout)findViewById(R.id.text_phone_layout);
        mText_password_layout = (TextInputLayout)findViewById(R.id.text_password_layout);

        mText_phone = (TextInputEditText)findViewById(R.id.text_phone);
        mText_password = (TextInputEditText)findViewById(R.id.text_password);

        mLogin = (Button)findViewById(R.id.login);

    }
}
