package Tests;

import StepObject.RegistrationSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.RegistrationData.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationTests extends ChromeRunner {
    @Test
    @Description("register with already existing data")
    public void registrationExistingData(){
        RegistrationSteps steps3 = new RegistrationSteps();
        steps3
                .goToAuthorizationPage()
                .chooseRegistrationButton()
                .nameFill(firstnameData)
                .lastNameFill(lastnameData)
                .emailFill(emailData)
                .confirmEmailFill(repeateEmailData)
                .passwordFill(passwordData)
                .confirmPasswordFill(repeatPasswordData)
                .mobileFill(mobileData);
        WebDriver driver = com.codeborne.selenide.WebDriverRunner.getWebDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#tab1_content > div > form > div.check_box.contract_checkbox.mb-4 > label').click()");
        sleep(1000);
        steps3
                .registrationAction();
        Assert.assertTrue(steps3.validationMessage.exists());
        sleep(1000);
    }

    @Test
    public void checkRegistrationPage(){
        RegistrationSteps steps4 = new RegistrationSteps();
        steps4
                .goToAuthorizationPage();
        back();
        forward();
        steps4
                .chooseRegistrationButton();
                Assert.assertTrue(steps4.registrationButton.isDisplayed());
                sleep(1000);
    }
}
