package com.example.androidbetapp;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.androidbetapp.Utils.EmailValidator;

import java.util.Calendar;

public class CreateAccountActivity extends AppCompatActivity {

    TextInputEditText txtUserEmail, txtUserId, txtUserName, txtUserPhone,
                txtUserPassword, txtUserCard, txtUserPasswordConfirm;
    DatePicker dtUserBirthDate;
    RadioButton rdiMaleGender, rdiFemaleGender;

    Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        showToolbar(getResources().getString(R.string.toolbar_title_createaccount), true);
        initUI();

        txtUserEmail.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean isFocus) {
                if(isFocus) {
                    validarEmail(txtUserEmail.getText().toString());
                }
            }
        });
    }

    private void validarEmail(String userEmail) {
        if(EmailValidator.isValidEmail(userEmail)) {
            return;
        } else {
            Toast.makeText(this, "El Email no es válido", Toast.LENGTH_SHORT).show();
        }
    }

    private void initUI() {
        calendar = Calendar.getInstance();

        txtUserEmail = findViewById(R.id.email);
        txtUserId = findViewById(R.id.idUser);
        txtUserName = findViewById(R.id.name);
        txtUserPhone = findViewById(R.id.phone);
        txtUserPassword = findViewById(R.id.password_create_account);
        txtUserCard = findViewById(R.id.credit_card_number);
        txtUserPasswordConfirm = findViewById(R.id.confirmPassword);
        rdiMaleGender = findViewById(R.id.rdi_female_gender);
        rdiFemaleGender = findViewById(R.id.rdi_male_gender);

        dtUserBirthDate = findViewById(R.id.dateOfBirthInput);

    }

    public void showToolbar(String title, boolean upButton) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}
