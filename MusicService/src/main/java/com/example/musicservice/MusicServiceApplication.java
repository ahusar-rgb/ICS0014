package com.example.musicservice;

import com.example.musicservice.movie.Director;
import com.example.musicservice.movie.MovieGenre;
import com.example.musicservice.movie.MovieRecord;
import com.example.musicservice.music.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MusicServiceApplication {

	public static void main(String[] args) {
		Album newAlbum = new Album("New album");
		Record musicRecord = new MusicRecord(
				MusicGenre.POP,
				new Artist("Jackson"),
				newAlbum,
				List.of(
						new Song("Song 1", newAlbum),
						new Song("Song 2", newAlbum)
				)
		);

		Record movieRecord = new MovieRecord(
				"Movie record 1",
				MovieGenre.ACTION,
				new Director("Steven Spielberg")
		);

		musicRecord.play();
		movieRecord.play(1, 2);
		//SpringApplication.run(MusicServiceApplication.class, args);
	}

}
