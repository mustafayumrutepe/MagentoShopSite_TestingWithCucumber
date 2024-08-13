package StepDefinitions;

import Pages.LocatorPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class _02_Steps {
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
    public void howManyItemInTheCart(DataTable dataTable){
    List<WebElement> webElementList=lp.getCartItem(dataTable);
    int items=webElementList.size();
        arrayList.add(items);
        System.out.println("There are "+items+" items in the cart");
    }

    @Then("Delete from All item in the cart")
    public void deleteFromAllItemInTheCart(DataTable table) {
        List<String> list=table.asList(String.class);
        for (String e: list){
            WebElement element= lp.getWebElement(e);
            for (int i = 0; i <arrayList.get(0) ; i++) {
                    lp.myClick(element);
            }
        }
    }
}
