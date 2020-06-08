package com.example.emailverification;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegistrationActivity extends AppCompatActivity {
    TextInputEditText regEmailText,regPassText,regNameText;
    Button regBtn;
    ProgressBar progressBar;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
       regEmailText=findViewById(R.id.reg_email);
        regPassText=findViewById(R.id.reg_pass);
        regNameText=findViewById(R.id.reg_confpass);
        regBtn=findViewById(R.id.reg_btn);
        progressBar=findViewById(R.id.login_progressbar);
        mAuth=FirebaseAuth.getInstance();
        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=regEmailText.getText().toString();
                String pass=regPassText.getText().toString();
                String name=regNameText.getText().toString();

                if(!TextUtils.isEmpty(email) && !TextUtils.isEmpty(pass) && !TextUtils.isEmpty(name)){
                    progressBar.setVisibility(View.VISIBLE);
                    mAuth.createUserWithEmailAndPassword(email, pass)
                            .addOnCompleteListener(RegistrationActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        FirebaseUser user = mAuth.getCurrentUser();
                                        sendToMain();
                                    } else {
                                        Toast.makeText(RegistrationActivity.this, "Authentication failed.",
                                                Toast.LENGTH_SHORT).show();

                                    }

                                    // ...
                                }
                            });
    }
} });}@Override
            protected void onStart() {
                super.onStart();
                FirebaseUser currentUser=mAuth.getCurrentUser();
                if(currentUser!=null){
                    sendToMain();
                }
            }
            public void sendToMain(){
                Intent intent=new Intent(RegistrationActivity.this,Main2Activity.class);
                startActivity(intent);
                finish();
            }
}
            //mvp,dagger view
