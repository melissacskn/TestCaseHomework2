package Tests;

import Tests.Base;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class TestHomePageIsVisible extends Base {


   @Test
    public void HomePageVisible(){

       assertEquals(driver.getTitle(),"Automation Exercise","Home Page is not visible");
   }

}
