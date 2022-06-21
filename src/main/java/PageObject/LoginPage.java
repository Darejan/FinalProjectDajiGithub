package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement
            authorizationButton = $(".autorizaition_btn"),
            emailInput = $("#login"),
            passwordInput = $("#password"),
            loginButton = $(".sbm_btn"),
            logoutButton = $(byText("გასვლა")),
            confirmAuthorizationButton = $(".autorizaition_btn"),
            validationMessage2 = $(byText("შეყვანილი მონაცემებით მომხმარებელი ვერ მოიძებნა."));



}
