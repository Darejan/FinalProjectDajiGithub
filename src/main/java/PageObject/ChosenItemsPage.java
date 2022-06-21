package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class ChosenItemsPage {
    public SelenideElement
            menuItem1 = $("#category_300"),
            authorizationButton = $(".autorizaition_btn"),
            emailInput = $("#login"),
            passwordInput = $("#password"),
            loginButton = $(".sbm_btn"),
            cartButton = $(byXpath("/html/body/header/div/div/div[1]/div[2]/div[2]")),
            emptyCart = $(byText("კალათა ცარიელია")),
            firstElement = $(".deal_statistics",0),
            days = $("#combined_qty_up"),
            adults = $("#adults_qty"),
            hotel = $(byXpath("/html/body/main/section[2]/div/div/div[1]/div/div[2]/div[1]/form/button")),
            removeItem = $(".fa-times");


}
