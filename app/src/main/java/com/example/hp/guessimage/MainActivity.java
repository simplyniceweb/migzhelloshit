package com.example.hp.guessimage;

import android.support.v4.util.ArraySet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class MainActivity extends AppCompatActivity {


    private ImageView iv;
    private Button b1;
    private Button b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Map flags = new HashMap();
        flags.put("JP" , R.mipmap.flag_jp);
        flags.put("PH" , R.mipmap.flag_ph);
        flags.put("US" , R.mipmap.flag_us);

        iv = (ImageView) findViewById(R.id.imageView);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);

        final Random       random    = new Random();
        final List<String> keys      = new ArrayList<>(flags.keySet());
        String       randomKey = keys.get( random.nextInt(keys.size()) );
        Integer       value     = (Integer) flags.get(randomKey);

        b1.setText(randomKey);
        b2.setText("Jaylord");
        iv.setImageResource(value);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String       randomKeyClick = keys.get( random.nextInt(keys.size()) );
                Integer       valueClick     = (Integer) flags.get(randomKeyClick);

                b1.setText(randomKeyClick);
                b2.setText("Jaylord");
                iv.setImageResource(valueClick);
            }
        });


    }
}
