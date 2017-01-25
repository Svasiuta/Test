package org.reznikov.testing;

import org.reznikov.testing.gismeteo.pages.CityPage;
import org.testng.annotations.Test;

import java.time.LocalDate;

/**
 * Created by antonreznikov on 1/10/17.
 */
public class MyNewTest extends BaseWebDriverTest{

    @Test
    public void testSite(){
//        GismeteoHomePage page = new GismeteoHomePage(driver);
//        page.searchForCity("Львов");
        CityPage page1 = new CityPage(driver);
        page1.searchForCity("Львов");
       page1.swithchToTwoWeeksViewView().getForecastForDay(LocalDate.parse("2017-01-26"));

    }


}
