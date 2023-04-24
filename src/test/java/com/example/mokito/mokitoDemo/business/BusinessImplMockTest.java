package com.example.mokito.mokitoDemo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BusinessImplMockTest {
    @Mock
    DataService dataServiceMock;

    @InjectMocks
    BusinessImpl business;
    @Test
    void Test(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{10,30,40,20});
        assertEquals(40, business.findGreatestData());
    }

    @Test
    void Test2(){
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{10,30,40,20,50,60});
        BusinessImpl business = new BusinessImpl(dataServiceMock);
        int res = business.findGreatestData();
        assertEquals(60, res);
    }

    @Test
    void Test3(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        int res = business.findGreatestData();
        assertEquals(Integer.MIN_VALUE, res);
        System.out.println(res);
    }
}