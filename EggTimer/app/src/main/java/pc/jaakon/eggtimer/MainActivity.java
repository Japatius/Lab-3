package pc.jaakon.eggtimer;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView input;
    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.timeInput);
        btnStart = findViewById(R.id.startBtn);


        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String time = input.getText().toString();
                if (time.length() == 0) {
                    Toast.makeText(MainActivity.this, "Please enter time!", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, TimerActivity.class);
                    intent.putExtra("timer", time);
                    startActivity(intent);
                }
            }
        });


    }
}
