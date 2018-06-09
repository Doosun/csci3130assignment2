package group4.csci3130.csci3130_assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void validatePasswordInput(View view) {

        EditText passwordTextView = findViewById(R.id.passwordText);
        String passwordText = passwordTextView.getText().toString();
        Validator password = new Validator(passwordText);
        int strongness = password.validatePassword();
        if (strongness >= 4) {
            TextView textView = findViewById(R.id.validationText);
            textView.setText("Strong");
        }
        else {
            TextView textView = findViewById(R.id.validationText);
            textView.setText("Not Strong");
        }
    }
}
