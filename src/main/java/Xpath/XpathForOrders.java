package Xpath;

import org.openqa.selenium.By;

public class XpathForOrders {

    public final static By ORDER_ITEM = By.xpath("//li[@class='orders__item']");
    public final static By BUTTON_SAVED_SETTINGS_LOCALIZATION = By.xpath("//button[@class='button button--s-medium button--c-primary']");
    public final static By ORDER_LIST = By.xpath("//ul[@class='orders__list']");
    public final static By ORDER_DETAILS = By.xpath("//li[1]//a[@class='link link--blue button--c-secondary']");
    public final static By NUMBER_ORDER = By.xpath("//span[contains(text(),'0')]");
    public final static By ORDER_LIST_IN_ORDER_DETAILS = By.xpath("//div[@class='order-details__order-list order-details__list-wrap']");
    public final static By SHOP_CONTAINER = By.xpath("//div[@class='shop__container']");
    public final static By INPUT_SEARCH_ORDER = By.xpath("//input[@class='input__search']");
    public final static By BUTTON_SEARCH_ORDER = By.xpath("//button[@class='input__search-btn']");
    public final static By NO_SUCH_ANY_ORDERS = By.xpath("//h2[contains(text(),'Немає замовлень')]");
    public final static By BUTTON_PAID_ORDERED = By.xpath("//li[5]//a[@class='tab__nav-link']");
    public final static By PAID_ORDERED_UA = By.xpath("//div[@class='orders__col--2 orders__sub-item-status']//span[contains(text(),'Оплачені')]");
    public final static By BUTTON_THE_NEXT_PAGE_ORDERS = By.xpath("//span[@class='pagination__control-word']");

}
