package Concepts;

import org.testng.annotations.Test;

public class FirstTest {

    @Test(priority = 1)
    void setup(){
        System.out.println("This is setup");
    }

    @Test(priority = 2)
    void Login(){
        System.out.println("This is Login");
    }

    @Test(priority = 3)
    void teardown(){
        System.out.println("This is closing");
    }

}
