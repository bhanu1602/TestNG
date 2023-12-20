package GroupingTests;

import org.testng.annotations.Test;

@Test(groups = {"all"})

public class Group1 {

        @Test(groups = {"smoke", "functional"})
        public void test1() {
            // Test 1 logic
            System.out.println("This is test1");
        }

        @Test(groups = {"Regression", "sanity"})
        public void test2() {
            // Test 2 logic
            System.out.println("This is test2");
        }

        @Test(groups = {"Regression"})
        public void test3() {
            // Test 3 logic
            System.out.println("This is test3");
        }

        @Test(groups = {"smoke"})
        public void test4() {

            System.out.println("This is test4");
        }
}
