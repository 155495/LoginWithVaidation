package com.example.bivin.loginvalidation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnlogin;
    EditText txtusername;
    EditText txtPassword;
    String uname="android";
    String Pswd="123";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin=findViewById(R.id.btnlogin);
        txtusername=findViewById(R.id.txtusername);
        txtPassword=findViewById(R.id.txtpassword);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(TextUtils.isEmpty(txtusername.getText())&& TextUtils.isEmpty(txtPassword.getText()) ){
                    txtusername.setError("Please Enter Username");
                    txtPassword.setError("Please Enter Password");
                    }
                    else if(TextUtils.isEmpty(txtusername.getText())){
                    txtusername.setError("Please Enter Username");
                    }
                    else if(TextUtils.isEmpty(txtPassword.getText())){
                    txtPassword.setError("Please Enter Password");
                    }
                    else {

                    String nm,ps;
                    nm=txtusername.getText().toString();
                    ps=txtPassword.getText().toString();

                    if(nm.equals(uname) &&  ps.equals(Pswd)){
                        Intent intent=new Intent(getApplicationContext(),LoginDisplayActivity.class);
                        startActivity(intent);

                    }
                    else {
                        Toast.makeText(getApplicationContext(),"Wrong Username or Password",Toast.LENGTH_LONG).show();
                    }
                }


            }
        });

    }
}
