package com.gatica.ceres.service;

import com.gatica.ceres.client.ConsumeApi;
import com.gatica.ceres.mapper.JsonConverter;
import com.gatica.ceres.mapper.MovieMapper;
import com.gatica.ceres.model.Movie;
import com.gatica.ceres.model.MovieItem;
import com.gatica.ceres.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MovieService {

    private ConsumeApi consumeApi;
    private JsonConverter jsonConverter;
    private MovieRepository movieRepository;


    public Movie findMovie(String name) {

        String json = consumeApi.consumeData(name);

        return jsonConverter.convertJson(json, Movie.class);
    }

    public List<MovieItem> listMovies(String name){
        return movieRepository.findByUser( name);
    }

    public List<MovieItem>  addMovieToUserList(String movieName, String user,List<String> friends) {
        Movie movie = findMovie(movieName);

        movieRepository.save(MovieMapper.mapMovieToMovieItem(movie,user,friends));

        return movieRepository.findByUser(user);
    }


}
