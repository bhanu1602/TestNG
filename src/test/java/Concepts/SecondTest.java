package Concepts;

import org.testng.annotations.Test;

public class SecondTest {

    @Test(priority = 1)
    void setup(){
        System.out.println("This is setup");
    }

    @Test(priority = 2)
    void searchCustomer(){
        System.out.println("This is search customer");
    }

    @Test(priority = 2)
    void addCustomer(){
        System.out.println("This is add customer");
    }

    @Test(priority = 3)
    void teardown(){
        System.out.println("This is closing");
    }

}

