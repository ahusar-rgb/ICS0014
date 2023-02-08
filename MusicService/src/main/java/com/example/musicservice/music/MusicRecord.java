package com.example.musicservice.music;

import lombok.Data;

import java.util.List;

@Data
public class MusicRecord {
    private final MusicGenre genre;
    private final Artist artist;
    private final Album album;
    private final List<Song> songList;
}
