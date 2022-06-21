package StepObject;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class RegistrationSteps extends RegistrationPage {
    @Step("go to authorization page")
    public RegistrationSteps goToAuthorizationPage(){
        authorizationButton.click();
        return this;
    }

    @Step("click on registration button")
    public RegistrationSteps chooseRegistrationButton(){
        registrationButton.click();
        return this;
    }

    public RegistrationSteps nameFill(String Name){
        firstNameInput.setValue(Name);
        return this;
    }

    public RegistrationSteps lastNameFill(String LastName){
        lastNameInput.setValue(LastName);
        return this;
    }

    public RegistrationSteps emailFill(String Email){
        emailInput.setValue(Email);
        return this;
    }

    public RegistrationSteps confirmEmailFill(String ConfirmEmail){
        confirmEmailInput.setValue(ConfirmEmail);
        return this;
    }

    public RegistrationSteps passwordFill(String Password){
        passwordInput.setValue(Password);
        return this;
    }

    public RegistrationSteps confirmPasswordFill(String ConfirmPassword){
        confirmPasswordInput.setValue(ConfirmPassword);
        return this;
    }

    public RegistrationSteps mobileFill(String Mobile){
        mobileInput.setValue(Mobile);
        return this;
    }

    public RegistrationSteps checkCapture(){
        checkboxCapture.is(Condition.checked);
        return this;
    }

    public RegistrationSteps registrationAction(){
        registrationButton2.click();
        return this;
    }

}
