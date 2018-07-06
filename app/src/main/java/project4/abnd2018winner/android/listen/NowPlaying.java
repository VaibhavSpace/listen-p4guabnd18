package project4.abnd2018winner.android.listen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // List of songs using ArrayList
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Artist Name 1 \nSong Name 1");
        songs.add("Artist Name 2 \nSong Name 2");
        songs.add("Artist Name 3 \nSong Name 3");
        songs.add("Artist Name 4 \nSong Name 4");
        songs.add("Artist Name 5 \nSong Name 5");
        songs.add("Artist Name 6 \nSong Name 6");
        songs.add("Artist Name 7 \nSong Name 7");
        songs.add("Artist Name 8 \nSong Name 8");
        songs.add("Artist Name 9 \nSong Name 9");
        songs.add("Artist Name 10 \nSong Name 10");

        //Use of ArrayAdapter+ListView to display songs
        ArrayAdapter<String> songsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songs);

        ListView songList = findViewById(R.id.songs_list);

        songList.setAdapter(songsAdapter);
    }
}
