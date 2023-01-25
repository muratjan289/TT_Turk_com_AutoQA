package Bascet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import static Xpath.XpathForTtTurk.*;

public class Bascet {


    private WebDriver driver;

    @BeforeMethod
    public void OpenDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriverq.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        //Goto guru99 site
        driver.get("https://k8s-staging.tt-turk.com/ua");
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
        driver.close();

    }

    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
