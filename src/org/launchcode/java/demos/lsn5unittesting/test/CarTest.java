package org.launchcode.java.demos.lsn5unittesting.test;
import org.junit.Before;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class CarTest {

    Car test_car;

    @Before
    public void createCarObject() {
        test_car = new Car ("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
//        Car test_car = new Car ("Toyota", "Prius", 10, 50);
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }


    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankLevelAfterDrivingWithinRange() {
        test_car.drive(100); // Drive 100 miles
        assertEquals(8, test_car.getGasTankLevel(), .001);
    }

    @Test
    public void testGasTankAfterDriving() {
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(),.001);
    }




    //TODO: gasTankLevel is accurate after attempting to drive past tank range

    @Test
    public void testGasTankLevelAfterDrivingPastRange() {
        test_car.drive(600); // Drive 600 miles (beyond tank range)
        assertEquals(0, test_car.getGasTankLevel(), .001);
    }

    @Test
    public void testGasTankAfterExceedingTankRange() {
        test_car.drive(501);
        assertEquals(test_car.getGasTankLevel(), 0, .001);
    }

    //TODO: can't have more gas than tank size, expect an exception


}
