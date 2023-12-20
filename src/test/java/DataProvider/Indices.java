package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Indices {

    @Test(dataProvider = "dp1", dataProviderClass = DataForIndices.class)
    public void data(String s){
        System.out.println(s);
    }
}
