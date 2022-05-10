package com.beer.beerfactory.service;

import com.beer.beerfactory.dao.MeasureRep;
import com.beer.beerfactory.entity.Measure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class MeasureServiceImp implements MeasureService {
    @Autowired
    private MeasureRep measureRep;

    @Override
    public List<Measure> getAllMeasure() {

        return measureRep.findAll();
    }

    @Override
    public void saveMeasure(Measure measure) {
        measureRep.save(measure);
    }


}
