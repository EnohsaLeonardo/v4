package com.example.leonardoperez.v3;


/**
 * Created by Leonardo.Perez on 28/07/2015.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        final EditText txtUserName = (EditText) findViewById(R.id.txtUsername);
        final EditText txtPassword = (EditText) findViewById(R.id.txtPassword);
        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new OnClickListener() {
            int count = 0;
            @Override
            public void onClick(View v) {
                String username = txtUserName.getText().toString();
                String password = txtPassword.getText().toString();

                try {
                    String u = txtUserName.getText().toString();
                    String p = txtPassword.getText().toString();
                    String a0="ad";
                    String p0="ad";
                    String a1="a1";
                    String p1="a1";
                    String a2="a2";
                    String p2="a2";
                    String a3="a3";
                    String p3="a3";
                    String a4="a4";
                    String p4="a4";

                    if ((username.length() > 0 && password.length() > 0) && (u.equals(a0) && (p.equals(p0)))){
                        Toast.makeText(getApplicationContext(), "Bienvenido " + username, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(loginActivity.this, Menuprincipal.class);
                        intent.putExtra("parametro", "string");
                        startActivity(intent);
                        return;}
                    if ((username.length() > 0 && password.length() > 0) && (u.equals(a1) && (p.equals(p1)))){
                        Toast.makeText(getApplicationContext(), "Bienvenido " + username, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(loginActivity.this, Menu_Usuario_Uno.class);
                        startActivity(intent);
                        return;}
                    if ((username.length() > 0 && password.length() > 0) && (u.equals(a2) && (p.equals(p2)))){
                        Toast.makeText(getApplicationContext(), "Bienvenido " + username, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(loginActivity.this, Menu_Usuario_dos.class);
                        startActivity(intent);
                        return;}
                    if ((username.length() > 0 && password.length() > 0) && (u.equals(a3) && (p.equals(p3)) )) {
                        Toast.makeText(getApplicationContext(), "Bienvenido " + username, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(loginActivity.this, Menu_Usuario_tres.class);
                        startActivity(intent);
                        return;}
                    if ((username.length() > 0 && password.length() > 0) && (u.equals(a4) && (p.equals(p4)) )) {
                        Toast.makeText(getApplicationContext(), "Bienvenido " + username, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(loginActivity.this, Menu_Usuario_Cuatro.class);
                        startActivity(intent);
                        return;} count++;
                    if  ((u != (a1) || p != (a2) ) || (u != (a1) && p != (a2) ))Toast.makeText(getApplicationContext(),
                            "User/Password incorrecto" , Toast.LENGTH_SHORT).show();
                    if (((1) < count)) {Toast.makeText(getApplicationContext(), +count + " intentos",
                            Toast.LENGTH_SHORT).show();}
                    if (((4) == count)) {Toast.makeText(getApplicationContext(),
                                "Demasiados intentos, verifique los datos e intente mas tarde", Toast.LENGTH_SHORT).show();
                        finish();}}catch(Exception e){
                    Toast.makeText(loginActivity.this,(e.getMessage ())+"Error inesperado!!!!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}