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
                System.out.println("numericValue = " + numericValue);
                array.add(numericValue);
            }
            else {
                int numericValue = lp.myGetText_Integer_(lp.getWebElement(strElementsList.get(i)));
                array.add(numericValue);
            }
        }
        System.out.println(array.get(0)+" * "+array.get(1)+" = "+array.get(2));
        Assert.assertEquals(Integer.valueOf(array.get(0)* array.get(1)),Integer.valueOf(array.get(2)));
    }
}
