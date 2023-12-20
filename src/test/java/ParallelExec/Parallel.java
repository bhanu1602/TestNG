package ParallelExec;

import org.testng.annotations.Test;

public class Parallel {

    @Test
    public void Test1(){
        System.out.println("TestClass1 >> TestMethod1 " + Thread.currentThread().threadId());
    }

    @Test
    public void Test2(){
        System.out.println("TestClass1 >> TestMethod2 " + Thread.currentThread().threadId());
    }

    @Test
    public void Test3(){
        System.out.println("TestClass1 >> TestMethod3 " + Thread.currentThread().threadId());
    }

    @Test
    public void Test4(){
        System.out.println("TestClass1 >> TestMethod4 " + Thread.currentThread().threadId());
    }



}
