package org.reznikov.testing.gismeteo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by antonreznikov on 1/21/17.
 */
public class TwoWeeksView extends CityPage{
    private static final String FORECAST_ON_DAY = "//*[contains(@class,'rframe wblock wdata')][.//*[@class='s_date'][text()='{0}']]";
    //*[@id="weather-weekly"]/div[3]/div[5]/div[3]/table/tbody/tr/td[1]/div[2]
    public TwoWeeksView(WebDriver driver) {
        super(driver);
    }

    public void getForecastForDay(LocalDate date){
//        LocalDate firstDayInList = LocalDate.now();
//
//        if(0<ChronoUnit.DAYS.between(firstDayInList,date)&&
//                ChronoUnit.DAYS.between(firstDayInList,date)<13) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                    FORECAST_ON_DAY.replace("{0}",
                            date.format(DateTimeFormatter.ofPattern("dd.MM")
                            ))))).click();
//        } else {
//            throw new WebDriverException("Date "+date.toString()+" is not in two week range");
//        }

    }


}
