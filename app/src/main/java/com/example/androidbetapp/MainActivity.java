package com.example.androidbetapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.androidbetapp.Utils.EmailValidator;

public class MainActivity extends AppCompatActivity {

    EditText txtuseremail, txtuserpassword;
    Button btnLogin;
    EmailValidator emailValidator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI() {
        txtuseremail = findViewById(R.id.txtuseremail);
        txtuserpassword = findViewById(R.id.txtpassword);
        btnLogin = findViewById(R.id.btnSignIn);

        emailValidator = new EmailValidator();
    }

    //Este método se activa cuando alguien da clic en el mensaje de crear una cuenta.
    //Parametros Intent (Donde se está ubicado/nombre de la actividad, actividad objetivo/a donde quiero ir)
    public void goCreateAccount (View view) {
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    public void goHome (View view) {
        if(EmailValidator.isValidEmail(txtuseremail.getText().toString())) {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        }
    }
}
