package pl.stormit.moviesdirectory;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Set;
import java.util.UUID;

@Entity
public class Actor {

    @Id
    private UUID id;

    private String name;

    private String surname;


    @ManyToMany(mappedBy = "actors")
    private Set<Movie> movies;

}
