package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static helpers.WebElementHelper.areVisible;

public class ReportBugPage extends BasePage {

    public final static String URL = "https://webcompat-ui-redesign.herokuapp.com/";

    @FindBy(id = "url")
    private WebElement siteURL;

    @FindBy(className = "next-step step-1 issue-btn")
    private WebElement confirmURLButton;

    @FindBy(className = "next-step step-3 issue-btn")
    private WebElement confirmSomethinElseButton;

    @Override
    protected boolean isCurrent() {
        return areVisible(siteURL);
    }

    @Override
    protected boolean isValid() {
        return areVisible(siteURL);
    }

    public ReportBugPage(WebDriver driver) {
        super(driver);
    }

//    public void typeSiteURL(String siteURL) {
//        siteURL.sendKeys(siteURL);
//    }

    public void clickConfirmURLButton() {
        confirmURLButton.click();
    }


    public void open() {
        openUrl(URL);
    }
}
