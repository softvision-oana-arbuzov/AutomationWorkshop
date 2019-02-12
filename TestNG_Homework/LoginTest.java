package homeworktestng;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {
    public String baseURL = "http://automationpractice.com/index.php";
    public String driverPath = "./src/main/resources/drivers/geckodriver.exe";
    public WebDriver driver;

    @BeforeClass
    public void launchBrowserFirefox() {
        System.setProperty("webdriver.gecko.driver", driverPath);
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @Test(priority = 0)
    public void verifyHomepageTitle() {
        String expectedResult = "My Store";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test (priority = 1)
    public void signIn() {
        driver.findElement(By.cssSelector("#header div div div nav div a")).click();
        String expectedTitle = "Login - My Store";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(priority = 2)
    public void loginEmptyCredentials() {
        String email = "";
        String password = "";
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.id("SubmitLogin")).click();

        //An email address required.
        WebElement errorMessage = driver.findElement(By.cssSelector("#center_column div ol li"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }

    @Test(priority = 3)
    public void loginEmptyEmail() {
        String email = "";
        String password = "testtest";
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.id("SubmitLogin")).click();

        //An email address required.
        WebElement errorMessage = driver.findElement(By.cssSelector("#center_column div ol li"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }

    @Test(priority = 4)
    public void clearPasswordField() {
        if(!driver.findElement(By.id("passwd")).equals("")) {
            driver.findElement(By.id("passwd")).clear();
        }
    }

    @Test(priority = 5)
    public void loginEmptyPassword() {
        String email = "soultear_l2@yahoo.com";
        String password = "";
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.id("SubmitLogin")).click();

        //Password is required.
        WebElement errorMessage = driver.findElement(By.cssSelector("#center_column div ol li"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }

    @Test(priority = 6)
    public void clearEmailField() {
        if(!driver.findElement(By.id("email")).equals("")) {
            driver.findElement(By.id("email")).clear();
        }
    }

    @Test(priority = 7)
    public void loginInvalidCredentials() {
        String email = "daniela";
        String password = "testtest";
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.id("SubmitLogin")).click();

        //Invalid email address.
        WebElement errorMessage = driver.findElement(By.cssSelector("#center_column div ol li"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }

    @Test(priority = 8)
    public void clearCredentialsFields() {
        if(!driver.findElement(By.id("email")).equals("") && !driver.findElement(By.id("passwd")).equals("") ) {
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("passwd")).clear();
        }
    }

    @Test(priority = 9)
    public void loginInvalidPassword() {
        String email = "soultear_l2@yahoo.com";
        String password = "testtest";
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.id("SubmitLogin")).click();

        //Authentication failed.
        WebElement errorMessage = driver.findElement(By.cssSelector("#center_column div ol li"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }

    @Test(priority = 10)
    public void repeatClearCredentialsFields() {
        if(!driver.findElement(By.id("email")).equals("") && !driver.findElement(By.id("passwd")).equals("") ) {
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("passwd")).clear();
        }
    }

    @Test(priority = 11)
    public void loginValidCredentials() {
        String email = "soultear_l2@yahoo.com";
        String password = "testtest";
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.id("SubmitLogin")).click();

        //MY ACCOUNT
        WebElement pageTitle = driver.findElement(By.cssSelector("#center_column h1"));
        Assert.assertTrue(pageTitle.isDisplayed());
    }

    @Test(priority = 12)
    public void signOut() {
        //Sign Out
        driver.findElement(By.cssSelector("#header div div div nav div a")).click();
        String expectedTitle = "Login - My Store";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(priority = 13)
    public void returnToHomePage() {
        //My Store logo
        driver.findElement(By.cssSelector("#header_logo a img")).click();
        String expectedTitle = "My Store";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterClass
    public void tearDownFirefox() {
        driver.quit();
    }

}
