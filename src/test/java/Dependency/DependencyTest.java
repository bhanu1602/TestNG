package Dependency;

import org.testng.annotations.Test;

public class DependencyTest {

    static String trackingNum = "AB123";

    @Test(priority = 1)
    public void CreateShipment(){
        if (trackingNum == null) {
            System.out.println("Shipment not Created");
        }else{
            System.out.println("Shipment Created");
        }
    }

    @Test(priority = 2, dependsOnMethods = {"CreateShipment"}, alwaysRun = true)
    public void TrackShipment() throws Exception {
        if(trackingNum != null) {
            System.out.println("Shipment Tracked");
        }else{
            throw new Exception ("Invalid Tracking ID");
        }
    }

    @Test(priority = 3, dependsOnMethods = {"CreateShipment"}, ignoreMissingDependencies = true)
    public void CancelShipment() throws Exception{
        if(trackingNum != null) {
            System.out.println("Shipment Cancelled");
        }else{
            throw new Exception ("Invalid Tracking ID");
        }
    }
}
