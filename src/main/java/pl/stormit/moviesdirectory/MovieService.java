package pl.stormit.moviesdirectory;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class MovieService {
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
}
