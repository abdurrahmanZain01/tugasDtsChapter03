package polinema.ac.id.dtschapter03_starter.MainPage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import polinema.ac.id.dtschapter03_starter.R;

public class WelcomeBack extends AppCompatActivity {

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_back);

        login = findViewById(R.id.login1);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WelcomeBack.this, MainPageActivity.class));
            }
        });
    }

    public void forgotPassword(View view){
        startActivity(new Intent(WelcomeBack.this, ForgotPassword.class));
    }
}