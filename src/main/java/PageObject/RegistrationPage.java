package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    public SelenideElement
           authorizationButton = $(".autorizaition_btn"),
           registrationButton = $("#tab1"),
           firstNameInput = $(".password_block",0).$(byName("firstname")),
           lastNameInput = $(".password_block",1).$(byName("lastname")),
           emailInput = $(".register_items",1).$(byName("email")),
           confirmEmailInput = $(".register_items",2).$(byName("username")),
           passwordInput = $(".password_block",2).$(byName("password")),
           confirmPasswordInput = $(".password_block",3).$(byName("password_confirmation")),
           mobileInput = $(".register_items",4).$(byName("mobile")),
           checkboxCapture = $(byXpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]")),
           registrationButton2 = $(".physical-btn"),
           validationMessage = $(byText("შეყვანილი ელ.ფოსტა უკვე გამოყენებულია."));


}
