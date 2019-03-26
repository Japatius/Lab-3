package pc.jaakon.external_activities;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button sendButton;
    Button mapButton;
    Button callButton;
    String defLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.input_field);
        sendButton = (Button) findViewById(R.id.go_btn);
        mapButton = (Button) findViewById(R.id.map_btn);
        callButton = (Button) findViewById(R.id.call_btn);

        defLink = "http://";

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String page = editText.getText().toString();

                if (!TextUtils.isEmpty(page)) {
                    Uri uri = Uri.parse(defLink + page);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            }
        });

        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String oamkNr = "+358206110200";
                Uri uri = Uri.parse("tel:" + oamkNr);
                Intent callIntent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(callIntent);
            }
        });

        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri location = Uri.parse("geo:64.9995232,25.5116093?q=Kotkantie 1, Oulu, 90130");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                startActivity(mapIntent);
            }
        });
    }
}
