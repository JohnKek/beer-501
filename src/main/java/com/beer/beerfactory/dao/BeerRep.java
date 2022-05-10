package com.beer.beerfactory.dao;

import com.beer.beerfactory.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BeerRep extends JpaRepository<Beer, Integer> {
}
