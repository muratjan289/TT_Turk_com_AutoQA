import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.*;

import java.time.Duration;

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
        driver.get("https://k8s-staging.tt-turk.com/ua");
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
       ;
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
        try {
            driver.findElement(BUTTON_CAMPANYA_1).click();
        }catch (NoSuchElementException e){
            System.out.println("BUTTON_CAMPANYA_1 не нашелся");
        }
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
        try {
            driver.findElement(BUTTON_CAMPANYA_1).click();
        }catch (NoSuchElementException e){
            System.out.println("BUTTON_CAMPANYA_1 не нашелся");
        }
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
        try {
            driver.findElement(BUTTON_CAMPANYA_1).click();
        }catch (NoSuchElementException e){
            System.out.println("BUTTON_CAMPANYA_1 не нашелся");
        }

        try {
            driver.findElement(BUTTON_SUBMIT_CARD).click();
        }catch (NoSuchElementException e){
            System.out.println("BUTTON_SUBMIT_CARD не нашелся");
        }

        for (int i = 12; i > 0; i--) {

            Thread.sleep(1000);
        }
        try {
            driver.findElement(BUTTON_YES_ACCEPT_PAY).click();
        }
        catch (NoSuchElementException e) {
            System.out.println("No such BUTTON_CAMPANYA_1 ");
        }
        for (int i = 12; i > 0; i--) {

            Thread.sleep(1000);
        }
        try {
            driver.findElement(INFO_YOUR_ORDER_SUCCESS);
            System.out.println("ВАША ПОКУПКА ОПЛАЧЕНА ПОЗДРАВЛЯЕМ");
        }
        catch (NoSuchElementException e) {
            System.out.println(" НЕ ПОЛУЧИЛАСЬ  ПЕРВАЯ ПОПЫТКА ");
        }
        try {
            driver.findElement(INFO_YOUR_ORDER_UNSUCCESSFUL);
            System.out.println("ПРОИЗОШЛА ОШИБКА ПРИ ОПЛАТЕ");
        }
        catch (NoSuchElementException e) {
            System.out.println(" ПОКУПКА СКОРЕЕ ВСЕГО ПОЛУЧИЛАСЬ ");
        }
//        driver.close();
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
        driver.findElement(MAIN_LOGO).click();
        driver.findElement(CATEGORY_HOME_IMPROVEMENT).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();
        driver.findElement(ITEM_NOT_WHOLESALE_NOT_DISCOUNT).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_CHECKOUT).click();
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


