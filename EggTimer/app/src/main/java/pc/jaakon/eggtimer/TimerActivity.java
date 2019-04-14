package pc.jaakon.eggtimer;

import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TimerActivity extends AppCompatActivity {

    private TextView textView;
    private static int TIME_OUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        String timer = getIntent().getStringExtra("timer");
        int time = Integer.parseInt(timer) * 1000;

        textView = findViewById(R.id.timeReciever);


        new CountDownTimer(time, 1000){
            public void onTick(long millisUntilFinished) {
                textView.setText(String.valueOf(millisUntilFinished / 1000 + 1));
            }

            public void onFinish() {
                textView.setText("Finished");
                Uri notify = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                Ringtone sound = RingtoneManager.getRingtone(getApplicationContext(), notify);
                sound.play();
                delayedNavigation();
            }
        }.start();
    }

    public void delayedNavigation() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Intent i = new Intent(TimerActivity.this, MainActivity.class);
        startActivity(i);
    }
}
