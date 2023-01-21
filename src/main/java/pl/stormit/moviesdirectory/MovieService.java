package pl.stormit.moviesdirectory;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class MovieService {
    ;

    public List<Movie> getMovies() {
        return Arrays.asList(
                new Movie("Batman"),
                new Movie("Rocky"),
                new Movie("Superman 3")
        );
    }

    public Movie getMovie(UUID id) {
        Movie movie= new Movie("Movie"+id);
        return movie;
    }

    @ResponseStatus(HttpStatus.CREATED)
    public Movie createMovie(Movie movie) {
        movie.setId(UUID.randomUUID());
        // TODOD save movie\
        return movie;
    }


    public Movie updateMovie(UUID id, Movie movie) {
        movie.setId(id);
        return movie;
    }

    public void deleteMovie (UUID id) {
        //TODO delete movie
    }


}

