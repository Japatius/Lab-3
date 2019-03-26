package pc.jaakon.menuprac;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView colorText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorText = (TextView) findViewById(R.id.clr_view);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.color_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.clr_red){
            colorText.setBackgroundColor(Color.RED);
            colorText.setText("Red!");
        } else if (item.getItemId() == R.id.clr_green) {
            colorText.setBackgroundColor(Color.GREEN);
            colorText.setText("Green!");
        } else if (item.getItemId() == R.id.clr_blue) {
            colorText.setBackgroundColor(Color.BLUE);
            colorText.setText("Blue!");
        } else if (item.getItemId() == R.id.clr_yellow) {
            colorText.setBackgroundColor(Color.YELLOW);
            colorText.setText("Yellow!");
        }

        return true;
    }
}
