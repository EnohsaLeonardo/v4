package com.example.leonardoperez.v3;

/**
 * Created by Leonardo.Perez on 31/07/2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(Splash.this, loginActivity.class);
                    intent.putExtra("parametro", "string");
                    startActivity(intent);

                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

}