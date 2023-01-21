package pl.stormit.moviesdirectory;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Movie {

    private UUID id;
    private String name;

    public Movie() {
        id = UUID.randomUUID();
    }


    public Movie(String name) {
        this();
        this.name = name;
    }

    public Movie getMovie(UUID id){
        Movie movie = new Movie("Movie" + id);
        return movie;
    }

}

