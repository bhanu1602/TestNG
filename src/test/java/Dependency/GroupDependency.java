package Dependency;

import org.testng.annotations.Test;

public class GroupDependency {

    @Test(groups = "smoke")
    public void Test1(){
        System.out.println("smoke");
    }
    @Test(groups = "sanity")
    public void Test2(){
        System.out.println("Sanity");
    }
    @Test(dependsOnGroups = "smoke", alwaysRun = true)
    public void Test0(){
        System.out.println("Main Test");
    }

}
