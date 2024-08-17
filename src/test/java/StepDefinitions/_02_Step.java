package StepDefinitions;

import Pages.LocatorPage;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class _02_Step {
    LocatorPage lp=new LocatorPage();
    ArrayList<Integer> arrayList=new ArrayList<>();

    @And("Select my Choice")
    public void selectMyChoice(DataTable dataTable) {
        List<List<String>> lists=dataTable.asLists(String.class);
        for (int i = 0; i <lists.size() ; i++) {
            WebElement element=lp.getWebElement(lists.get(i).get(0));
            String choice=lists.get(i).get(1);
            lp.mySelect(element,choice);
        }
    }

    @Then("How many item in the cart")
    public void howManyItemInTheCart(DataTable dataTable) {
        List<WebElement> webElementList = lp.getCartItem(dataTable);
        if (isEmpty == false) {
            int items = webElementList.size();
            arrayList.add(items);
        }
    }

    @Then("Delete from All item in the cart")
    public void deleteFromAllItemInTheCart(DataTable table) {
        List<String> list=table.asList(String.class);
        if (isEmpty==false) {
            for (String e : list) {
                WebElement element = lp.getWebElement(e);
                for (int i = 0; i < arrayList.get(0); i++) {
                    lp.myClick(element);
                }
            }
        }
    }

    public static boolean isEmpty=false;

    @When("There is no any products in the cart")
    public void thereIsNoAnyProductsInTheCart(DataTable dataTable) {
        List<String> lists=dataTable.asList(String.class);
        for (String e : lists){
            isEmpty=false;
            if (lp.getWebElement(e).getText().contains("no items")) {
                isEmpty=true;
            }
        }
    }

    @Then("Click on these elements for deleting scenario")
    public void clickOnTheseElementsForDeletingScenario(DataTable dataTable) {
        if (_02_Step.isEmpty==false) {
            List<String> stringList = dataTable.asList(String.class);
            for (String e : stringList) {
                lp.myClick(lp.getWebElement(e));
            }
        }
    }
}
