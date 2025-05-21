package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BalancePage {
    AndroidDriver driver;

    public BalancePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @AndroidFindBy(id = "com.monefy.app.lite:id/balance_amount")
    WebElement balanceAmount;

    public String getBalance() {
        return balanceAmount.getText();
    }
}