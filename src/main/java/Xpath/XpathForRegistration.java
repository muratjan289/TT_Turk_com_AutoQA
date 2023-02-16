package Xpath;

import org.openqa.selenium.By;

public class XpathForRegistration {

    public final static By EMAIL_DOES_NOT_EXIST = By.xpath("//div[contains(text(),'Електронна пошта недійсна')]");
    public final static By FIRST_PASSWORD_ERROR = By.xpath("//div[contains(text(),'Пароль повинен містити не менше 6 і не більше 50 символів, латинські літери та цифри')]");
    public final static By SECOND_PASSWORD_ERROR = By.xpath("//div[contains(text(),'Введені паролі не співпадають')]");
    public final static By LINK_TO_COOKIE = By.xpath("//span[contains(text(),'Реєструючись на TTTurk, ви погоджуєтеся з')]//a[contains(text(),'Політика cookie')]");
    public final static By LINK_TO_POLITIC_PRIVACY = By.xpath("//span[contains(text(),'Реєструючись на TTTurk, ви погоджуєтеся з')]//a[contains(text(),'Політика конфіденційності')]");
    public final static By COOKIE_INFO_ON_THE_PAGE = By.xpath("//h1[contains(text(),'Політика Cookie')]");
    public final static By POLITIC_PRIVACY_ON_THE_PAGE = By.xpath("//h1[contains(text(),'Політика конфіденційності')]");
    public final static By WRONG_EMAIL_OR_PASSWORD = By.xpath("//div[contains(text(),'Неправильний логін або пароль. Повторіть спробу')]");
    public final static By BUTTON_ADD_TO_FAVORITES_PRODUCTS = By.xpath("//span[contains(text(),'У відкладене')]");
    public final static By BUTTON_CLOSE_AUTHORIZATION_WINDOW = By.xpath("//button[@class='modal__close-btn']");
    public final static By ICON_FAVORITE_ITEMS = By.xpath("//ul//li[4]//a[@class='header__user-nav-link']");







}