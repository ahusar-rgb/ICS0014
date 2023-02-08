package com.example.musicservice.movie;

import lombok.Data;

@Data
public class MovieRecord {
    private final String name;
    private final MovieGenre genre;
    private final Director director;
}
