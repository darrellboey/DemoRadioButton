package com.example.a15056233.demoradiobutton;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the RadioGroup object
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);

                // Get the ID of the selected radio button in the radioGroup
                int selectedButtonId = rg.getCheckedRadioButtonId();

                //Get the radio button object from the ID we had gotten above
                RadioButton rb = (RadioButton) findViewById(selectedButtonId);

                // show a toast that display the text on the selected radio button
                Toast.makeText(getBaseContext(), rb.getText(),Toast.LENGTH_LONG).show();
            }});
    }
}
