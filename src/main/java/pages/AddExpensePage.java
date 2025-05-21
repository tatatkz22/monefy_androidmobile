package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AddExpensePage {
    AndroidDriver driver;

    public AddExpensePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @AndroidFindBy(id = "com.monefy.app.lite:id/keyboard_button_5")
    WebElement fiveButton;

    @AndroidFindBy(id = "com.monefy.app.lite:id/keyboard_action_button")
    WebElement addButton;

    public void addExpense() {
        fiveButton.click();
        addButton.click();
    }
}