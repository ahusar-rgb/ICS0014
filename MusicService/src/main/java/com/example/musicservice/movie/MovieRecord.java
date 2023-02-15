package com.example.musicservice.movie;

import com.example.musicservice.Record;
import lombok.Data;

@Data
public class MovieRecord implements Record {
    private final String name;
    private final MovieGenre genre;
    private final Director director;

    @Override
    public void play() {
        System.out.println("Playing movie record: " + this);
    }

    @Override
    public void play(int start, int end) {
        System.out.println("Playing movie record from " + start + " to " + end + ": " + this);
    }
}
