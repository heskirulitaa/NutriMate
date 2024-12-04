package com.example.nutrimate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LogIn extends AppCompatActivity {
    EditText emaillogin;
    EditText passwordlogin;
    Button loginbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        emaillogin = findViewById(R.id.emaillogin);
        passwordlogin = findViewById(R.id.passwordlogin);
        loginbutton = findViewById(R.id.loginbutton);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(LogIn.this, "Log In successful!", Toast.LENGTH_SHORT).show();

                // Masuk ke next activity
                Intent intent = new Intent(LogIn.this, HomeActivity.class);
                startActivity(intent);
            }
        });


    }
}
