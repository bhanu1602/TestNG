package Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//if multiple listeners use curly brackets @Listeners({ITestListenerClass.class, ITestListenerClass.class})

public class Parallel {

    @Test(priority = 1)
    public void Test1(){
        System.out.println("Im inside Test1");
    }

    @Test(priority = 2)
    public void Test2(){
        System.out.println("Im inside Test2");
        Assert.assertTrue(false);
    }

    @Test(timeOut = 1000, priority = 3)
    public void Test3() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println("Im inside Test3");
    }

    @Test(dependsOnMethods = "Test3", priority = 4)
    public void Test4(){
        System.out.println("Im inside Test4");
    }



}
