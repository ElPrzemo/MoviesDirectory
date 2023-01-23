package pl.stormit.moviesdirectory;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
public class Movie {

    @Id
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

