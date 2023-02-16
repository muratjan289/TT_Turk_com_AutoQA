package ZetOptions;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import static Xpath.XpathForTtTurk.AMOUNT_ITEMS_IN_STOCK;

public class options {


   public static String MAIN_URL = "https://staging.tt-turk.com/ua";

   public static final String falseFirstPassword = "ргпгжи";
   public static final String falsesSecondPassword = "арощлщошг";
   public static final  String falseNewEmailRandom = RandomStringUtils.randomAlphabetic(6,12) + "mailru";







}
