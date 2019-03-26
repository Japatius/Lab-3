package pc.jaakon.animal_sounds;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    ImageView imageButton1;
    ImageView imageButton2;
    ImageView imageButton3;
    ImageView imageButton4;
    ImageView imageButton5;
    ImageView imageButton6;
    ImageView imageButton7;
    ImageView imageButton8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayBeasts();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.animal_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.birds) {
            setContentView(R.layout.activity_second);
            displayBirbs();
        } else {
            setContentView(R.layout.activity_main);
            displayBeasts();
        }

        return true;
    }
    void displayBirbs() {


        imageButton5 = (ImageView) findViewById(R.id.animal5);
        imageButton6 = (ImageView) findViewById(R.id.animal6);
        imageButton7 = (ImageView) findViewById(R.id.animal7);
        imageButton8 = (ImageView) findViewById(R.id.animal8);

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = mediaPlayer.create(MainActivity.this, R.raw.huuhkaja_norther_eagle_owl);
                mediaPlayer.start();
            }
        });

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = mediaPlayer.create(MainActivity.this, R.raw.peippo_chaffinch);
                mediaPlayer.start();
            }
        });

        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = mediaPlayer.create(MainActivity.this, R.raw.peukaloinen_wren);
                mediaPlayer.start();
            }
        });

        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = mediaPlayer.create(MainActivity.this, R.raw.punatulkku_northern_bullfinch);
                mediaPlayer.start();
            }
        });
    }

    void displayBeasts() {
        imageButton1 = (ImageView) findViewById(R.id.animal1);
        imageButton2 = (ImageView) findViewById(R.id.animal2);
        imageButton3 = (ImageView) findViewById(R.id.animal3);
        imageButton4 = (ImageView) findViewById(R.id.animal4);




        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = mediaPlayer.create(MainActivity.this, R.raw.bear);
                mediaPlayer.start();
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = mediaPlayer.create(MainActivity.this, R.raw.wolf);
                mediaPlayer.start();
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = mediaPlayer.create(MainActivity.this, R.raw.elephant);
                mediaPlayer.start();
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = mediaPlayer.create(MainActivity.this, R.raw.lamb);
                mediaPlayer.start();
            }
        });
    }
}
