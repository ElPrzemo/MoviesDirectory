package pl.stormit.moviesdirectory;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    public Iterable<Movie> getMovies() {
        return movieRepository.findAllWithCategories();

    }

    public Movie getMovie(UUID id) {
         return movieRepository.findById(id)
        .orElseThrow();
    }

    @ResponseStatus(HttpStatus.CREATED)
    public Movie createMovie(Movie movie) {
        movie.setId(UUID.randomUUID());

       movie = movieRepository.save(movie);
        return movie;
    }


    public Movie updateMovie(UUID id, Movie movie) {
        Movie movieDB = movieRepository.findById(id)
                .orElseThrow();

        movieDB.setName(movieDB.getName());
        movieDB = movieRepository.save(movieDB);
        return movieDB;
    }

    public void deleteMovie (UUID id) {
       movieRepository.deleteById(id);
    }


}

