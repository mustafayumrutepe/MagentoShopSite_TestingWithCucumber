package StepDefinitions;

import Pages.LocatorPage;
import Pages.Parent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class _04_Step {
    LocatorPage lp = new LocatorPage();
    List<String> selectedWatches = new ArrayList<>();

    @When("Go over these elements")
    public void goOverTheseElements(DataTable dataTable) {
        List<String> strElementsList = dataTable.asList(String.class);
        for (int i = 0; i < strElementsList.size(); i++) {
            lp.myHoverOver(lp.getWebElement(strElementsList.get(i)));
        }
    }

    @And("Choose a random item")
    public void chooseARandomItem(DataTable dataTable) {
        List<WebElement> webElementList=lp.getListOfWatches(dataTable);
        int items=webElementList.size();
        int selectedItem=Parent.myRandomNumber(items);
        selectedWatches.add(webElementList.get(selectedItem).getText().substring(0,10).toString());
        lp.myClick(webElementList.get(selectedItem));


    }

    @And("Determine the quantity")
    public void determineTheQuantity(DataTable dataTable) {
        List< List<String> > strElementsList = dataTable.asLists(String.class);
        for (int i = 0; i < strElementsList.size(); i++) {
            WebElement element = lp.getWebElement(strElementsList.get(i).get(0));
            String string = strElementsList.get(i).get(1);
            lp.mySendKeys(element,string);
        }
    }

    @And("Add to cart")
    public void addToCart(DataTable dataTable) {
        List<String> strElementsList = dataTable.asList(String.class);
        for (int i = 0; i < strElementsList.size(); i++) {
            lp.myClick(lp.getWebElement(strElementsList.get(i)));
        }
    }

    @And("Choose a random item but different from the others")
    public void chooseARandomItemButDifferentFromTheOthers(DataTable dataTable) {
        List<WebElement> webElementList=lp.getListOfWatches(dataTable);
        int items=webElementList.size();

        int selectedItem=Parent.myRandomNumber(items);

            for (int i = 0; i < selectedWatches.size(); i++) {
                while (webElementList.get(selectedItem).getText().toString().substring(0,10).equals(selectedWatches.get(i))){
                    selectedItem=Parent.myRandomNumber(items);
                }
                    selectedWatches.add(webElementList.get(selectedItem).getText().toString().substring(0,10));
                    lp.myClick(webElementList.get(selectedItem));
                    break;
            }
    }

    @Then("Verify products are in the cart")
    public void verifyProductsAreInTheCart(DataTable dataTable) {
        List<WebElement> webElementList=lp.getCartItem(dataTable);

        for (int i = 0; i < webElementList.size(); i++) {
            Assert.assertEquals(webElementList.size(),selectedWatches.size(),"These two numbers are not equal");
            Assert.assertEquals(webElementList.get(i).getText().substring(0,10),selectedWatches.get(i),"These two texts are not equal");
        }
    }
}
