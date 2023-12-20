package ParallelExec;

import org.testng.annotations.Test;

public class Parallel2 {

    @Test
    public void Test5(){
        System.out.println("TestClass2 >> TestMethod5 " + Thread.currentThread().threadId());
    }

    @Test
    public void Test6(){
        System.out.println("TestClass2 >> TestMethod6 " + Thread.currentThread().threadId());
    }

    @Test
    public void Test7(){
        System.out.println("TestClass2 >> TestMethod7 " + Thread.currentThread().threadId());
    }
}
