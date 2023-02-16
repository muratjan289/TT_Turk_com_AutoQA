package ItemDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.time.Duration;
import java.util.List;
import java.util.Random;

import static Xpath.XpathForBasket.FULL_ITEMS_ON_PAGE;
import static Xpath.XpathForItemDetails.*;
import static Xpath.XpathForTtTurk.*;
import static ZetOptions.Comments.*;

public class ItemDetails {

    private WebDriver driver;

    @BeforeMethod
    public void OpenDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriverq.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        //Goto guru99 site
        driver.get("https://staging.tt-turk.com/ua");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.findElement(SAVED_SETTINGS).click();
        driver.findElement(AVATAR_LOGO).click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(LOGIN_INPUT).sendKeys("muratkhalilov289@gmail.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("goblin27");
        driver.findElement(BUTTON_SIGN_IN_TT_TURK).click();
    }

    @AfterMethod
    public void CloseDriver() {
//        driver.close();
    }

    @Test
    public void addCommentsInItem() throws InterruptedException {
        driver.findElement(BUTTON_SELECT_SECOND_PRODUCT_IN_POPULAR_ITEMS).click();
        for(int i = 0; i>2; i++){
            Thread.sleep(1000);
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(BUTTON_ADD_COMMENT).click();
        driver.findElement(INFO_YOUR_RATING_FOR_ITEMS);
        List<WebElement> elementName = driver.findElements(By.xpath("//div[@class='vue-star-rating']//span[@class='vue-star-rating-pointer vue-star-rating-star']"));
        System.out.println(elementName.size());
        Random random = new Random();
        int  RandomIndex  = random.nextInt(elementName.size());
        elementName.get(RandomIndex).click();
        driver.findElement(FILL_COMMENT_ONE).sendKeys(comment1);
        driver.findElement(FILL_COMMENT_TWO).sendKeys(comment2);
        driver.findElement(FILL_COMMENT_THREE).sendKeys(comment3);
        driver.findElement(SUBMIT_COMMENT).click();


    }




}
