package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DataProvider2{

    @Test(dataProvider = "data")
    public void test(String s){
        System.out.println(s);
    }

    @Test(dataProvider = "data2")
    public void test2(String s1, String s2){
        System.out.println(s1 + " " + s2);
    }

    @Test(dataProvider = "data3")
    public void test3(String[] values){
        System.out.println(Arrays.toString(values));
    }

    @Test(dataProvider = "data4")
    public void test3(String s){
        System.out.println(s);
    }

    //Single Dimensional
    @DataProvider(name = "data")
    public static Object[][] data(){
        return new Object[][]{
                {"abcd"},
                {"def"},
                {"ghij"}
        };
    }

    //Multi dimensional
    @DataProvider(name = "data2")
    public static Object[][] data2(){
        return new Object[][]{
                {"abcd", "1234"},
                {"def", "5678"},
                {"ghij", "91022"}
        };
    }

    //Jagged Array

    @DataProvider(name = "data3")
    public Object[][] data3(){
        return new Object[][]{
                {"abcd", "1234", "abc"},
                {"def", "5678"},
                {"ghij", "91022", "efg", "def"}
        };
    }

    //Iterator
    @DataProvider(name = "data4")
    public Iterator<Object[]> data4(){
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"Bhanu"});
        data.add(new Object[]{"Prasad"});
        return data.iterator();
    }

}
