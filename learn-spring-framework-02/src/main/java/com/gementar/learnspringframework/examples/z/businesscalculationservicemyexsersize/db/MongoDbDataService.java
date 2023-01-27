package com.gementar.learnspringframework.examples.z.businesscalculationservicemyexsersize.db;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MongoDbDataService implements DataService
{
    @Override
    public int[] retrieveData()
    {
        return new int[] { 11, 22, 33, 44 , 55};
    }
}
