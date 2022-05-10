package com.beer.beerfactory.service;

import com.beer.beerfactory.entity.Beer;

import java.util.List;

public interface BeerService {
    public List<Beer> getAllBeer();

    public void saveBeer(Beer beer);

    public void deleteBeer(int id);


}
