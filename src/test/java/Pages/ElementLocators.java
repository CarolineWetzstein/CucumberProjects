package Pages;

import Utilities.MyMethods;
import Utilities.ParameterDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementLocators extends MyMethods {
    public ElementLocators() {
        PageFactory.initElements(ParameterDriver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement registerLink;

    @FindBy(id = "customer.firstName")
    public WebElement firstName;

    @FindBy(id = "customer.lastName")
    public WebElement lastName;

    @FindBy(id = "customer.address.street")
    public WebElement addressLine;

    @FindBy(id = "customer.address.city")
    public WebElement cityLine;

    @FindBy(id = "customer.address.state")
    public WebElement stateLine;

    @FindBy(id = "customer.address.zipCode")
    public WebElement zipCodeLine;

    @FindBy(id = "customer.phoneNumber")
    public WebElement phoneLine;

    @FindBy(id = "customer.ssn")
    public WebElement ssnLine;

    @FindBy(id = "customer.username")
    public WebElement userName;

    @FindBy(id = "customer.password")
    public WebElement passWord;

    @FindBy(id = "repeatedPassword")
    public WebElement passwordConfirm;

    @FindBy(xpath = "//input[@value='Register']")
    public WebElement registerButton;

    @FindBy(xpath= "//p[contains(text(),'successfully')]")
    public WebElement successMessage1;

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(className = "button")
    public WebElement loginButton;

    @FindBy(xpath = "//a[text()='Log In']")
    public WebElement loginLink;

    @FindBy(xpath = "//a[text()='Bill Pay']")
    public WebElement billPayLink;

    @FindBy(css = "input[name='payee.name']")
    public WebElement payeeName;

    @FindBy(css = "input[name='payee.address.street']")
    public WebElement addressInput;

    @FindBy(css = "input[name='payee.address.city']")
    public WebElement cityInput;

    @FindBy(css = "input[name='payee.address.state']")
    public WebElement stateInput;
    @FindBy(css = "input[name='payee.address.zipCode']")
    public WebElement zipCodeInput;
    @FindBy(css = "input[name='payee.phoneNumber']")
    public WebElement phoneNumber;
    @FindBy(css = "input[name='payee.accountNumber']")
    public WebElement accountNumber;
    @FindBy(css = "input[name='verifyAccount']")
    public WebElement verifyAccount;

    @FindBy(css = "input[name='amount']")
    public WebElement amount;

    @FindBy(css = "input[name='fromAccountId']")
    public WebElement fromAccountId;
    @FindBy(xpath = "//a[@value='Send Payment']")
    public WebElement sendPayment;

}
