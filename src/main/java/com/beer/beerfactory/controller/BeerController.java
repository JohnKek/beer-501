package com.beer.beerfactory.controller;

import com.beer.beerfactory.entity.Beer;
import com.beer.beerfactory.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beer")
public class BeerController {

    @Autowired
    private BeerService beerService;


    @GetMapping("/getAll")
    public List<Beer> getAllBeer() {
        List<Beer> beerList = beerService.getAllBeer();
        return beerList;
    }

    @PostMapping("/add")
    public Beer addBeer(@RequestBody Beer beer) {
        beerService.saveBeer(beer);
        return beer;
    }

}
