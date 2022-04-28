package edu.upeu.dam.s3_smsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSMS=findViewById(R.id.btnSMS);

        btnSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numberPhone="961786286",message="This is a sms example";
                SmsManager sms=SmsManager.getDefault();
                sms.sendTextMessage(numberPhone,null,message,null,null);
                Toast.makeText(MainActivity.this, "Message Sent Successfully", Toast.LENGTH_SHORT).show();

            }
        });

    }
}