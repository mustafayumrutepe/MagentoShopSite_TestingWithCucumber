package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorPage extends Parent{
    public LocatorPage() {PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(xpath = "(//*[text()='Create an Account'])[1]")
    private WebElement createAnAccount;
    @FindBy(id = "firstname")
    private WebElement firstname;
    @FindBy(id = "lastname")
    private WebElement lastname;
    @FindBy(id = "email_address")
    private WebElement email;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "password-confirmation")
    private WebElement confirmPassword;
    @FindBy(xpath = "//*[@class='action submit primary']")
    private WebElement createAnAccountButton;
    @FindBy(xpath = "//*[@role='alert']")
    private WebElement verifying;


    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "createAnAccount": return this.createAnAccount;
            case "firstname": return this.firstname;
            case "lastname": return this.lastname;
            case "email": return this.email;
            case "password": return this.password;
            case "confirmPassword": return this.confirmPassword;
            case "createAnAccountButton": return this.createAnAccountButton;
            case "verifying": return this.verifying;
        }
        return null;
    }


}
