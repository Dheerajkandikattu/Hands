package com.org.tav.JunitDemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
 
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
 

 
@ExtendWith(MockitoExtension.class) // tells Mockito to create mock based on the @Mocke annotation 
class ServiceTest {
 
    @Mock
    Database databaseMock;   //tells Mockito to mock the databaseMock instance 



    @Test
    public void testQuery() {
        //fail("Not yet implemented");
        assertNotNull(databaseMock);
        when(databaseMock.isAvalilable()).thenReturn(true);// configure the mock to return true when its isAvailable method 
        Service t =  new Service(databaseMock);  //execute some code of the class under test
        boolean check = t.query("* from t"); //Assert that the method call returned true
        assertTrue(check);
    }
 
}
