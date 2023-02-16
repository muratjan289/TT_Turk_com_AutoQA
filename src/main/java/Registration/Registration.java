package Registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static Xpath.XpathForRegistration.*;
import static Xpath.XpathForTtTurk.*;
import static ZetOptions.options.*;

public class Registration {


    private WebDriver driver;

    @BeforeMethod
    public void OpenDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriverq.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        //Goto guru99 site
        driver.get("https://staging.tt-turk.com/ua");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void CloseDriver(){
//        driver.close();
    }
    
    @Test
    public void falseRegistration() throws InterruptedException {
        driver.findElement(AVATAR_LOGO).click();
        driver.findElement(REGISTRATION_INPUT).click();
        driver.findElement(NEW_LOGIN_INPUT).sendKeys(falseNewEmailRandom);
        driver.findElement(NEW_PASSWORD_INPUT).sendKeys(falseFirstPassword);
        driver.findElement(NEW_PASSWORD_CONFIRM_INPUT).sendKeys(falsesSecondPassword);
        driver.findElement(BUTTON_AGREE_POLICY).click();
        driver.findElement( BUTTON_NEW_ACCOUNT_CREATE).click();
        for (int i = 3; i > 0; i--) {
            Thread.sleep(1000);
        }
        driver.findElement(EMAIL_DOES_NOT_EXIST);
        driver.findElement(FIRST_PASSWORD_ERROR);
        driver.findElement(SECOND_PASSWORD_ERROR);
        driver.findElement(LINK_TO_COOKIE);
        driver.findElement(LINK_TO_POLITIC_PRIVACY);
    }


    @Test
    public void falseAuthorization(){
        driver.findElement(AVATAR_LOGO).click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(LOGIN_INPUT).sendKeys("muratkhalilov@gmail.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("go;lin27");
        driver.findElement(BUTTON_SIGN_IN_TT_TURK).click();
        driver.findElement(WRONG_EMAIL_OR_PASSWORD);
    }

    @Test
    public void UNAVAILABLE_FUNCTIONALITY_DURING_DEAUTHORIZATION() throws InterruptedException {
        driver.findElement(SAVED_SETTINGS).click();
        driver.findElement(ICON_BUTTON_ORDERS).click();
        for (int i = 3; i > 0; i--) {
            Thread.sleep(1000);
        }
        driver.findElement(BUTTON_CLOSE_AUTHORIZATION_WINDOW).click(); // try open orders


        driver.findElement(BUTTON_SELECT_SECOND_PRODUCT_IN_POPULAR_ITEMS).click();
        driver.findElement(BUTTON_ADD_TO_FAVORITES_PRODUCTS).click();
        driver.findElement(BUTTON_CLOSE_AUTHORIZATION_WINDOW).click(); // try added to favorite products

        driver.navigate().to(MAIN_URL);
        driver.findElement(ICON_FAVORITE_ITEMS).click();
        driver.findElement(BUTTON_CLOSE_AUTHORIZATION_WINDOW).click(); // try open  favorite products

        driver.findElement(BUTTON_SELECT_SECOND_PRODUCT_IN_POPULAR_ITEMS).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_BUY_RIGHT_NOW).click();
        driver.findElement(BUTTON_CHECKOUT).click();
        driver.findElement(BUTTON_CLOSE_AUTHORIZATION_WINDOW).click();













    }

}
