package id.dekz.mylayoutapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button login;

    String validUsername = "adiandrea";
    String validPassword = "qwerty123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.etPassword);
        login    = (Button) findViewById(R.id.btnLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate();
            }
        });
    }

    private void validate(){
        String inputedUsername = username.getText().toString();
        String inputedPassword = password.getText().toString();

        if(inputedUsername.equals(validUsername)
                && inputedPassword.equals(validPassword)){
            Toast.makeText(this, "login sukses", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "login gagal", Toast.LENGTH_SHORT).show();
        }
    }
}
