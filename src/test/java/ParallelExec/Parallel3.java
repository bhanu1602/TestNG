package ParallelExec;

import org.testng.annotations.Test;

public class Parallel3 {


    @Test
    public void Test1(){
        System.out.println("TestClass3 >> TestMethod8 " + Thread.currentThread().threadId());
    }

    @Test
    public void Test2(){
        System.out.println("TestClass3 >> TestMethod9 " + Thread.currentThread().threadId());
    }

    @Test
    public void Test3(){
        System.out.println("TestClass3 >> TestMethod10 " + Thread.currentThread().threadId());
    }

    @Test
    public void Test4(){
        System.out.println("TestClass3 >> TestMethod11 " + Thread.currentThread().threadId());
    }

}
