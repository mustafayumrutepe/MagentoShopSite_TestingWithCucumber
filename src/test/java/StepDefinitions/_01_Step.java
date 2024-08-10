package StepDefinitions;

import Pages.LocatorPage;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import java.util.List;

public class _01_Step {


    LocatorPage lp = new LocatorPage();

    @Given("Navigate to website")
    public void navigateToWebsite() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @When("Click on the Create an Account element")
    public void createAnAccount(DataTable dataTable) {
        List<String> strElementsList = dataTable.asList(String.class);
        for(String e : strElementsList){
            lp.myClick(lp.getWebElement(e));
        }
    }

    @Then("Fill out the account creation form")
    public void fillOutTheAccountCreationForm(DataTable dataTable) {
        List<List<String>> strElementsList = dataTable.asLists(String.class);
        for (int i = 0; i < strElementsList.size(); i++) {
            WebElement e=lp.getWebElement(strElementsList.get(i).get(0));
            String strData = strElementsList.get(i).get(1);

            lp.mySendKeys(e,strData);
        }
    }

    @And("Click on the Create an Account button")
    public void clickOnTheCreateAnAccountButton(DataTable dataTable) {
        List<String> strElementsList = dataTable.asList(String.class);
        for(String e : strElementsList){
            lp.myClick(lp.getWebElement(e));
        }
    }

    @And("Verify account creation")
    public void verifyAccountCreation(DataTable dataTable) {
        List<String> strElementsList = dataTable.asList(String.class);
        for(String e : strElementsList){
            lp.verifyContainsText(lp.getWebElement(e),"already");
        }
    }

    @When("Click on the LocatorPage in element")
    public void clickOnTheLocatorPageInElement(DataTable dataTable) {
        List<String> stringList=dataTable.asList(String.class);
        for (String e: stringList){
            lp.myClick(lp.getWebElement(e));
        }
    }

    @And("The transaction was completed successfully.")
    public void theTransactionWasCompletedSuccessfully(DataTable dataTable) {
        List<List<String>> stringList=dataTable.asLists(String.class);
        for (int i = 0; i < stringList.size(); i++) {
            WebElement e=lp.getWebElement(stringList.get(i).get(0));
            String strData = stringList.get(i).get(1);

            lp.verifyContainsText(e,strData);
        }
    }


}
