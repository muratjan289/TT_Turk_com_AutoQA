import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import static Xpath.XpathForTtTurk.AMOUNT_ITEMS_IN_STOCK;

public class options {




   static String productCounter = String.valueOf(AMOUNT_ITEMS_IN_STOCK);

    public static int rCount(){

           int  gg=Integer.parseInt(productCounter.replaceAll("\\D+",""));
        return gg;

    }




}
