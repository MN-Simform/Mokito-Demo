package com.example.mokito.mokitoDemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusinessImplTest {

    @Test
    void Test(){
        DataServiceStub dataServiceStub = new DataServiceStub();
        BusinessImpl business = new BusinessImpl(dataServiceStub);
        int res = business.findGreatestData();
        assertEquals(40, res);
        System.out.println(res);
    }
}

class DataServiceStub implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{10,30,20,40};
    }
}