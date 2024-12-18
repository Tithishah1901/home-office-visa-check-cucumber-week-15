package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class FamilyImmigrationStatusPage extends Utility {

    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    public void clickOnImmigrationStatus(String status) {
        String path = "//label[contains(text(), '" + status + "')]/preceding-sibling::input[@type='radio']";
        By element = By.xpath(path);
        clickOnElement(element);
        log.info("Click on '" + status + "' button");
    }
}
