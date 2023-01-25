package pl.stormit.moviesdirectory;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Category {
    @Id
    private UUID id;

    private String name;

    @OneToMany (mappedBy = "category")
    private Set<Movie> movies;


}
