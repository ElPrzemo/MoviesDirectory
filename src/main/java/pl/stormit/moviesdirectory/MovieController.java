package pl.stormit.moviesdirectory;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/movies")
@RequiredArgsConstructor

public class MovieController {


    private final MovieService movieService;

    @GetMapping
    List<Movie> getMovies(){
        return movieService.getMovies();
    }

    @GetMapping("{id}")

    Movie getMovie (@PathVariable UUID id){
        return movieService.getMovie(id);
    }

    //CRUD
    /*
     * CC -CREATE / POST/movies

     * R- READ
     * GET-/movies
     * GET-/movies{id}

     * U-update  PUT-/movies{id}

     * D-delete
     */

}