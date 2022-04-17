package com.example.bricool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin
@RequestMapping("/Rating")
public class RatingController {
    @Autowired
    private RatingRepository ratingRepository;
    @PostMapping("post")
    public  Rating Rating(@RequestBody Rating rating){
        System.out.println(rating);
        ratingRepository.save(rating);
        return rating;
    }
    @GetMapping("get")
    public int[] getRating(@RequestParam("idEmploye") String idEmploye){
        System.out.println(idEmploye);
        List<Rating> employeeRatings = new ArrayList<Rating>();
        int [] ratings =new int[5];
        employeeRatings.addAll(ratingRepository.findAll());
        System.out.println(employeeRatings);
        int five=0;
        int four =0;
        int three =0;
        int two =0;
        int one =0;
        for(Rating e : employeeRatings){
            if(e.getIdEmploye().equals(idEmploye) && e.getRating() == 5){
                five++;
            }else if(e.getIdEmploye().equals(idEmploye) && e.getRating() == 4) {
                four ++;
            }else if (e.getIdEmploye().equals(idEmploye) && e.getRating() == 3){
                three++;
            }else if(e.getIdEmploye().equals(idEmploye) && e.getRating() == 2){
                two++;
            }else if(e.getIdEmploye().equals(idEmploye) && e.getRating() == 1){
                one++;
            }
        }
        ratings[0] = one;
        ratings[1] = two;
        ratings[2] = three;
        ratings[3] = four;
        ratings[4] = five;
        System.out.println(Arrays.toString(ratings));
        return ratings;
    }

}
