package GroupingTests;

import org.testng.annotations.Test;

public class Group2 {

    @Test(groups = {"hotfix"})
    public void test4() {
        // Test 1 logic
        System.out.println("This is test4");
    }

    @Test(groups = {"sanity"})
    public void test5() {
        // Test 2 logic
        System.out.println("This is test5");
    }

    @Test(groups = {"smoke", "functional"})
    public void test6() {
        // Test 3 logic
        System.out.println("This is test6");
    }

    @Test(groups = {"functional"})
    public void test7() {
        System.out.println("This is test7");
    }
}
