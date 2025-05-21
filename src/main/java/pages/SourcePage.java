package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SourcePage {
    AndroidDriver driver;

    public SourcePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @AndroidFindBy(id = "com.monefy.app.lite:id/button_source")
    WebElement sourceButton;

    public void addSource() {
        sourceButton.click();

    }
    public boolean isSourceVisible() {
        return sourceButton.isDisplayed();
    }
}