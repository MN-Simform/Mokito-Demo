package com.example.mokito.mokitoDemo.business;

public class BusinessImpl {

    DataService dataService;

    public BusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findGreatestData(){
        int[] data = dataService.retrieveAllData();
        int greatestData = Integer.MIN_VALUE;
        for(int val : data){
            if(val > greatestData)
                greatestData = val;
        }
        return greatestData;
    }
}



