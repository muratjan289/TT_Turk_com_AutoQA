package Xpath;

import org.openqa.selenium.By;

public class XpathForItemDetails {

    public static final By BUTTON_ADD_COMMENT = By.xpath("//div[@class='review__rating']//div");
    public static final By BUTTON_VUE_STAR_RATING = By.xpath("//div[@class='vue-star-rating']//span[@class='vue-star-rating-pointer vue-star-rating-star']");
    public static final By INFO_YOUR_RATING_FOR_ITEMS = By.xpath("//span[contains(text(),'Як би ви оцінили продукт')]");
    public static final By FILL_COMMENT_ONE = By.xpath("//button[@class='modal__close-btn']");
    public static final By FILL_COMMENT_TWO = By.xpath("//textarea[@name='disadvantages']");
    public static final By FILL_COMMENT_THREE = By.xpath("//textarea[@name='comment']");
    public static final By SUBMIT_COMMENT = By.xpath("//button[@class='button button--s-large button--c-primary modal__product-review--btn']");

}
