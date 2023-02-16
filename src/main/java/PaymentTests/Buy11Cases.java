package PaymentTests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

import static Xpath.XpathForBasket.FULL_ITEMS_ON_PAGE;
import static Xpath.XpathForTtTurk.*;

public class Buy11Cases {


    private WebDriver driver;

    @BeforeMethod
    public void OpenDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriverq.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        //Goto guru99 site
        driver.get("https://staging.tt-turk.com/ua");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void CloseDriver(){
        driver.close();

    }




    @Test
    public void EmptyItem() throws InterruptedException {

        driver.findElement(SAVED_SETTINGS).click();
        driver.findElement(AVATAR_LOGO).click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(LOGIN_INPUT).sendKeys("muratkhalilov289@gmail.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("goblin27");
        driver.findElement(BUTTON_SIGN_IN_TT_TURK).click();
        driver.findElement(ALL_CATEGORIES).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();
        driver.findElement(ITEM_NOT_WHOLESALE_NOT_DISCOUNT).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        System.out.println("ЗАходит");
        String shopCartPage = driver.getCurrentUrl();
        System.out.println(shopCartPage);
        driver.findElement(BUTTON_LOGO_GO_TO_CART).click();
        String inCart = driver.getCurrentUrl();
        System.out.println(inCart);
        driver.findElement(SELECT_ALL_IN_CARD).click();
        System.out.println("galochka");
        driver.findElement(BUTTON_CHECKOUT).click();
        String button_checkout = driver.getCurrentUrl();
        System.out.println(button_checkout);
        driver.findElement(BUTTON_CHECKOUT_FINALLY).click();
        String ButtoncheckoutFinal = driver.getCurrentUrl();
        System.out.println(ButtoncheckoutFinal);
        driver.findElement(INPUT_CREDIT_CARD_NUMBER).sendKeys("4508034508034509");
        driver.findElement(BUTTON_MONTH_ON_CARD).click();
        driver.findElement(BUTTON_YEAR_ON_CARD).click();
        driver.findElement(INPUT_CVC_CODE).sendKeys("000");
        driver.findElement(BUTTON_SUBMIT_CARD).click();
        }


    @Test
    public void WholesaleItem() throws InterruptedException {
        driver.findElement(SAVED_SETTINGS).click();
        driver.findElement(AVATAR_LOGO).click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(LOGIN_INPUT).sendKeys("muratkhalilov289@gmail.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("goblin27");
        driver.findElement(BUTTON_SIGN_IN_TT_TURK).click();
        driver.findElement(ALL_CATEGORIES).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();
        driver.findElement(ITEM_WITH_WHOLESALE).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        System.out.println("ЗАходит");
        String shopCartPage = driver.getCurrentUrl();
        System.out.println(shopCartPage);
        driver.findElement(BUTTON_LOGO_GO_TO_CART).click();
        String inCart = driver.getCurrentUrl();
        System.out.println(inCart);
        driver.findElement(SELECT_ALL_IN_CARD).click();
        System.out.println("galochka");
        driver.findElement(BUTTON_CHECKOUT).click();
        String button_checkout = driver.getCurrentUrl();
        System.out.println(button_checkout);
        driver.findElement(BUTTON_CHECKOUT_FINALLY).click();
        String ButtoncheckoutFinal = driver.getCurrentUrl();
        System.out.println(ButtoncheckoutFinal);
        driver.findElement(INPUT_CREDIT_CARD_NUMBER).sendKeys("4508034508034509");
        driver.findElement(BUTTON_MONTH_ON_CARD).click();
        driver.findElement(BUTTON_YEAR_ON_CARD).click();
        driver.findElement(INPUT_CVC_CODE).sendKeys("000");
        driver.findElement(BUTTON_SUBMIT_CARD).click();
    }



    @Test
    public void DiscountItem() throws InterruptedException {
        driver.findElement(SAVED_SETTINGS).click();
        driver.findElement(AVATAR_LOGO).click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(LOGIN_INPUT).sendKeys("muratkhalilov289@gmail.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("goblin27");
        driver.findElement(BUTTON_SIGN_IN_TT_TURK).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(ALL_CATEGORIES).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();
       
        driver.findElement(ITEM_DISCOUNT).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        System.out.println("ЗАходит");
        String shopCartPage = driver.getCurrentUrl();
        System.out.println(shopCartPage);
        driver.findElement(BUTTON_LOGO_GO_TO_CART).click();
        String inCart = driver.getCurrentUrl();
        System.out.println(inCart);
        driver.findElement(SELECT_ALL_IN_CARD).click();
        System.out.println("galochka");
        driver.findElement(BUTTON_CHECKOUT).click();
        String button_checkout = driver.getCurrentUrl();
        System.out.println(button_checkout);
        driver.findElement(BUTTON_CHECKOUT_FINALLY).click();
        String ButtoncheckoutFinal = driver.getCurrentUrl();
        System.out.println(ButtoncheckoutFinal);
        driver.findElement(INPUT_CREDIT_CARD_NUMBER).sendKeys("4508034508034509");
        driver.findElement(BUTTON_MONTH_ON_CARD).click();
        driver.findElement(BUTTON_YEAR_ON_CARD).click();
        driver.findElement(INPUT_CVC_CODE).sendKeys("000");
        driver.findElement(BUTTON_SUBMIT_CARD).click();

    }



    @Test
    public void DiscountWithWholesaleItem() throws InterruptedException {
        driver.findElement(SAVED_SETTINGS).click();
        driver.findElement(AVATAR_LOGO).click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(LOGIN_INPUT).sendKeys("muratkhalilov289@gmail.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("goblin27");
        driver.findElement(BUTTON_SIGN_IN_TT_TURK).click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(ALL_CATEGORIES).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();
        driver.findElement(ITEM_NOT_WHOLESALE_NOT_DISCOUNT).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        driver.findElement(MAIN_LOGO).click();
        driver.findElement(CATEGORY_HOME_IMPROVEMENT).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();
        driver.findElement(ITEM_DISCOUNT).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        System.out.println("ЗАходит");
        String shopCartPage = driver.getCurrentUrl();
        System.out.println(shopCartPage);
        driver.findElement(BUTTON_LOGO_GO_TO_CART).click();
        String inCart = driver.getCurrentUrl();
        System.out.println(inCart);
        driver.findElement(SELECT_ALL_IN_CARD).click();
        System.out.println("galochka");
        driver.findElement(BUTTON_CHECKOUT).click();
        String button_checkout = driver.getCurrentUrl();
        System.out.println(button_checkout);
        driver.findElement(BUTTON_CHECKOUT_FINALLY).click();
        String ButtoncheckoutFinal = driver.getCurrentUrl();
        System.out.println(ButtoncheckoutFinal);
        driver.findElement(INPUT_CREDIT_CARD_NUMBER).sendKeys("4508034508034509");
        driver.findElement(BUTTON_MONTH_ON_CARD).click();
        driver.findElement(BUTTON_YEAR_ON_CARD).click();
        driver.findElement(INPUT_CVC_CODE).sendKeys("000");
        driver.findElement(BUTTON_SUBMIT_CARD).click();

    }


    @Test
    public void EmptyAndDiscountItems() throws InterruptedException {
        driver.findElement(SAVED_SETTINGS).click();
        driver.findElement(AVATAR_LOGO).click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(LOGIN_INPUT).sendKeys("muratkhalilov289@gmail.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("goblin27");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(BUTTON_SIGN_IN_TT_TURK).click();
        driver.findElement(ALL_CATEGORIES).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();
        driver.findElement(ITEM_NOT_WHOLESALE_NOT_DISCOUNT).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        driver.findElement(MAIN_LOGO).click();
        driver.findElement(CATEGORY_HOME_IMPROVEMENT).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();
        driver.findElement(ITEM_DISCOUNT).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        System.out.println("ЗАходит");
        String shopCartPage = driver.getCurrentUrl();
        System.out.println(shopCartPage);
        driver.findElement(BUTTON_LOGO_GO_TO_CART).click();
        String inCart = driver.getCurrentUrl();
        System.out.println(inCart);
        driver.findElement(SELECT_ALL_IN_CARD).click();
        System.out.println("galochka");
        driver.findElement(BUTTON_CHECKOUT).click();
        String button_checkout = driver.getCurrentUrl();
        System.out.println(button_checkout);
        driver.findElement(BUTTON_CHECKOUT_FINALLY).click();
        String ButtoncheckoutFinal = driver.getCurrentUrl();
        System.out.println(ButtoncheckoutFinal);
        driver.findElement(INPUT_CREDIT_CARD_NUMBER).sendKeys("4508034508034509");
        driver.findElement(BUTTON_MONTH_ON_CARD).click();
        driver.findElement(BUTTON_YEAR_ON_CARD).click();
        driver.findElement(INPUT_CVC_CODE).sendKeys("000");
        driver.findElement(BUTTON_SUBMIT_CARD).click();
    }



    @Test
    public void addToBasketEmptyAndDiscountAndDiscountWithWholesaleItems() throws InterruptedException {
        driver.findElement(SAVED_SETTINGS).click();
        driver.findElement(AVATAR_LOGO).click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(LOGIN_INPUT).sendKeys("muratkhalilov289@gmail.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("goblin27");
        driver.findElement(BUTTON_SIGN_IN_TT_TURK).click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(ALL_CATEGORIES).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();
        driver.findElement(ITEM_NOT_WHOLESALE_NOT_DISCOUNT).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        driver.findElement(MAIN_LOGO).click();
        driver.findElement(CATEGORY_HOME_IMPROVEMENT).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();
        driver.findElement(ITEM_DISCOUNT).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        driver.findElement(MAIN_LOGO).click();
        driver.findElement(CATEGORY_HOME_IMPROVEMENT).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();
        driver.findElement(ITEM_WITH_DISCOUNT_WITH_WHOLESALE).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        System.out.println("ЗАходит");
        String shopCartPage = driver.getCurrentUrl();
        System.out.println(shopCartPage);
        driver.findElement(BUTTON_LOGO_GO_TO_CART).click();
        String inCart = driver.getCurrentUrl();
        System.out.println(inCart);
        driver.findElement(SELECT_ALL_IN_CARD).click();
        System.out.println("galochka");
        driver.findElement(BUTTON_CHECKOUT).click();
        String button_checkout = driver.getCurrentUrl();
        System.out.println(button_checkout);
        driver.findElement(BUTTON_CHECKOUT_FINALLY).click();
        String ButtoncheckoutFinal = driver.getCurrentUrl();
        System.out.println(ButtoncheckoutFinal);
        driver.findElement(INPUT_CREDIT_CARD_NUMBER).sendKeys("4508034508034509");
        driver.findElement(BUTTON_MONTH_ON_CARD).click();
        driver.findElement(BUTTON_YEAR_ON_CARD).click();
        driver.findElement(INPUT_CVC_CODE).sendKeys("000");
        driver.findElement(BUTTON_SUBMIT_CARD).click();

    }



    @Test
    public void addToBasketFullItems() throws InterruptedException {
        driver.findElement(SAVED_SETTINGS).click();
        driver.findElement(AVATAR_LOGO).click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(LOGIN_INPUT).sendKeys("muratkhalilov289@gmail.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("goblin27");
        driver.findElement(BUTTON_SIGN_IN_TT_TURK).click();
        driver.findElement(CATEGORY_HOME_IMPROVEMENT).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();

        WebElement element = driver.findElement(By.xpath("//ul[@class='product__list category-detail__result-list']"));
        int countItems = driver.findElements(FULL_ITEMS_ON_PAGE).size();
        System.out.println(countItems);
        List<WebElement> elementName = driver.findElements(By.xpath("//ul[@class='product__list category-detail__result-list']//li"));
        for (int j = 0; j < elementName.size(); j++) {
            elementName = driver.findElements(By.xpath("//ul[@class='product__list category-detail__result-list']//li"));
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
            driver.navigate().to("https://staging.tt-turk.com/categories/wallpapers-26925");
            for (int i = 2; i > 0; i--) {
                Thread.sleep(1000);
            }
        }
        driver.findElement(BUTTON_LOGO_GO_TO_CART).click();
        String inCart = driver.getCurrentUrl();
        System.out.println(inCart);
        driver.findElement(SELECT_ALL_IN_CARD).click();
        System.out.println("galochka");
        driver.findElement(BUTTON_CHECKOUT).click();
        String button_checkout = driver.getCurrentUrl();
        System.out.println(button_checkout);
        driver.findElement(BUTTON_CHECKOUT_FINALLY).click();
        String ButtoncheckoutFinal = driver.getCurrentUrl();
        System.out.println(ButtoncheckoutFinal);
        driver.findElement(INPUT_CREDIT_CARD_NUMBER).sendKeys("4508034508034509");
        driver.findElement(BUTTON_MONTH_ON_CARD).click();
        driver.findElement(BUTTON_YEAR_ON_CARD).click();
        driver.findElement(INPUT_CVC_CODE).sendKeys("000");
        driver.findElement(BUTTON_SUBMIT_CARD).click();
    }



    @Test
    public void addToBasketDiscountAndDiscountWithWholesaleItems() throws InterruptedException {
        driver.findElement(SAVED_SETTINGS).click();
        driver.findElement(AVATAR_LOGO).click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(LOGIN_INPUT).sendKeys("muratkhalilov289@gmail.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("goblin27");
        driver.findElement(BUTTON_SIGN_IN_TT_TURK).click();
        driver.findElement(CATEGORY_HOME_IMPROVEMENT).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(CATEGORY_WALLPAPERS).click();
        driver.findElement(ITEM_DISCOUNT).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        driver.findElement(MAIN_LOGO).click();
        driver.findElement(CATEGORY_HOME_IMPROVEMENT).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();
        driver.findElement(ITEM_WITH_DISCOUNT_WITH_WHOLESALE).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        System.out.println("ЗАходит");
        String shopCartPage = driver.getCurrentUrl();
        System.out.println(shopCartPage);
        driver.findElement(BUTTON_LOGO_GO_TO_CART).click();
        String inCart = driver.getCurrentUrl();
        System.out.println(inCart);
        driver.findElement(SELECT_ALL_IN_CARD).click();
        System.out.println("galochka");
        driver.findElement(BUTTON_CHECKOUT).click();
        String button_checkout = driver.getCurrentUrl();
        System.out.println(button_checkout);
        driver.findElement(BUTTON_CHECKOUT_FINALLY).click();
        String ButtoncheckoutFinal = driver.getCurrentUrl();
        System.out.println(ButtoncheckoutFinal);
        driver.findElement(INPUT_CREDIT_CARD_NUMBER).sendKeys("4508034508034509");
        driver.findElement(BUTTON_MONTH_ON_CARD).click();
        driver.findElement(BUTTON_YEAR_ON_CARD).click();
        driver.findElement(INPUT_CVC_CODE).sendKeys("000");
        driver.findElement(BUTTON_SUBMIT_CARD).click();
//        driver.close();
    }

    @Test
    public void addToBasketDiscountAndWholesaleItems() throws InterruptedException {
        driver.findElement(SAVED_SETTINGS).click();
        driver.findElement(AVATAR_LOGO).click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(LOGIN_INPUT).sendKeys("muratkhalilov289@gmail.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("goblin27");
        driver.findElement(BUTTON_SIGN_IN_TT_TURK).click();
        driver.findElement(CATEGORY_HOME_IMPROVEMENT).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();
        driver.findElement(ITEM_DISCOUNT).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        driver.findElement(MAIN_LOGO).click();
        driver.findElement(CATEGORY_HOME_IMPROVEMENT).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();
        driver.findElement(ITEM_WITH_WHOLESALE).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        System.out.println("ЗАходит");
        String shopCartPage = driver.getCurrentUrl();
        System.out.println(shopCartPage);
        driver.findElement(BUTTON_LOGO_GO_TO_CART).click();
        String inCart = driver.getCurrentUrl();
        System.out.println(inCart);
        driver.findElement(SELECT_ALL_IN_CARD).click();
        System.out.println("galochka");
        driver.findElement(BUTTON_CHECKOUT).click();
        String button_checkout = driver.getCurrentUrl();
        System.out.println(button_checkout);
        driver.findElement(BUTTON_CHECKOUT_FINALLY).click();
        String ButtoncheckoutFinal = driver.getCurrentUrl();
        System.out.println(ButtoncheckoutFinal);
        driver.findElement(INPUT_CREDIT_CARD_NUMBER).sendKeys("4508034508034509");
        driver.findElement(BUTTON_MONTH_ON_CARD).click();
        driver.findElement(BUTTON_YEAR_ON_CARD).click();
        driver.findElement(INPUT_CVC_CODE).sendKeys("000");
        driver.findElement(BUTTON_SUBMIT_CARD).click();
    }


    @Test
    public void addToBasketEmptyAndWholesaleItems() throws InterruptedException {
        driver.findElement(SAVED_SETTINGS).click();

        driver.findElement(AVATAR_LOGO).click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(LOGIN_INPUT).sendKeys("muratkhalilov289@gmail.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("goblin27");
        driver.findElement(BUTTON_SIGN_IN_TT_TURK).click();
        driver.findElement(CATEGORY_HOME_IMPROVEMENT).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();
       
        driver.findElement(ITEM_NOT_WHOLESALE_NOT_DISCOUNT).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        driver.findElement(MAIN_LOGO).click();
        driver.findElement(CATEGORY_HOME_IMPROVEMENT).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();
       

        driver.findElement(ITEM_WITH_WHOLESALE).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        System.out.println("ЗАходит");
        String shopCartPage = driver.getCurrentUrl();
        System.out.println(shopCartPage);
        driver.findElement(BUTTON_LOGO_GO_TO_CART).click();
        String inCart = driver.getCurrentUrl();
        System.out.println(inCart);
        driver.findElement(SELECT_ALL_IN_CARD).click();
        System.out.println("galochka");
        driver.findElement(BUTTON_CHECKOUT).click();
        String button_checkout = driver.getCurrentUrl();
        System.out.println(button_checkout);
        driver.findElement(BUTTON_CHECKOUT_FINALLY).click();
        String ButtoncheckoutFinal = driver.getCurrentUrl();
        System.out.println(ButtoncheckoutFinal);
        driver.findElement(INPUT_CREDIT_CARD_NUMBER).sendKeys("4508034508034509");
        driver.findElement(BUTTON_MONTH_ON_CARD).click();
        driver.findElement(BUTTON_YEAR_ON_CARD).click();
        driver.findElement(INPUT_CVC_CODE).sendKeys("000");
        driver.findElement(BUTTON_SUBMIT_CARD).click();
    }



    @Test
    public void addToBasketEmptyAndWholesaleDiscountItems() throws InterruptedException {
        driver.findElement(SAVED_SETTINGS).click();
        driver.findElement(AVATAR_LOGO).click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(LOGIN_INPUT).sendKeys("muratkhalilov289@gmail.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("goblin27");
        driver.findElement(BUTTON_SIGN_IN_TT_TURK).click();
        driver.findElement(CATEGORY_HOME_IMPROVEMENT).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();
        driver.findElement(ITEM_NOT_WHOLESALE_NOT_DISCOUNT).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        driver.findElement(MAIN_LOGO).click();
        driver.findElement(CATEGORY_HOME_IMPROVEMENT).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();
        driver.findElement(ITEM_WITH_DISCOUNT_WITH_WHOLESALE).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        System.out.println("ЗАходит");
        String shopCartPage = driver.getCurrentUrl();
        System.out.println(shopCartPage);
        driver.findElement(BUTTON_LOGO_GO_TO_CART).click();
        String inCart = driver.getCurrentUrl();
        System.out.println(inCart);
        driver.findElement(SELECT_ALL_IN_CARD).click();
        System.out.println("galochka");
        driver.findElement(BUTTON_CHECKOUT).click();
        String button_checkout = driver.getCurrentUrl();
        System.out.println(button_checkout);
        driver.findElement(BUTTON_CHECKOUT_FINALLY).click();
        String ButtoncheckoutFinal = driver.getCurrentUrl();
        System.out.println(ButtoncheckoutFinal);
        driver.findElement(INPUT_CREDIT_CARD_NUMBER).sendKeys("4508034508034509");
        driver.findElement(BUTTON_MONTH_ON_CARD).click();
        driver.findElement(BUTTON_YEAR_ON_CARD).click();
        driver.findElement(INPUT_CVC_CODE).sendKeys("000");
        driver.findElement(BUTTON_SUBMIT_CARD).click();
    }

}


