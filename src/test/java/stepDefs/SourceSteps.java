package stepDefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.SourcePage;
import utils.DriverFactory;

public class SourceSteps {
    SourcePage sourcePage = new SourcePage(DriverFactory.getDriver());

    @When("I add a new source")
    public void i_add_a_new_source() {
        sourcePage.addSource();
    }

    @Then("the source should be visible")
    public void the_source_should_be_visible() {
        Assert.assertTrue(sourcePage.isSourceVisible());
    }
}