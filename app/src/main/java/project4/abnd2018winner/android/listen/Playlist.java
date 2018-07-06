package project4.abnd2018winner.android.listen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        // Find the View that shows each category
        TextView adele = findViewById(R.id.adele);
        TextView avril = findViewById(R.id.avril);
        TextView anoushka = findViewById(R.id.anoushka);
        TextView dido = findViewById(R.id.dido);
        TextView lucky = findViewById(R.id.lucky);

        if (adele != null) {
            // Set a click listener on that View
            adele.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link NowPlaying}
                    Intent playlistIntent = new Intent(Playlist.this, NowPlaying.class);
                    // Start the new activity
                    startActivity(playlistIntent);
                }
            });
        }

        if (avril != null) {
            // Set a click listener on that View
            avril.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link NowPlaying}
                    Intent playlistIntent = new Intent(Playlist.this, NowPlaying.class);
                    // Start the new activity
                    startActivity(playlistIntent);
                }
            });
        }
        if (anoushka != null) {
            // Set a click listener on that View
            anoushka.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link NowPlaying}
                    Intent playlistIntent = new Intent(Playlist.this, NowPlaying.class);
                    // Start the new activity
                    startActivity(playlistIntent);
                }
            });
        }
        if (dido != null) {
            // Set a click listener on that View
            dido.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link NowPlaying}
                    Intent playlistIntent = new Intent(Playlist.this, NowPlaying.class);
                    // Start the new activity
                    startActivity(playlistIntent);
                }
            });
        }
        if (lucky != null) {
            // Set a click listener on that View
            lucky.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link NowPlaying}
                    Intent playlistIntent = new Intent(Playlist.this, NowPlaying.class);
                    // Start the new activity
                    startActivity(playlistIntent);
                }
            });
        }

    }
}
