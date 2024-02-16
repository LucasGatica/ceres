package com.gatica.ceres.controller;

import com.gatica.ceres.model.Movie;
import com.gatica.ceres.model.MovieItem;
import com.gatica.ceres.service.MovieService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
@AllArgsConstructor
public class MovieController {

    private MovieService movieService;

    @GetMapping
    public Movie findMovie(@RequestParam("name") String name){
        return movieService.findMovie(name);

    }

    @GetMapping("/add")
    public List<MovieItem>  addMovieToUserList(@RequestParam("movieName") String movieName, @RequestParam("user") String user, @RequestBody List<String> friends){
        return movieService.addMovieToUserList(movieName,user, friends);

    }

    @GetMapping("/list")
    public List<MovieItem> listMovies(@RequestParam("name") String name){
        return movieService.listMovies(name);
    }
}
