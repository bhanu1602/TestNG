package DataProvider;

import org.testng.annotations.DataProvider;

public class DataForIndices {

    @DataProvider(indices = {0,2})
    public Object[][] dp1(){
        Object[][] data = new Object[][]{
                {"Smith"},
                {"Rebecca"},
                {"Ariana"}
        };
        return data;
    }
}
