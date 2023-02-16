package Xpath;

import org.openqa.selenium.By;

public class XpathForBasket {




    public static final By SMART_SYSTEM_CATEGORY = By.xpath("//span[contains(text(),'Система сімейного інтелекту')]");
    public static final By SMART_SYSTEM_RADIATOR_CATEGORY = By.xpath("//span[contains(text(),'Розумна система управління температурою')]");
    public static final By PRODUCT_WHO_HAVE_VARIANTS = By.xpath("//div[@class='p-cards__img-wrap']");
    public static final By SECOND_VARIANT_PRODUCT = By.xpath("//span[contains(text(),'1233669554')]");
    public static final By EMPTY_BASKET = By.xpath("//h2[contains(text(),'Кошик порожній')]");
    public static final By YOUR_BASKET_IS_EMPTY = By.xpath("//span[contains(text(),'Додайте товари в кошик, щоб розмістити замовлення')]");
    public static final By SHOP_INFO_CONTAINER = By.xpath("//div[@class='shop__container shop__pay-wrap shop__pay-wrap--cart shop__pay-wrap--empty']");
    public static final By CATEGORY_TEST = By.xpath("//span[contains(text(),'Тест')]");
    public static final By FULL_ITEMS_ON_PAGE = By.xpath("//ul[@class='product__list category-detail__result-list']//li");
    public static final By BUTTON_GO_TO_THREE_PAGE  = By.xpath("//div[@class='dropdown__ico']//select[@class='pagination__hidden-select']//option[3]");
    public static final By BUTTON_GO_TO_FIVE_PAGE  = By.xpath("//div[@class='dropdown__ico']//select[@class='pagination__hidden-select']//option[5]");
    public static final By TWENTY_FIVE_ITEMS_IN_LIST = By.xpath("//ul[@class='product__list category-detail__result-list']//li[25]");
    public static final By YOUR_BASKET_IS_FULL_1 = By.xpath("//div[contains(text(),'Кошик переповнений')]");
    public static final By YOUR_BASKET_IS_FULL_2 = By.xpath("//button[contains(text(),'У кошик')]");
    public static final By YOUR_BASKET_IS_FULL_3 = By.xpath("//button[contains(text(),'Зрозуміло')]");
    public static final By DELETE_SELECT_ITEMS_IN_BASKET = By.xpath("//button[@class='btn--s-xs btn__backgrounded btn__backgrounded--red shop__filters-btn']");
    public final static By INPUT_BUTTON_SELECT_IN_BASKET_1 = By.xpath("//li[1]//div//div[@class='input__checkbox shop__sub-item-checkbox']//input[@class='shop__input-item']");
    public final static By INPUT_BUTTON_SELECT_IN_BASKET_2 = By.xpath("//li[2]//div//div[@class='input__checkbox shop__sub-item-checkbox']//input[@class='shop__input-item']");
    public final static By INPUT_BUTTON_SELECT_IN_BASKET_3 = By.xpath("//li[3]//div//div[@class='input__checkbox shop__sub-item-checkbox']//input[@class='shop__input-item']");
    public final static By INPUT_BUTTON_SELECT_IN_BASKET_4 = By.xpath("//li[4]//div//div[@class='input__checkbox shop__sub-item-checkbox']//input[@class='shop__input-item']");
    public final static By FAVORITE_BUTTON_1 = By.xpath("//li[1]//div//span[contains(text(),'У відкладене')]");
    public final static By FAVORITE_BUTTON_2 = By.xpath("//li[2]//div//span[contains(text(),'У відкладене')]");
    public final static By FAVORITE_BUTTON_3 = By.xpath("//li[3]//div//span[contains(text(),'У відкладене')]");
    public final static By FAVORITE_BUTTON_4 = By.xpath("//li[4]//div//span[contains(text(),'У відкладене')]");
    public final static By PRICE_IN_BASKET_WITHOUT_KARGO  = By.xpath("//div//div[@class='shop__text'][1]//span[@class='t-crop t-crop--one-l']");
    public final static By PRICE_IN_BASKET_JUST_KARGO  = By.xpath("//div//div[@class='shop__text'][2]//span[@class='t-crop t-crop--one-l']");
    public final static By TOTAL_PRICE_IN_BASKET = By.xpath("//div//div[@class='shop__text-wrap shop__text-total-wrap']//span[@class='t-crop t-crop--one-l']");



}
