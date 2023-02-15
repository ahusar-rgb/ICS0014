package com.example.musicservice.music;

import com.example.musicservice.Record;
import lombok.Data;

import java.util.List;

@Data
public class MusicRecord implements Record {
    private final MusicGenre genre;
    private final Artist artist;
    private final Album album;
    private final List<Song> songList;

    @Override
    public void play() {
        System.out.println("Playing music record: " + this);
    }

    @Override
    public void play(int start, int end) {
        System.out.println("Playing music record from " + start + " to " + end + ": " + this);
    }
}
