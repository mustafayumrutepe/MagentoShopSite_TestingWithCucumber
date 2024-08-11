package StepDefinitions;

import Pages.LocatorPage;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _02_Steps {
    LocatorPage lp=new LocatorPage();
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(15));

    @And("Select my Choice")
    public void selectMyChoice(DataTable dataTable) {
        List<List<String>> lists=dataTable.asLists(String.class);
        for (int i = 0; i <lists.size() ; i++) {
            WebElement element=lp.getWebElement(lists.get(i).get(0));
            String choice=lists.get(i).get(1);
            lp.mySelect(element,choice);
        }
    }
}
