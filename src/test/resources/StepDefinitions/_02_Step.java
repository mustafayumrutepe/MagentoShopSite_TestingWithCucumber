package StepDefinitions;

import Pages.LocatorPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.List;

public class _02_Step {
    LocatorPage lp =new LocatorPage();

    @And("Select my Choice")
    public void selectMyChoice(DataTable dataTable) {
        List<List<String>> lists=dataTable.asLists(String.class)
    }
}
