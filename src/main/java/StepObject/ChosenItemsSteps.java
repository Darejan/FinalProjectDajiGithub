package StepObject;

import PageObject.ChosenItemsPage;
import io.qameta.allure.Step;

public class ChosenItemsSteps extends ChosenItemsPage {

    public ChosenItemsSteps goToAuthorizationPage(){
        authorizationButton.click();
        return this;
    }

    @Step("email is - {email}")
    public ChosenItemsSteps emailFill(String email){
        emailInput.setValue(email);
        return this;
    }

    public ChosenItemsSteps passwordFill(String password){
        passwordInput.setValue(password);
        return this;
    }

    public ChosenItemsSteps loginAction() {
        loginButton.click();
        return this;
    }

    public ChosenItemsSteps goToCart(){
        cartButton.click();
        return this;
    }

    public ChosenItemsSteps choseMenuItem(){
        menuItem1.click();
        return this;
    }

    public ChosenItemsSteps choseFirstElement(){
        firstElement.click();
        return this;
    }

    public ChosenItemsSteps choseDays(){
        days.click();
        return this;
    }

    public ChosenItemsSteps choseAdults(){
        adults.setValue("3");
        return this;
    }

    public ChosenItemsSteps choseHotel(){
        hotel.click();
        return this;
    }

    public ChosenItemsSteps removeItemFromCart(){
        removeItem.click();
        return this;
    }
}
