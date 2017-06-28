package id.dekz.mylayoutapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.tapadoo.alerter.Alerter;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button login;

    String validUsername = "adiandrea";
    String validPassword = "qwerty123";

    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("lifecycle", "onCreate");
        preferences = PreferenceManager.getDefaultSharedPreferences(this);

        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.etPassword);
        login    = (Button) findViewById(R.id.btnLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate();
            }
        });

        if(preferences.getBoolean("isLoggedIn", false)){
            Intent dashboard = new Intent(getApplicationContext(), DashboardActivity.class);
            startActivity(dashboard);
            MainActivity.this.finish();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle", "onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    private void validate(){
        String inputedUsername = username.getText().toString();
        String inputedPassword = password.getText().toString();

        if(inputedUsername.equals(validUsername)
                && inputedPassword.equals(validPassword)){
            preferences.edit().putBoolean("isLoggedIn", true).apply();
            Intent dashboard = new Intent(getApplicationContext(), DashboardActivity.class);
            startActivity(dashboard);
            MainActivity.this.finish();
            /*Toast.makeText(this, "login sukses", Toast.LENGTH_SHORT).show();*/
        }else{
            Alerter.create(this)
                    .setTitle("Login Failure")
                    .setText("Wrong Credentials")
                    .show();
        }
    }
}
