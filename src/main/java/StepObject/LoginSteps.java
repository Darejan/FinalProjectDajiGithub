package StepObject;

import PageObject.LoginPage;
import io.qameta.allure.Step;

public class LoginSteps extends LoginPage {
    @Step("go to authorization page")
    public LoginSteps goToAuthorizationPage(){
        authorizationButton.click();
        return this;
    }

    @Step("email is - {email}")
    public LoginSteps emailFill(String email){
        emailInput.setValue(email);
        return this;
    }

    public LoginSteps passwordFill(String password){
        passwordInput.setValue(password);
        return this;
    }

    public LoginSteps loginAction(){
        loginButton.click();
        return this;
    }

    public LoginSteps logoutAction(){
        logoutButton.click();
        return this;
    }

    public LoginSteps getValidationMessage2(){
        validationMessage2.getText();
        return this;
    }

    public LoginSteps getAuthorizationText(){
        authorizationButton.getText();
        return this;
    }
}
