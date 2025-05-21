package stepDefs;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BalancePage;
import utils.DriverFactory;

public class BalanceSteps {
    BalancePage balancePage = new BalancePage(DriverFactory.getDriver());

    @Then("the balance should be displayed")
    public void the_balance_should_be_displayed() {
        String balance = balancePage.getBalance();
        Assert.assertNotNull("Balance is not displayed", balance);
    }
}