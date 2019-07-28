package com.example.trabalhonrodolfo;


import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class depoisVejo2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depois_vejo2);
    }

    public void retornaTela(View v) {
        Intent intentBack = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intentBack);

    }

    public void entrarFalso(View v) {

        EditText email = (EditText) findViewById(R.id.emailID);
        String emailText = email.getText().toString();
        EditText senha = (EditText) findViewById(R.id.senhaID);
        String senhaText = senha.getText().toString();

        if (emailText == "easteregg@gmail.com" && senhaText == "password") {

            Intent entrarIntent = new Intent(getApplicationContext(), depoisVejo4.class);
            startActivity(entrarIntent);

        } else {

            AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
            builder.setTitle("ERRO");
            builder.setMessage("Usuário não cadastrado.");

            DialogInterface.OnClickListener OK = new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    onRestart();
                }
            };
            builder.setNegativeButton("OK" , OK);
            builder.create().show();

        }

    }

    public void forgotPas (View v){

        Intent intent = new Intent(getApplicationContext(), depoisVejo3.class);
        startActivity(intent);
    }
}

