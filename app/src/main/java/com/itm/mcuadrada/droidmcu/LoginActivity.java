package com.itm.mcuadrada.droidmcu;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private TextInputEditText etUsername, etPassword;
    private TextInputLayout tilUsername, tilPassword;
    private CheckBox chkRemember;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (TextInputEditText) findViewById(R.id.etLoginUsername);
        etPassword = (TextInputEditText) findViewById(R.id.etLoginPassword);
        tilUsername = (TextInputLayout) findViewById(R.id.tilLoginUsername);
        tilPassword = (TextInputLayout) findViewById(R.id.tilLoginPassword);
        chkRemember = (CheckBox)findViewById(R.id.chkLoginRemember);
    }

    View.OnClickListener mListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnLoginSignIn:
                        if(isFormValidated()){
                            signIn();
                        }
                    break;
                case R.id.txvLoginSignUp:

                    break;
            }
        }
    };

    private boolean isFormValidated(){
        boolean isValidate = true;
        String username = etUsername.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        tilUsername.setErrorEnabled(false);
        tilPassword.setErrorEnabled(false);

        if(username.isEmpty()) {
            tilUsername.setError("Ingrese su usuario");
            isValidate = false;
        }
        if(password.isEmpty()){
            tilPassword.setError("Ingrese su contraseña");
            isValidate = false;
        }

        return isValidate;
    }

    private void signIn(){
        String username = etUsername.getText().toString().trim();
        String password = etPassword.getText().toString().trim();



    }
}
