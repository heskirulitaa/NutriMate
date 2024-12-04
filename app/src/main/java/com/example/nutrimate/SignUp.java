package com.example.nutrimate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    EditText namalengkap;
    EditText email;
    EditText password;
    EditText confirmpassword;
    Button signupbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_screen);

        namalengkap = findViewById(R.id.namalengkap);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        confirmpassword = findViewById(R.id.confirmpassword);
        signupbutton = findViewById(R.id.signupbutton);

        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pass = password.getText().toString();
                String confirmpass = confirmpassword.getText().toString();

                if (pass.equals(confirmpass)) {
                    Toast.makeText(SignUp.this, "Sign up successful!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(SignUp.this, "Sign up failed, password didn't match!", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

}
