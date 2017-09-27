package jp.ac.fjb.x15g020.androidtweettestapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText tweet_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tweet_text = (EditText)findViewById(R.id.tweet_text);

        findViewById(R.id.tweet_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("twitter://post?message=" + tweet_text.getText()));
                startActivity(intent);
            }
        });
    }

    }