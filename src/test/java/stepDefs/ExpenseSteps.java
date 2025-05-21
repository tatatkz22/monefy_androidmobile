package stepDefs;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AddExpensePage;
import pages.BalancePage;
import utils.DriverFactory;

public class ExpenseSteps {
    AddExpensePage addExpensePage = new AddExpensePage(DriverFactory.getDriver());
    BalancePage balancePage = new BalancePage(DriverFactory.getDriver());

    @Given("the app is launched")
    public void the_app_is_launched() {}

    @When("I add an expense")
    public void i_add_an_expense() {
        addExpensePage.addExpense();
    }

    @Then("the balance should reflect the expense")
    public void the_balance_should_reflect_the_expense() {
        String balance = balancePage.getBalance();
        Assert.assertTrue(balance.contains("5"));
    }
}