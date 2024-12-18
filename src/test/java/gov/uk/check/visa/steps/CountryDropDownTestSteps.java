package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.NationalityPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class CountryDropDownTestSteps {
    @Then("I can see following country into dropdown")
    public void iCanSeeFollowingCountryIntoDropdown(DataTable dataTable) {
        new NationalityPage().isCountryListAvailableInDropdown(dataTable);
    }
}
