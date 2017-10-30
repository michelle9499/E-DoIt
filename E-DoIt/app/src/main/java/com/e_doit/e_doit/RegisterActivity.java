package com.e_doit.e_doit;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //default activate employer button
        Button btn_employer = (Button) findViewById(R.id.btn_employer);
        if (btn_employer != null) {
            btn_employer.setActivated(true);
            btn_employer.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary));
        }
    }

    //OnClick employer button
    public void employer(View view) {
        Button btn_employer = (Button) findViewById(R.id.btn_employer);
        Button btn_guest = (Button) findViewById(R.id.btn_guest);

        if (btn_employer != null) {
            //activated employer button
            btn_employer.setActivated(true);

            if (btn_guest != null) {
                if (btn_employer.isActivated()) {
                    //change employer button to activate color
                    btn_employer.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary));
                    //deactivated guest button
                    btn_guest.setActivated(false);
                    //change guest button to deactivate color
                    btn_guest.setBackgroundColor(ContextCompat.getColor(this, R.color.grey));
                }
            }
        }
    }

    //OnClick guest button
    public void guest(View view) {
        Button btn_employer = (Button) findViewById(R.id.btn_employer);
        Button btn_guest = (Button) findViewById(R.id.btn_guest);

        if (btn_guest != null) {
            //activated guest button
            btn_guest.setActivated(true);

            if (btn_employer != null) {
                if (btn_guest.isActivated()) {
                    //change guest button to activate color
                    btn_guest.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary));
                    //deactivated employer button
                    btn_employer.setActivated(false);
                    //change employer button to deactivate color
                    btn_employer.setBackgroundColor(ContextCompat.getColor(this, R.color.grey));
                }
            }
        }
    }

    // Called when the user taps the Login button
    public void signup(View view) {
        Intent intent = new Intent(this, GuestProfileActivity.class);
        startActivity(intent);
    }
}
