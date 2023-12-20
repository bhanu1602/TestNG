package Concepts;

import org.testng.annotations.*;

public class Annotations {

    @BeforeSuite
    void beforeSuite(){
        System.out.println("beforeSuite");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("beforeTest");
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("beforeClass");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("beforeMethod");
    }

    @Test
    void test(){
        System.out.println("Test");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("afterMethod");
    }

    @AfterClass
    void afterClass(){
        System.out.println("afterClass");
    }

    @AfterTest
    void afterTest(){
        System.out.println("AfterTest");
    }


}
