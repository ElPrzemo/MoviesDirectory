package pl.stormit.moviesdirectory;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MovieRepository extends CrudRepository<Movie, UUID> {

    @Query("select m from Movie m join fetch m.category")
    Iterable<Movie> findAllWithCategories();

}

