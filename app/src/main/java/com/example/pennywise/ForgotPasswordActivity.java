package com.example.pennywise;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_confirm);

        Button resetPasswordButton = findViewById(R.id.button2);

        resetPasswordButton.setOnClickListener(v -> {
            Intent intent = new Intent(ForgotPasswordActivity.this, ForgotPasswordActivity.class);
            startActivity(intent);
        });
    }
}
