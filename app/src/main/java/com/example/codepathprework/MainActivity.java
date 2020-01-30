package com.example.codepathprework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorAccent));
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.mainView).setBackground(
                        getResources().getDrawable(R.drawable.hacker));
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //grab the text the user inputted
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();

                if(TextUtils.isEmpty(newText)){
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Divine!");

                }else {
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }
                //put the text into our text view once the 'change text' button is clicked


            }
        });

        findViewById(R.id.mainView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset the text color back to original
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorPrimary));
                //reset the background color to original
                findViewById(R.id.mainView).setBackground(
                        getResources().getDrawable(R.drawable.forest));
                //reset the text back to original
                ((TextView) findViewById(R.id.textView)).setText("Hello from Divine!");
            }
        });

        //grab the text the user inputted
        //put the text into our text view once the 'change text' button is clicked
    }
}
