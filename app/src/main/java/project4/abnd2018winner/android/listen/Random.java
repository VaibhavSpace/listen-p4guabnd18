package project4.abnd2018winner.android.listen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Random extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        // Find the View that shows each category
        TextView random_one = findViewById(R.id.random_1);
        TextView randome_two = findViewById(R.id.random_2);

        if (random_one != null) {
            // Set a click listener on that View
            random_one.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link NowPlaying}
                    Intent playlistIntent = new Intent(Random.this, NowPlaying.class);
                    // Start the new activity
                    startActivity(playlistIntent);
                }
            });
        }

        if (randome_two != null) {
            // Set a click listener on that View
            randome_two.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link NowPlaying}
                    Intent playlistIntent = new Intent(Random.this, NowPlaying.class);
                    // Start the new activity
                    startActivity(playlistIntent);
                }
            });
        }
    }
}
