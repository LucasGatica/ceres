package com.gatica.ceres.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;


@NoArgsConstructor
@Setter
@Getter
@Document
public class MovieItem {
    public MovieItem(String user, String movie, String poster,
                     List<String> friendsName,
                     String director, String year,
                     List<Rating> ratings, String runtime,
                     LocalDateTime dateWatched, String genre) {
        this.user = user;
        this.movie = movie;
        this.poster = poster;
        this.friendsName = friendsName;
        this.director = director;
        this.year = year;
        this.ratings = ratings;
        this.runtime = runtime;
        this.dateWatched = dateWatched;
        this.genre = genre;
    }

    @Id
    private String id;
    private String user;
    private String movie;
    private String poster;
    private List<String> friendsName;
    private String director;
    private String year;
    private List<Rating> ratings;
    private String runtime;
    private LocalDateTime dateWatched;
    private String genre;
 }
