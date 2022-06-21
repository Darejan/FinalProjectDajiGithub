package Tests;

import StepObject.LoginSteps;
import Utils.ChromeRunner;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Description;

import static DataObject.LoginData.*;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginTests extends ChromeRunner {
    @Test
    @Description("login with correct data and logout")
    public void loginCorrectData(){
        LoginSteps steps1 = new LoginSteps();
        steps1
                .goToAuthorizationPage()
                .emailFill(emailData)
                .passwordFill(correctPasswordData)
                .loginAction();
        //Assert.assertTrue(steps1.confirmAuthorizationButton.isDisplayed());
        Assert.assertEquals(steps1.confirmAuthorizationButton.getText(),userNameData);
        steps1
                .logoutAction();
        sleep(1000);
    }


    @Test
    @Description("login with incorrect data")
    public void loginIncorrectData(){
        LoginSteps steps2 = new LoginSteps();
        steps2
             .goToAuthorizationPage()
             .emailFill(emailData)
             .passwordFill(passwordData)
             .loginAction();
             //.getValidationMessage2();
        //Assert.assertTrue(steps.validationMessage2.isDisplayed());
        Assert.assertEquals(validationMessage1,steps2.validationMessage2.getText());
        sleep(1000);
    }
}
