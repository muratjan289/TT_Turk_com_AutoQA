package Xpath;

import org.openqa.selenium.By;

public class XpathForTtTurk {


    public final static By BANNER = By.xpath("//div[@class='site-container']//div[@class='hero__slider-wrapper']");
    public final static By CHAPTER_HOME_IMPROVMENT_RU = By.xpath("//div[@class='site-container']//span[text()='Обустройство дома']");

    public final static By CATEGORY_HARDWARE_UA = By.xpath("//div[@class='site-container']//a[@href='/ru/categories/hardware-1270']");
    public final static By SORT_PRICE_DESCENDING_UA = By.xpath("//ul[@class='filter-category__inner']//button[contains(text(),'Зниження ціни')]");
    public final static By SORT_BY_DATE_ASCENDING_UA = By.xpath("//ul[@class='filter-category__inner']//button[contains(text(),'Нові надходження')]");
    public final static By SORT_BY_DATE_DESCENDING_UA = By.xpath("//ul[@class='filter-category__inner']//button[contains(text(),'Раніше надійшли')]");
    public final static By SORT_PRICE_ASCENDING_UA = By.xpath("//ul[@class='filter-category__inner']//button[contains(text(),'Ціна за зростанням')]");
    public final static By MAIN_LOGO = By.xpath("//div[@class='header__logo']");
    public final static By AVATAR_LOGO = By.xpath("//div[@class='header__user-nav']//ul//li[@class='header__user-nav-item header__user-nav-item--log-in header__user-nav-item--noti']");
    public final static By LOGIN_INPUT = By.xpath("//div[@class='tab__content tab__content--current']//input[@type='text']");
    public final static By PASSWORD_INPUT = By.xpath("//div[@class='tab__content tab__content--current']//div//input[@class='input__input']");
    public final static By BUTTON_SIGN_IN_TT_TURK = By.xpath("//div[@class='tab__content tab__content--current']//button[@class='button button--c-primary button--s-medium modal__btn']");
    public final static By REGISTRATION_INPUT = By.xpath("//div[@class='modal__content-wrap']//button[@class='tab__btn']");
    public final static By NEW_LOGIN_INPUT = By.xpath("//div[@class='modal__content-wrap']//input[@placeholder='Електронна пошта']");
    public final static By NEW_PASSWORD_INPUT = By.xpath("//div[@class='modal__content-wrap']//input[@placeholder='Пароль']");
    public final static By NEW_PASSWORD_CONFIRM_INPUT = By.xpath("//div[@class='modal__content-wrap']//input[@placeholder='Підтвердження пароля']");
    public final static By BUTTON_AGREE_POLICY = By.xpath("//div[@class='modal__content-wrap']//div//input[@id='agree']");
    public final static By BUTTON_NEW_ACCOUNT_CREATE = By.xpath("//div[@class='modal__content-wrap']//div[@class='modal__btn-wrap']//button[@class='button button--c-primary button--s-medium modal__btn']");

    public final static By BUTTON_AUTHORIZATION_AFTER_REGISTRATION = By.xpath("//div[@class='modal__content-view modal__content-view--second']//div//button[@class='button button--c-primary button--s-medium modal__btn']");

    public final static By BUTTON_SELECT_FIRST_PRODUCT = By.xpath("//div[@class='scroll-list__wrap product__list-wrap']//ul//li//a[1]");
    public final static By BUTTON_ADD_TO_CART = By.xpath("//div[@class='product-d__shop']//div[@class='product-d__buy-btn-wrap']");
    public final static By BUTTON_BUY_RIGHT_NOW = By.xpath("//div[@class='product-d__shop']//a[@class='button button--s-small product-d__buy-now-btn button--c-secondary']");

    public final static By INFO_HOW_PRODUCTS_IN_BASKET = By.xpath("//span[@class='header__user-nav-ico--counter']");
    public final static By BUTTON_GO_TO_CART = By.xpath("//div[@class='product-d__shop']//div[@class='product-d__buy-btn-wrap']//span[2]");
    public final static By BUTTON_MY_ACCOUNT = By.xpath("//li[@class='user__popup-item']//div[@class='user__popup-item-link-wrap']//a[@href]");
    public  final static By INPUT_NAME = By.xpath("//div[@class='site-container']//div[@class]//div//input[@name='receiverFullName']");
    public final static By INPUT_PHONE_NUMBER = By.xpath("//div[@class='site-container']//div[@class='checkout__section-wrap']//div[@class='checkout__form-wrap']//input[@name='receiverPhoneNumber']");
    public final static By INPUT_DELIVERY_ADDRESS = By.xpath("//div[@class='site-container']//div[@class]//input[@name='receiverAddress']");
    public final static By INPUT_DELIVERY_COUNTRY = By.xpath("//div[@class='site-container']//div[@class]//div[@class='v-select vs--single vs--searchable input__input input__v-search input__input--invalid']");
    public final static By INPUT_DELIVERY_CITY = By.xpath("//div[@class='site-container']//div[@class]//div[@class='v-select vs--single vs--searchable input__input input__v-search input__input--invalid']");
    public final static By INPUT_DELIVERY_POSTCODE = By.xpath("//div[@class='site-container']//div[@class]//input[@name='postcode']");
    public final static By BUTTON_DELIVERY_ADDRESS_SAVE = By.xpath("//div[@class='site-container']//div[@class]//button[@class='button button--s-large button--c-primary checkout__form-btn']");
    public final static By ADD_NEW_DELIVERY_ADDRESS = By.xpath("//div[@class='checkout__section-wrap']//a[@class='button button--c-secondary button--s-small']");

    public final static By BUTTON_CHECKOUT = By.xpath("//div[@class='shop__container']//a[@class='button button--s-large button--c-primary shop__order-btn']");
//    public final static By BUTTON_CHECKOUT = By.name("//a[@data-name=\"checkout-button\"]");


    public final static By BUTTON_CHECKOUT_FINALLY = By.xpath("//a[@class='button button--s-large button--c-primary']");

    public final static By CREDIT_CARD_NUMBER = By.xpath("//div[@class='i2mp-formbox i2mp-formbox-withicon']//input[@class='i2mp-form-input']");

    public final static By BUTTON_MAIN_LOGO = By.xpath("//div[@class='header__logo']");
    public final static By BUTTON_SELECT_FIRST_PRODUCT_IN_ADVERTISING = By.xpath("//div[@class='scroll-list__wrap product__list-wrap']//ul//li//a[1]");
    public final static By BUTTON_SELECT_SECOND_PRODUCT_IN_POPULAR_ITEMS = By.xpath("//section[@class='product__section product__section-w-promo product__popular-main-page']//ul[@class='p-cards__inner scroll-list']//li[2]");
    public final static By BUTTON_SELECT_THIRD_PRODUCT_IN_ADVERTISING = By.xpath("//section[@class='product__section product__section-w-promo product__popular-main-page']//ul[@class='p-cards__inner scroll-list']//li[3]");
    public final static By BUTTON_SELECT_FOURTH_PRODUCT_IN_ADVERTISING = By.xpath("//section[@class='product__section product__section-w-promo product__popular-main-page']//ul[@class='p-cards__inner scroll-list']//li[4]");
    public final static By BUTTON_SELECT_FIVE_PRODUCT_IN_ADVERTISING = By.xpath("//section[@class='product__section product__section-w-promo product__popular-main-page']//ul[@class='p-cards__inner scroll-list']//li[5]");

    public final static By BUTTON_LOGO_GO_TO_CART = By.xpath("//div[@class='header__user-nav']//a//div[@class='header__user-nav-ico header__user-nav-ico-wrap']");

    public final static By BUTTON_ON_POPUP = By.xpath("//div[@class='popup popup--shop-cart']//a[@class='button button--s-small button--c-primary shop__popup-btn']");

    public final static By SELECT_ALL_IN_CARD = By.xpath("//div[@class='shop']//input[@id='all']");
    public final static By INPUT_CREDIT_CARD_NUMBER = By.xpath("//div[1]//div[1]//div[1]//input[@id='pan']");
    public final static By BUTTON_MONTH_ON_CARD = By.xpath("//div//select[1]//option[@value='12']");
    public final static By BUTTON_YEAR_ON_CARD = By.xpath("//div//select[1]//option[@value='26']");
    public final static By INPUT_CVC_CODE = By.xpath("//div//div//input[@id='cv2']");
    public final static By BUTTON_SUBMIT_CARD = By.xpath("//div//div//input[@id='btnSbmt']");
    public final static By BUTTON_YES_ACCEPT_PAY = By.xpath("//button[@id='yes']");
    public final static By BUTTON_CAMPANYA_1 = By.xpath("//div[@class='i2mp-row']//div//input[@value='000001']");
    public final static By INFO_YOUR_ORDER_SUCCESS = By.xpath("//h2[contains(text(),'Siparişiniz için teşekkür ederiz')]");
    public final static By INFO_YOUR_ORDER_UNSUCCESSFUL = By.xpath("//div//h2[@class='modal__title t-center modal__title--red']");
    public final static By CATEGORY_HOME_IMPROVEMENT = By.xpath("//div[@class='nav__categories nav__categories--active nav_categories--landing']//span[contains(text(),'Домогосподарство')]");
    public final static By CATEGORY_PAINTING = By.xpath("//div//a[@href='/ua/categories/painting-supplies-and-wall-treatments-1275']");
    public final static By CATEGORY_WALLPAPERS = By.xpath("//div[@class]//a[@href='/ua/categories/wallpapers-26925']");
    public final static By CATEGORY_PAINTING_TR = By.xpath("//div//a[@href='/categories/painting-supplies-and-wall-treatments-1275']");
    public final static By CATEGORY_WALLPAPERS_TR = By.xpath("//div[@class]//a[@href='/categories/wallpapers-26925']");
    public final static By ITEM_DISCOUNT = By.xpath("//div//ul//li[4]//a//div[@class='p-cards__img-wrap']");
    public final static By ITEM_WITH_DISCOUNT_WITH_WHOLESALE = By.xpath("//div//ul//li[2]//a//div[@class='p-cards__img-wrap']");

    public final static By ITEM_WITH_WHOLESALE = By.xpath("//div//ul//li[3]//a//div[@class='p-cards__img-wrap']");
    public final static By ITEM_NOT_WHOLESALE_NOT_DISCOUNT =By.xpath("//div//ul//li[1]//a[@class='p-cards__link p-cards__detail-link']");

    public final static By ITEM_NOT_WHOLESALE_NOT_DISCOUNT_TR =By.xpath("//div//ul//li//a[@href='/product/03d113d1-ffa2-4cf0-ab5b-28efc06800eb?skuId=981664']");
public final static By SAVED_SETTINGS = By.xpath("//div//button[@class='button button--s-small button--c-primary button--m-r-10']");
public final static By AMOUNT_ITEMS_IN_STOCK = By.xpath("//span[@class='product-d__counter-left']");
public final static By INFO_ALERT_YOU_DONT_HAVE_ADDRESS = By.xpath("//div[@class='alert__text']");
public final static By ALL_CATEGORIES = By.xpath("//div//a[@class='nav__categories-header-link']");
public final static By MODAL_WRAP_SIGN_IN = By.xpath("//div[@class='modal__content-wrap']");
    public final static By INPUT_AMOUNT_ITEMS_IN_STOCK = By.xpath("//input[@class='btn__counter-text']");
    public final static By INFO_ALERT_YOR_ORDER_TOO_MUCH = By.xpath("//div[@class='alert__text']");
    public final static By DOLLAR_USD =By.xpath("//span[contains(text(),'USD')]");
    public final static By LOCALIZATION = By.xpath("//a//span[@class='header__top-i18n-toggler']");
    public final static By SIGN_DOLLAR_$_IN_PRICE =By.xpath("//div[@class=\"product-d__price-sub-wrap\"]//span//span[contains(text(),'$')]");
    public final static By WALLPAPERS_BORDER = By.xpath("//li//a[@href=\"/ua/categories/wallpaper-borders-26940\"]");
    public final static By ITEM_LIRA = By.xpath("//div//div//ul//li//a[@href]//div[@class='p-cards__img-wrap']");
    public final static By ICON_BUTTON_ORDERS = By.xpath("//li//span[contains(text(),'Замовлення')]");
    public final static By INFO_SHOP_CART = By.xpath("//div[@class='shop__cart']");












}
