package com.example.nutrimate;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_screen);

        findViewById(R.id.my_profile).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this, EditProfileActivity.class));
            }
        });

        findViewById(R.id.upgrade_premium).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProfileActivity.this, "Coming Soon! We are working on this.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
