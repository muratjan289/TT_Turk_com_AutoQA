package Orders;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static Xpath.XpathForOrders.*;
import static Xpath.XpathForTtTurk.*;

public class Orders {
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


    @Test
    public void viewOrderList() {
        driver.findElement(ICON_BUTTON_ORDERS).click();
        driver.findElement(INFO_SHOP_CART);
        driver.findElement(ORDER_LIST);
        waitElementIsVisible(driver.findElement(ORDER_ITEM));
        int countOrder = driver.findElements(ORDER_ITEM).size();
        Assert.assertEquals(countOrder, 5);
        driver.findElement(INFO_SHOP_CART);
    }


    @Test
    public void viewOrderDetails() {
        driver.findElement(ICON_BUTTON_ORDERS).click();
        WebElement element2 = driver.findElement(By.xpath("//div//ul//li[1]//div//div//div//div[@class='orders__item-header-order-info-text']"));
        String CountNew = element2.getText();
        System.out.println(CountNew);
        int gg = Integer.parseInt(CountNew.replaceAll("\\D+", ""));
        driver.findElement(ORDER_DETAILS).click();
        WebElement element3 = driver.findElement(By.xpath("//div[@class='order-details__info-column'][1]//div[@class='order-details__info-row'][2]//span[@class='order-details__info-value']"));
        String NumberDetail = element3.getText();
        System.out.println(NumberDetail);
        int ggg = Integer.parseInt(NumberDetail.replaceAll("\\D+", ""));
        if (gg == ggg) {
            System.out.println("НОРМАЛЬНО ВСЁ ПЕРЕХОДИТ ПО НОМЕРУ ЗАКАЗА");
        } else {
            System.out.println("ПРОИЗОШЛА КАКАЯ ТО ХУЙНЯ ОН ПЕРЕШЕЛ НЕ ТУДА ");

        }
        driver.findElement(ORDER_LIST_IN_ORDER_DETAILS);
        driver.findElement(SHOP_CONTAINER);
        System.out.println("ТЕСТ НА ДЕТАЛИ ЗАКАЗА ОТРАБОТАЛ КАК НАДО");
    }

    @Test
    public void searchOrderOnNumber() {
        driver.findElement(ICON_BUTTON_ORDERS).click();
        driver.findElement(INPUT_SEARCH_ORDER).sendKeys("50250");
        driver.findElement(BUTTON_SEARCH_ORDER).click();
        WebElement element = driver.findElement(By.xpath("//div//ul//li[1]//div//div//div//div[@class='orders__item-header-order-info-text']"));
        String NumberOfOrder = element.getText();
        System.out.println(NumberOfOrder);
        int gg = Integer.parseInt(NumberOfOrder.replaceAll("\\D+", ""));
        int NumberToSearch = 50250;
        if (gg == NumberToSearch) {
            System.out.println("ТЕСТ НА ПОИСК РАБОТАЕТ ОТЛИЧНО ЕДЕМ ДАЛЬШЕ БРАТУХА");
        } else {
            System.out.println("ERROR ОШИБКА НАДО ЧТО-ТО ДЕЛАТЬ С ЭТИМ");
        }
        driver.findElement(ORDER_ITEM);
//         waitElementIsVisible(driver.findElement(ORDER_ITEM));
//         int countOrder = (int) driver.findElements(ORDER_ITEM).stream().count();
//         Assert.assertEquals(countOrder,1);
    }

    @Test
    public void searchNoSuchOrder() {
        driver.findElement(ICON_BUTTON_ORDERS).click();
        driver.findElement(INPUT_SEARCH_ORDER).sendKeys("50002508");
        driver.findElement(BUTTON_SEARCH_ORDER).click();
        driver.findElement(NO_SUCH_ANY_ORDERS);
        try {
            driver.findElement(ORDER_LIST);
        } catch (NoSuchElementException e) {
            System.out.println("Все заебись все рабоатет");
        }
    }
@Test
    public void checkFilterStatus() {
        driver.findElement(ICON_BUTTON_ORDERS).click();
        driver.findElement(BUTTON_PAID_ORDERED).click();
//        waitElementIsVisible(driver.findElement(ORDER_ITEM));
         int countOrder = (int) driver.findElements(ORDER_ITEM).stream().count();
         Assert.assertEquals(countOrder,5);
         driver.findElement(ORDER_LIST);
         driver.findElement(ORDER_DETAILS);
        waitElementIsVisible(driver.findElement(PAID_ORDERED_UA));
        int countOrderPaid = (int) driver.findElements(PAID_ORDERED_UA).stream().count();
        Assert.assertEquals(countOrderPaid,5);

    }

    @Test
    public void checkThePaginationInOrders(){
        driver.findElement(ICON_BUTTON_ORDERS).click();
        driver.findElement(BUTTON_THE_NEXT_PAGE_ORDERS).click();
        String secondPage = driver.getCurrentUrl();
        String secondPage1 = "https://k8s-staging.tt-turk.com/ua/orders?status=&page=2";
        Assert.assertEquals(secondPage1, secondPage);
        driver.findElement(ORDER_LIST);
        driver.findElement(ORDER_ITEM);
        waitElementIsVisible(driver.findElement(ORDER_ITEM));
        int countOrder = (int) driver.findElements(ORDER_ITEM).stream().count();
        Assert.assertEquals(countOrder,5);
    }

    @Test
    public void checkPaginationAndFilters(){
        driver.findElement(ICON_BUTTON_ORDERS).click();
        driver.findElement(BUTTON_THE_NEXT_PAGE_ORDERS).click();
        String secondPage = driver.getCurrentUrl();
        String secondPage1 = "https://k8s-staging.tt-turk.com/ua/orders?status=&page=2";
        Assert.assertEquals(secondPage1, secondPage);
        driver.findElement(BUTTON_PAID_ORDERED).click();
        String FirstPage = driver.getCurrentUrl();
        String FirstPage1 = "https://k8s-staging.tt-turk.com/ua/orders?status=PAID&page=1";
        Assert.assertEquals(FirstPage,FirstPage1);
        waitElementIsVisible(driver.findElement(ORDER_ITEM));
        int countOrder = (int) driver.findElements(ORDER_ITEM).stream().count();
        Assert.assertEquals(countOrder,5);

        waitElementIsVisible(driver.findElement(PAID_ORDERED_UA));
        int countOrderPaid = (int) driver.findElements(PAID_ORDERED_UA).stream().count();
        Assert.assertEquals(countOrderPaid,5);



    }

}


