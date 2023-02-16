package Bascet;

import com.beust.ah.A;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.Configuration;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Xpath.XpathForBasket.*;
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
        driver.close();
    }

    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    @Test
    public void showVariantsInBasket() {
        driver.findElement(ALL_CATEGORIES).click();
        driver.findElement(SMART_SYSTEM_CATEGORY).click();
        driver.findElement(SMART_SYSTEM_RADIATOR_CATEGORY).click();
        driver.findElement(PRODUCT_WHO_HAVE_VARIANTS).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(SECOND_VARIANT_PRODUCT).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        System.out.println("ЗАходит");
        String shopCartPage = driver.getCurrentUrl();
        System.out.println(shopCartPage);
        driver.findElement(BUTTON_LOGO_GO_TO_CART).click();
        String inCart = driver.getCurrentUrl();
        System.out.println(inCart);
        driver.findElement(SELECT_ALL_IN_CARD).click();

    }

    @Test
    public void checkEmptyBasket() {
        driver.findElement(BUTTON_LOGO_GO_TO_CART).click();
        driver.findElement(EMPTY_BASKET);
        driver.findElement(YOUR_BASKET_IS_EMPTY);
        driver.findElement(SHOP_INFO_CONTAINER);
    }

    @Test
    public void addedInBasketFiftyItems() throws InterruptedException {
        for (int i = 3; i > 0; i--) {
            Thread.sleep(1000);
        }
        driver.findElement(ALL_CATEGORIES).click();
        driver.findElement(CATEGORY_TEST).click();
        WebElement element = driver.findElement(By.xpath("//ul[@class='product__list category-detail__result-list']"));
        int countItems = driver.findElements(FULL_ITEMS_ON_PAGE).size();
        System.out.println(countItems);
        List<WebElement> elementName = driver.findElements(By.xpath("//ul[@class='product__list category-detail__result-list']//li"));
        for (int j = 0; j < elementName.size(); j++) {
            elementName = driver.findElements(By.xpath("//ul[@class='product__list category-detail__result-list']//li"));
            System.out.println(elementName);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(elementName.get(j)));
            elementName.get(j).click();
            for (int i = 3; i > 0; i--) {
                Thread.sleep(1000);
            }
            System.out.println(j + "  добавлен");
            driver.findElement(BUTTON_ADD_TO_CART).click();
            for (int i = 2; i > 0; i--) {
                Thread.sleep(1000);
            }
            driver.navigate().to("https://staging.tt-turk.com/ua/categories/test-16930");
            for (int i = 2; i > 0; i--) {
                Thread.sleep(1000);
            }
        }
        driver.findElement(BUTTON_GO_TO_THREE_PAGE).click();
        for (int j = 0; j < 18; j++) {
            elementName = driver.findElements(By.xpath("//ul[@class='product__list category-detail__result-list']//li"));
            System.out.println(elementName);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(elementName.get(j)));
            elementName.get(j).click();
            for (int i = 2; i > 0; i--) {
                Thread.sleep(1000);
            }
            System.out.println(j + "  добавлен");
            driver.findElement(BUTTON_ADD_TO_CART).click();
            for (int i = 2; i > 0; i--) {
                Thread.sleep(1000);
            }
            driver.navigate().to("https://staging.tt-turk.com/ua/categories/test-16930?page=13");
            for (int i = 2; i > 0; i--) {
                Thread.sleep(1000);
            }
        }
        int countItemInBasket = Integer.parseInt(driver.findElement(INFO_HOW_PRODUCTS_IN_BASKET).getText());
        int countNeededItems = 50 - countItemInBasket;
        driver.navigate().to("https://staging.tt-turk.com/ua/categories/test-16930?page=30");
        if (countNeededItems != 50) {
            for (int i = 0; i < countNeededItems; i++) {
                elementName = driver.findElements(By.xpath("//ul[@class='product__list category-detail__result-list']//li"));
                System.out.println(countItemInBasket + i);
                elementName.get(i).click();
                System.out.println("последний этап нажимает" + i);
                for (int j = 2; j > 0; j--) {
                    Thread.sleep(1000);
                }
                driver.findElement(BUTTON_ADD_TO_CART).click();
                System.out.println(" Добавить  в карту  этап нажимает" + i);
                driver.navigate().to("https://staging.tt-turk.com/ua/categories/test-16930?page=30");
                for (int j = 2; j > 0; j--) {
                    Thread.sleep(1000);
                }
            }
        }
        driver.findElement(TWENTY_FIVE_ITEMS_IN_LIST).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        for (int j = 2; j > 0; j--) {
            Thread.sleep(1000);
        }
        driver.findElement(YOUR_BASKET_IS_FULL_1);
        driver.findElement(YOUR_BASKET_IS_FULL_3).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(YOUR_BASKET_IS_FULL_2);
        for (int j = 2; j > 0; j--) {
            Thread.sleep(1000);
        }
        String linkToBasket = driver.getCurrentUrl();
        String linkAtBasket = "https://staging.tt-turk.com/ua/shop-cart";
        Assert.assertEquals(linkAtBasket, linkToBasket);
    }


    @Test
    public void SelectiveDeletionOfGoodsAddingToTheDeferred() throws InterruptedException { //Выборочное удаление товара, добавление в отложенное:

        for (int j = 5; j > 0; j--) {
            Thread.sleep(1000);
        }
       driver.navigate().to("https://staging.tt-turk.com/ua/product/7009db43-95a2-43f4-9986-43f139f4b00b?skuId=1068902");
       driver.findElement(BUTTON_ADD_TO_CART).click();
        for (int j = 2; j > 0; j--) {
            Thread.sleep(1000);
        }
       driver.navigate().to("https://staging.tt-turk.com/ua/product/e31b0b06-0959-4ebf-9df4-e9974ab2e304?skuId=1117412");
        driver.findElement(BUTTON_ADD_TO_CART).click();
        for (int j = 2; j > 0; j--) {
            Thread.sleep(1000);
        }
       driver.navigate().to("https://staging.tt-turk.com/ua/product/0fc3e8d4-d95e-4f09-b390-cd7a0a63fd49?skuId=1069562");
        driver.findElement(BUTTON_ADD_TO_CART).click();
        for (int j = 2; j > 0; j--) {
            Thread.sleep(1000);
        }
       driver.navigate().to("https://staging.tt-turk.com/ua/product/5fe08307-6958-4f3d-9c38-04c289916690?skuId=1009265");
        driver.findElement(BUTTON_ADD_TO_CART).click();
        for (int j = 2; j > 0; j--) {
            Thread.sleep(1000);
        }
       driver.navigate().to("https://staging.tt-turk.com/ua/product/d4729f36-000c-4a8a-9fdd-28ae511103b8?skuId=461926");

        driver.findElement(BUTTON_LOGO_GO_TO_CART).click();
//        String firstKargoString =driver.findElement(PRICE_IN_BASKET_JUST_KARGO).getText();
//        double firstKargo = Double.parseDouble(firstKargoString.replaceAll(",",".").replaceAll("\\$", ""));
//        String firstPriceString =driver.findElement(PRICE_IN_BASKET_WITHOUT_KARGO).getText();
//        double firstPrice =Double.parseDouble(firstPriceString.replaceAll(",",".").replaceAll("\\$", ""));
//        String firstTotalPriceString =driver.findElement(TOTAL_PRICE_IN_BASKET).getText();
//        double firstTotalPrice = Double.parseDouble(firstTotalPriceString.replaceAll(",",".").replaceAll("\\$", ""));
        driver.findElement(INPUT_BUTTON_SELECT_IN_BASKET_1).click();
        driver.findElement(INPUT_BUTTON_SELECT_IN_BASKET_3).click();
        driver.findElement(FAVORITE_BUTTON_4).click();
        driver.findElement(FAVORITE_BUTTON_2).click();
        driver.findElement(DELETE_SELECT_ITEMS_IN_BASKET).click();
//        String secondKargoString =driver.findElement(PRICE_IN_BASKET_JUST_KARGO).getText();
//        double secondKargo = Double.parseDouble(secondKargoString.replaceAll(",",".").replaceAll("\\$", ""));
//        String secondPriceString =driver.findElement(PRICE_IN_BASKET_WITHOUT_KARGO).getText();
//        double secondPrice = Double.parseDouble(secondPriceString.replaceAll(",",".").replaceAll("\\$", ""));
//        String secondTotalPriceString =driver.findElement(TOTAL_PRICE_IN_BASKET).getText();
//        double secondTotalPrice = Double.parseDouble(secondTotalPriceString.replaceAll(",",".").replaceAll("\\$", ""));
//       double kargoAnd_Price = secondKargo+secondPrice;
//        System.out.println(kargoAnd_Price + " vf " + secondTotalPrice);
//       Assert.assertEquals(firstKargo, secondKargo);
//        Assert.assertNotEquals(firstPrice,secondPrice);
//        Assert.assertNotEquals(firstTotalPrice,secondTotalPrice);


    }
}

