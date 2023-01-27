package com.gementar.learnspringframework.examples.c1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

//@Component
@Service
public class BusinessCalculationService
{
    private DataService dataService;

    @Autowired
    public  BusinessCalculationService(DataService dataService)
    {
        this.dataService = dataService;
    }

    public int findMax()
    {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }

}
