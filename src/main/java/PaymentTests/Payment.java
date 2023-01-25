import org.apache.commons.lang3.RandomStringUtils;
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

import static Xpath.XpathForTtTurk.*;
import static Xpath.XpathForTtTurk.BUTTON_SUBMIT_CARD;

public class Payment {


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
//        driver.close();

    }



    @Test
    public void BuyItemAndCheckCountOnStock() throws InterruptedException {
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
        WebElement element = driver.findElement( By.xpath("//span[@class='product-d__counter-left']"));
        String OldCount = element.getText();
        int  gg0=Integer.parseInt(OldCount.replaceAll("\\D+",""));
        System.out.println(OldCount);
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
        System.out.println("ДО ПРОЦЕССА ОПЛАТЫ ТЕСТ ДОШЕЛ УЖЕ ЖИТЬ ЛЕГЧЕ");
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

        try {
           waitElementIsVisible(driver.findElement(BUTTON_YES_ACCEPT_PAY));
           driver.findElement(BUTTON_YES_ACCEPT_PAY).click();
        }
        catch (NoSuchElementException e) {
            System.out.println("No such BUTTON_YES ");
        }
        for (int i = 12; i > 0; i--) {

            Thread.sleep(1000);
        }


            driver.findElement(INFO_YOUR_ORDER_SUCCESS);
            System.out.println("ВАША ПОКУПКА ОПЛАЧЕНА ПОЗДРАВЛЯЕМ");
        driver.navigate().to("https://k8s-staging.tt-turk.com/ua");
            driver.findElement(ALL_CATEGORIES).click();

            driver.findElement(CATEGORY_PAINTING).click();
            driver.findElement(CATEGORY_WALLPAPERS).click();
            driver.findElement(ITEM_NOT_WHOLESALE_NOT_DISCOUNT).click();


        WebElement element2 = driver.findElement( By.xpath("//span[@class='product-d__counter-left']"));
            String CountNew = element2.getText();
            System.out.println(CountNew);
        int  gg=Integer.parseInt(CountNew.replaceAll("\\D+",""));


        if (gg<gg0){
            System.out.println("Товар со склада вычитался все нормально товар списался со склада");
        }else {
            System.out.println("БЕДА ребят  у нас проблемы товар со склада не списался");
        }
    }
    @Test
    public void goBackFromThePaymantPage() throws InterruptedException {
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
        for (int i = 7; i > 0; i--) {
            Thread.sleep(1000);
        }
       driver.navigate().back();
       String buttonCheckout2 = driver.getCurrentUrl();
        String productCounter = String.valueOf(AMOUNT_ITEMS_IN_STOCK);
       if(buttonCheckout2.equals(ButtoncheckoutFinal)){
           System.out.println("C Этим тестом проблем нет ");
       }
    }

    @Test
    public void NewUserTryBuyItemWholeAdress(){
        driver.findElement(AVATAR_LOGO).click();
        driver.findElement(REGISTRATION_INPUT).click();
        String newEmailRandom = RandomStringUtils.randomAlphabetic(6,12) + "@mail.ru";
        String password = "refdr25";
        driver.findElement(NEW_LOGIN_INPUT).sendKeys(newEmailRandom);
        driver.findElement(NEW_PASSWORD_INPUT).sendKeys(password);
        driver.findElement(NEW_PASSWORD_CONFIRM_INPUT).sendKeys(password);
        driver.findElement(BUTTON_AGREE_POLICY).click();
        driver.findElement( BUTTON_NEW_ACCOUNT_CREATE).click();
        driver.findElement(BUTTON_AUTHORIZATION_AFTER_REGISTRATION).click();
        driver.findElement(LOGIN_INPUT).sendKeys(newEmailRandom);
        driver.findElement(PASSWORD_INPUT).sendKeys("refdr25");
        driver.findElement(BUTTON_SIGN_IN_TT_TURK).click();
        driver.findElement(BUTTON_SELECT_SECOND_PRODUCT_IN_POPULAR_ITEMS).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        driver.findElement(BUTTON_CHECKOUT).click();
        driver.findElement(INFO_ALERT_YOU_DONT_HAVE_ADDRESS);
        System.out.println("Тест на создание заказа без адресса работает как надо");
    }


    @Test
    public void NewUserTryingToBuyItemWholeAuthorization(){

        driver.findElement(BUTTON_SELECT_SECOND_PRODUCT_IN_POPULAR_ITEMS).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        driver.findElement(BUTTON_CHECKOUT).click();
        driver.findElement(MODAL_WRAP_SIGN_IN);
    }

    @Test
    public void TryingToBuyMoreItemsThanWhatIsAvailable() throws InterruptedException {
        driver.findElement(SAVED_SETTINGS).click();
        driver.findElement(AVATAR_LOGO).click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.findElement(LOGIN_INPUT).sendKeys("muratkhalilov289@gmail.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("goblin27");
        driver.findElement(BUTTON_SIGN_IN_TT_TURK).click();
        driver.findElement(BUTTON_SELECT_SECOND_PRODUCT_IN_POPULAR_ITEMS).click();
        driver.findElement(INPUT_AMOUNT_ITEMS_IN_STOCK).sendKeys("5000");
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        driver.findElement(BUTTON_LOGO_GO_TO_CART).click();
        driver.findElement(SELECT_ALL_IN_CARD).click();
        driver.findElement(BUTTON_CHECKOUT).click();
        driver.findElement(BUTTON_CHECKOUT_FINALLY).click();
        for (int i = 7; i > 0; i--) {
            Thread.sleep(1000);
        }
        driver.findElement(INFO_ALERT_YOR_ORDER_TOO_MUCH);

    }

    @Test
    public void ToBuyItemsInLiraAndDollar(){
        driver.findElement(LOCALIZATION).click();
        driver.findElement(DOLLAR_USD);
        driver.navigate().to("https://k8s-staging.tt-turk.com/ua/product/de11a273-2ea7-4546-8a43-cc89686a4b88?skuId=1060701");
        driver.findElement(SIGN_DOLLAR_$_IN_PRICE);
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(MAIN_LOGO).click();
        driver.findElement(ALL_CATEGORIES).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(WALLPAPERS_BORDER).click();
        driver.findElement(ITEM_LIRA).click();
        driver.findElement(SIGN_DOLLAR_$_IN_PRICE);

    }

    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }






}
