package com.example.portfolioproject;

import android.os.Bundle; import android.view.View; import android.widget.Button; import android.widget.EditText; import android.widget.Toast; import androidx.appcompat.app.AppCompatActivity;
public class ContactActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        final EditText etContactMessage = findViewById(R.id.etContactMessage);
        Button btnSendMessage = findViewById(R.id.btnSendMessage);
        btnSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = etContactMessage.getText().toString();
                Toast.makeText(ContactActivity.this, "Sent: " + msg, Toast.LENGTH_SHORT).show();
}         });
}
}