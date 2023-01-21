package pl.stormit.moviesdirectory;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/movies")
@RequiredArgsConstructor

public class MovieController {


    private final MovieService movieService;

    @GetMapping
    List<Movie> getMovies(){
        return movieService.getMovies();
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