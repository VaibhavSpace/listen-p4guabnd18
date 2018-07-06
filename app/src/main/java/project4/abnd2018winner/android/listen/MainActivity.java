package project4.abnd2018winner.android.listen;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows each category
        Button discover = findViewById(R.id.discover_button);
        Button playlist = findViewById(R.id.playlist_button);
        Button random = findViewById(R.id.random_button);

        if (discover != null) {
            // Set a click listener on that View
            discover.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the artists button View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link Discover}
                    Intent discoverIntent = new Intent(MainActivity.this, Discover.class);
                    // Start the new activity
                    startActivity(discoverIntent);
                }
            });
        }

        if (playlist != null) {
            // Set a click listener on that View
            playlist.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the artists button View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link Discover}
                    Intent artistsIntent = new Intent(MainActivity.this, Playlist.class);
                    // Start the new activity
                    startActivity(artistsIntent);
                }
            });
        }

        if (random != null) {
            // Set a click listener on that View
            random.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the artists button View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link Discover}
                    Intent podcastsIntent = new Intent(MainActivity.this, Random.class);
                    // Start the new activity
                    startActivity(podcastsIntent);
                }
            });
        }

    }
}