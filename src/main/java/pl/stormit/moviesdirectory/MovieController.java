package pl.stormit.moviesdirectory;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("time")
public class MovieController {

    //http://localhost:8080/time

    String time (){
        return ""+ System.currentTimeMillis();

    }
}
