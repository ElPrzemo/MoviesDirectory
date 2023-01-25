package pl.stormit.moviesdirectory;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
public class Movie {

    @Id
    private UUID id;
    private String name;

    @ManyToOne
    private Category category;

    @ManyToMany
    private Set<Actor>actors;

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

