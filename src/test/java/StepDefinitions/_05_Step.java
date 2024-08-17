package StepDefinitions;

import Pages.LocatorPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class _05_Step {
    LocatorPage lp=new LocatorPage();
    ArrayList<Integer> arrayListINTEGER=new ArrayList<>();



    @Then("Move to elements")
    public void moveToElements(DataTable dataTable) {
        List<String> list=dataTable.asList(String.class);

        for (int i = 0; i < list.size() ; i++) {
            lp.myHoverOver(lp.getWebElement(list.get(i)));
        }


    }




    @And("How many item in the cart TEKRAR")
    public void howManyItemInTheCartTEKRAR(DataTable dataTable) {
        List<WebElement> webElementList=lp.getJaketsList(dataTable);
        arrayListINTEGER.add(webElementList.size());
        System.out.println("webElementList = " + webElementList);
        System.out.println("webElementList.size() = " + webElementList.size());


    }


}
