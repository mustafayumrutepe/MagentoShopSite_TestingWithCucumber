package StepDefinitions;

import Pages.LocatorPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class _03_Step {
    LocatorPage lp = new LocatorPage();

    @When("Go to the cart")
    public void goToTheCart(DataTable dataTable) {
        List<String> strElementsList = dataTable.asList(String.class);
        for (int i = 0; i < dataTable.height(); i++) {
            lp.myClick(lp.getWebElement(strElementsList.get(i)));
        }
    }

    @Then("Collect data and verify payment amount")
    public void collectDataAndVerifyPaymentAmount(DataTable dataTable) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        List<String> strElementsList = dataTable.asList(String.class);
        for (int i = 0; i < strElementsList.size(); i++) {
            if (strElementsList.get(i).equals("quantity")){
                int numericValue=Integer.parseInt(lp.getWebElement(strElementsList.get(i)).getDomProperty("value"));
                array.add(numericValue);
            }
            else {
                String text = lp.myGetText(lp.getWebElement(strElementsList.get(i)));
                String strNumber=text.replaceAll("[^0-9]","");
                int numericValue = Integer.parseInt(strNumber);
                array.add(numericValue);
            }
        }
        Assert.assertEquals(Integer.valueOf(array.get(0)* array.get(1)),Integer.valueOf(array.get(2)));
    }
}
