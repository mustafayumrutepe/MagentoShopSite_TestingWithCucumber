package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorPage extends Parent{
    public LocatorPage() {PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(xpath = "(//*[text()='Create an Account'])[1]")        private WebElement createAnAccount;
    @FindBy(id = "firstname")                                      private WebElement firstname;
    @FindBy(id = "lastname")                                       private WebElement lastname;
    @FindBy(id = "email_address")                                  private WebElement email;
    @FindBy(id = "password")                                       private WebElement password;
    @FindBy(id = "password-confirmation")                          private WebElement confirmPassword;
    @FindBy(xpath = "//*[@class='action submit primary']")         private WebElement createAnAccountButton;
    @FindBy(xpath = "//*[@role='alert']")                          private WebElement verifying;
    @FindBy(xpath = "//*[@class='authorization-link']")            private WebElement Signin;
    @FindBy(name = "login[username]")                              private WebElement Email;
    @FindBy(name = "login[password]")                              private WebElement Password;
    @FindBy(xpath = "//*[@class='action login primary']")          private WebElement SigninButton;
    @FindBy(xpath = "(//*[text()='Welcome, Jacob James!'])[1]")    private WebElement JacopJames;
    @FindBy(xpath = "(//*[@class='action switch'])[1]")            private WebElement Action_switch;
    @FindBy(xpath = "((//*[@class='customer-menu'])[1]/ul/li)[1]") private WebElement MyAccount;
    @FindBy(xpath = "//*[text()='Manage Addresses']")              private WebElement ManageAddresses;
    @FindBy(xpath = "//*[@id='company']")                          private WebElement Company;
    @FindBy(xpath = "//*[@id='telephone']")                        private WebElement telephone;
    @FindBy(xpath = "//*[@id='street_1']")                         private WebElement street_1;
    @FindBy(xpath = "//*[@id='city']")                             private WebElement city;
    @FindBy(xpath = "//*[@id='country']")                          private WebElement country_Select;
    @FindBy(xpath = "//*[@id='zip']")                              private WebElement zip;
    @FindBy(xpath = "//*[text()='Save Address']")                  private WebElement Save_Address;
    @FindBy(xpath = "//*[@id='region_id']")                        private WebElement region_Select;


    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "createAnAccount"      : return this.createAnAccount;
            case "firstname"            : return this.firstname;
            case "lastname"             : return this.lastname;
            case "email"                : return this.email;
            case "password"             : return this.password;
            case "confirmPassword"      : return this.confirmPassword;
            case "createAnAccountButton": return this.createAnAccountButton;
            case "verifying"            : return this.verifying;
            case "Signin"               : return this.Signin;
            case "Email"                : return this.Email;
            case "Password"             : return this.Password;
            case "SigninButton"         : return this.SigninButton;
            case "JacopJames"           : return this.JacopJames;
            case "Action_switch"        : return this.Action_switch;
            case "MyAccount"            : return this.MyAccount;
            case "ManageAddresses"      : return this.ManageAddresses;
            case "Company"              : return this.Company;
            case "telephone"            : return this.telephone;
            case "street_1"             : return this.street_1;
            case "city"                 : return this.city;
            case "zip"                  : return this.zip;
            case "Save_Address"         : return this.Save_Address;
            case "country_Select"       : return this.country_Select;
            case "region_Select"        : return this.region_Select;
        }
        return null;

    }

}
