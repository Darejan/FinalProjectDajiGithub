package Tests;

import StepObject.ChosenItemsSteps;
import StepObject.LoginSteps;
import Utils.ChromeRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.LoginData.*;
import static com.codeborne.selenide.Selenide.sleep;

public class ChosenItemsTests extends ChromeRunner {
    @Test
    public void checkCart(){
        ChosenItemsSteps steps5 = new ChosenItemsSteps();
        LoginSteps steps6 = new LoginSteps();
        steps6
                .goToAuthorizationPage()
                .emailFill(emailData)
                .passwordFill(correctPasswordData)
                .loginAction();
        steps5
                .goToCart();
        Assert.assertTrue(steps5.emptyCart.isDisplayed());
        steps5
                .choseMenuItem()
                .choseFirstElement();
        sleep(2000);
        steps5
                .choseDays()
                .choseDays()
                .choseDays()
                .choseDays()
                .choseAdults();
        sleep(2000);
        steps5
                .choseHotel();
        sleep(2000);
        Assert.assertFalse(steps5.emptyCart.isDisplayed());
        sleep(5000);
        steps6
                .goToAuthorizationPage()
                .logoutAction();
        sleep(1000);
    }

    @Test
    public void clearCart(){
        ChosenItemsSteps steps5 = new ChosenItemsSteps();
        LoginSteps steps6 = new LoginSteps();
        steps6
                .goToAuthorizationPage()
                .emailFill(emailData)
                .passwordFill(correctPasswordData)
                .loginAction();
        steps5
                .goToCart();
        Assert.assertFalse(steps5.emptyCart.isDisplayed());
        steps5
                .removeItemFromCart();
        Assert.assertTrue(steps5.emptyCart.isDisplayed());
        steps6
                .goToAuthorizationPage()
                .logoutAction();
        sleep(1000);
        Assert.assertNotEquals(steps6.authorizationButton.getText(),userNameData);
        sleep(1000);
    }
}
