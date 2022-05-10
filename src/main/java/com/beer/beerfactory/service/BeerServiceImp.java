package com.beer.beerfactory.service;

import com.beer.beerfactory.dao.BeerRep;
import com.beer.beerfactory.entity.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerServiceImp implements BeerService {

    @Autowired
    private BeerRep beerRep;

    @Override
    public List<Beer> getAllBeer() {
        return beerRep.findAll();
    }

    @Override
    public void saveBeer(Beer beer) {
        beerRep.save(beer);
    }

    @Override
    public void deleteBeer(int id) {
        beerRep.deleteById(id);
    }
}
