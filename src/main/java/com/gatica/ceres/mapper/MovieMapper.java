package com.gatica.ceres.mapper;

// ... Your Movie and MovieItem class definitions ...

import com.gatica.ceres.model.Movie;
import com.gatica.ceres.model.MovieItem;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class MovieMapper {

    public static MovieItem mapMovieToMovieItem(Movie movie, String user, List<String> friends) {
        return new MovieItem(
                user,
                movie.getTitle(),
                movie.getPoster(),
                friends,
                movie.getDirector(),
                movie.getYear(),
                movie.getRatings(),
                movie.getRuntime(),
                LocalDateTime.now(),
                movie.getGenre()
        );
    }
}
