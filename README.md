# LoginWithVaidation

# :heart: *MainActivity.java*
```java
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
```
# :heart: *main_activity.xml*
```xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Login"
        android:textSize="35dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.121" />

    <EditText
        android:id="@+id/txtusername"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="44dp"
        android:layout_marginEnd="8dp"
        android:layout_marginLeft="8dp"
        android:layout_marginRight="8dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:ems="10"
        android:hint="User Name"
        android:inputType="textPersonName"
        app:layout_constraintBottom_toTopOf="@+id/txtpassword"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.503"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView" />

    <EditText
        android:id="@+id/txtpassword"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="8dp"
        android:layout_marginLeft="8dp"
        android:layout_marginRight="8dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="208dp"
        android:ems="10"
        android:hint="Password"
        android:inputType="textPassword"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.503"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/btnlogin"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="168dp"
        android:layout_marginEnd="8dp"
        android:layout_marginLeft="8dp"
        android:layout_marginRight="8dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:text="Login"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/txtpassword" />

</android.support.constraint.ConstraintLayout>
```
