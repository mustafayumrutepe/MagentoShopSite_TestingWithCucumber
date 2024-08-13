package Pages;

import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LocatorPage extends Parent{
    public LocatorPage() {PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(xpath = "(//*[text()='Create an Account'])[1]")                    private WebElement createAnAccount;
    @FindBy(id = "firstname")                                                  private WebElement firstname;
    @FindBy(id = "lastname")                                                   private WebElement lastname;
    @FindBy(id = "email_address")                                              private WebElement email;
    @FindBy(id = "password")                                                   private WebElement password;
    @FindBy(id = "password-confirmation")                                      private WebElement confirmPassword;
    @FindBy(xpath = "//*[@class='action submit primary']")                     private WebElement createAnAccountButton;
    @FindBy(xpath = "//*[@role='alert']")                                      private WebElement verifying;
    @FindBy(xpath = "//*[@class='authorization-link']")                        private WebElement Signin;
    @FindBy(name = "login[username]")                                          private WebElement Email;
    @FindBy(name = "login[password]")                                          private WebElement Password;
    @FindBy(xpath = "//*[@class='action login primary']")                      private WebElement SigninButton;
    @FindBy(xpath = "(//*[text()='Welcome, Jacob James!'])[1]")                private WebElement JacopJames;
    @FindBy(xpath = "(//*[@class='action switch'])[1]")                        private WebElement Action_switch;
    @FindBy(xpath = "((//*[@class='customer-menu'])[1]/ul/li)[1]")             private WebElement MyAccount;
    @FindBy(xpath = "//*[text()='Manage Addresses']")                          private WebElement ManageAddresses;
    @FindBy(xpath = "//*[@id='company']")                                      private WebElement Company;
    @FindBy(xpath = "//*[@id='telephone']")                                    private WebElement telephone;
    @FindBy(xpath = "//*[@id='street_1']")                                     private WebElement street_1;
    @FindBy(xpath = "//*[@id='city']")                                         private WebElement city;
    @FindBy(xpath = "//*[@id='country']")                                      private WebElement country_Select;
    @FindBy(xpath = "//*[@id='zip']")                                          private WebElement zip;
    @FindBy(xpath = "//*[text()='Save Address']")                              private WebElement Save_Address;
    @FindBy(xpath = "//*[@id='region_id']")                                    private WebElement region_Select;
    @FindBy(xpath = "//*[text()='Women']")                                     private WebElement Women;
    @FindBy(xpath = "(//*[text()='Hoodies & Sweatshirts'])[3]")                private WebElement HoodiesSweatshirts;
    @FindBy(xpath = "(//strong[@class='product name product-item-name'])[1]")  private WebElement CirceHoodedIceFleece;
    @FindBy(xpath = "(//*[@class='swatch-option text'])[3]")                   private WebElement SwatchOptionText;
    @FindBy(xpath = "(//*[@class='swatch-option color'])[2]")                  private WebElement SwatChoptionColor;
    @FindBy(xpath = "//*[text()='Add to Cart']")                               private WebElement AddtoCart;
    @FindBy(xpath = "//*[text()='shopping cart']")                             private WebElement ShoppingCart;
    @FindBy(css = "[class='action showcart']")                                 private WebElement goCart;
    @FindBy(css = "[class='action viewcart']")                                 private WebElement viewAndEditCart;
    @FindBy(xpath = "//*[@data-th='Price']")                                   private WebElement price;
    @FindBy(xpath = "//*[@title='Qty']")                                       private WebElement quantity;
    @FindBy(xpath = "(//*[@data-th='Subtotal'])[2]")                           private WebElement subtotal;
    @FindBy(css = "[class='action delete']")                                   private WebElement Action_Delete;
    @FindBy(css = "[class='action-primary action-accept']")                    private WebElement action_accept;
    @FindBy(xpath = "//*[@class='logo']")                                      private WebElement logo;
    @FindBy(xpath = "//*[@class='action action-delete']")                               private WebElement Remove_item;
    @FindBy(xpath = "(//*[text()='You have no items in your shopping cart.'])[2]")      private WebElement Noitems;
    @FindBy(xpath = "//*[@class='counter-number']")                                     private WebElement counter_number;
    @FindBy(css = "[class='cart item']")                                                private List<WebElement> cartItem;
    @FindBy(className = "subtitle empty")                                               private WebElement emptyCart;
    @FindBy(xpath = "//*[text()='Gear']")                                               private WebElement gear;
    @FindBy(xpath = "//*[@role='menu']//*[text()='Watches']")                           private WebElement watches;
    @FindBy(css = "[class='item product product-item']")                                private List<WebElement> listOfWatches;



    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "createAnAccount"         : return this.createAnAccount;
            case "firstname"               : return this.firstname;
            case "lastname"                : return this.lastname;
            case "email"                   : return this.email;
            case "password"                : return this.password;
            case "confirmPassword"         : return this.confirmPassword;
            case "createAnAccountButton"   : return this.createAnAccountButton;
            case "verifying"               : return this.verifying;
            case "Signin"                  : return this.Signin;
            case "Email"                   : return this.Email;
            case "Password"                : return this.Password;
            case "SigninButton"            : return this.SigninButton;
            case "JacopJames"              : return this.JacopJames;
            case "Action_switch"           : return this.Action_switch;
            case "MyAccount"               : return this.MyAccount;
            case "ManageAddresses"         : return this.ManageAddresses;
            case "Company"                 : return this.Company;
            case "telephone"               : return this.telephone;
            case "street_1"                : return this.street_1;
            case "city"                    : return this.city;
            case "zip"                     : return this.zip;
            case "Save_Address"            : return this.Save_Address;
            case "country_Select"          : return this.country_Select;
            case "region_Select"           : return this.region_Select;
            case "Women"                   : return this.Women;
            case "HoodiesSweatshirts"      : return this.HoodiesSweatshirts;
            case "CirceHoodedIceFleece"    : return this.CirceHoodedIceFleece;
            case "SwatchOptionText"        : return this.SwatchOptionText;
            case "SwatChoptionColor"       : return this.SwatChoptionColor;
            case "AddtoCart"               : return this.AddtoCart;
            case "ShoppingCart"            : return this.ShoppingCart;
            case "goCart"                  : return this.goCart;
            case "viewAndEditCart"         : return this.viewAndEditCart;
            case "price"                   : return this.price;
            case "quantity"                : return this.quantity;
            case "subtotal"                : return this.subtotal;
            case "Action_Delete"           : return this.Action_Delete;
            case "action_accept"           : return this.action_accept;
            case "logo"                    : return this.logo;
            case "Remove_item"             : return this.Remove_item;
            case "Noitems"                 : return this.Noitems;
            case "counter_number"          : return this.counter_number;
            case "gear"                    : return this.gear;
            case "watches"                 : return this.watches;
        }
        return null;
    }

    public List<WebElement> getCartItem(DataTable dtElement) {
        return cartItem;
    }

    public List<WebElement> getListOfWatches(DataTable dtElement) {return listOfWatches;}
}

