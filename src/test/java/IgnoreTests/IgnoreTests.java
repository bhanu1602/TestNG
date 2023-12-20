package IgnoreTests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class IgnoreTests {

        @Ignore
        @Test
        public void test1() {
            // Test 1 logic
            System.out.println("This is test1");
        }

        @Test
        public void test2() {
            // Test 2 logic
            System.out.println("This is test2");
        }

        @Test
        public void test3() {
            // Test 3 logic
            System.out.println("This is test3");
        }

        @Test
        public void test4() {
            System.out.println("This is test4");
        }
}
