package com.example.activitiesandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * SecondActivity defines the second activity in the app. It is
 * launched from an intent with a message, and sends an intent
 * back with a second message.
 */

public class Activity_second<mReply> extends AppCompatActivity {

    //unique tag for the intent reply.

    public static final String EXTRA_REPLY = "com.example.android.activitiesandintents.extra.REPLY";

    //edit text for the reply.

    private EditText mReply;

    public Activity_second(EditText mReply) {
        this.mReply = mReply;
    }

    /**
     * Initializes the activity.
     *
     * @param savedInstanceState The current state data
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    //initialising new variable
    mReply =findViewById(R.id.EditText_second);

    //get the intent that launched this activity, and the message in.
    //the intent extra.

    Intent intent = getIntent();
    String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
    //put that message into the text_message TextView
    TextView textView = findViewById(R.id.text_message);
    textView.setText(text_message);

    /**
     *Handles the onClick for the "Reply" button. Gets the message from the
     * second EditText, creates an intent, and returns that message back to
     * the main activity
     * @param view The view (Button) that was clicked.
     */

      public void return_reply(View view) {
          //Get the reply message from the edit text
          String reply = mReply.getText().toString();

          //create a new intent for reply, add the reply message to it
          //as and extra, set the intent result, and close the ativity.
          Intent replyIntent = new Intent();
          replyIntent.putExtra(EXTRA_REPLY, reply);
          setResult(RESULT_OK, replyIntent);
          finish();
      }

}
