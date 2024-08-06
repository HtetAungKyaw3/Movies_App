package it.kyaw.moviesapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import it.kyaw.moviesapp.R;

public class LoginActivity extends AppCompatActivity {

    private EditText editUsernmae,editPassword;
    private Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        initView();
    }

    private void initView() {
        editUsernmae = findViewById(R.id.editUsername);
        editPassword = findViewById(R.id.editPassword);
        loginbtn = findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editUsernmae.getText().toString().isEmpty() || editPassword.getText().toString().isEmpty()) {
                    Toast.makeText(LoginActivity.this,"Please Fill Your Username and Password" ,Toast.LENGTH_SHORT).show();

                }else if(editUsernmae.getText().toString().equals("H") && editPassword.getText().toString().equals("1")){
                    startActivities(new Intent[]{new Intent(LoginActivity.this, MainActivity.class)});
                }else{
                    Toast.makeText(LoginActivity.this," Your Username and Password is not correct" ,Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}