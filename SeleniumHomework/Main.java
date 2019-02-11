package selenium.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Main {
    public static WebDriver setUpFirefox() {
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/drivers/geckodriver.exe");

        WebDriver page = new FirefoxDriver();
        page.get("http://automationpractice.com/index.php");

        return page;
    }

    public static void tearDownFirefox(WebDriver page) {
        page.quit();
    }

    public static WebDriver setUpChrome() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");

        WebDriver page = new ChromeDriver();
        page.get("http://automationpractice.com/index.php");

        return page;
    }

    public static void tearDownChrome(WebDriver page) {
        page.quit();
    }

    public static WebDriver setUpInternetExplorer() {
        System.setProperty("webdriver.ie.driver", "./src/main/resources/drivers/IEDriverServer.exe");

        WebDriver page = new InternetExplorerDriver();
        page.get("http://automationpractice.com/index.php");

        return page;
    }

    public static void tearDownInternetExplorer(WebDriver page) {
        page.quit();
    }

    public static boolean verifyStringPresent(WebDriver page, String textPresent) {

        if (page.getPageSource().contains(textPresent)) {
            System.out.println(textPresent + " button is present");
        } else {
            System.out.println(textPresent + " button is not found!");
        }
        return true;
    }

    public static void clickSignIn(WebDriver page) {
        verifyStringPresent(page, "Sign in");
        page.findElements(By.className("login"));
        page.findElement(By.className("login")).click();

    }

    public static void loginCheckCredentials(WebDriver page, String email, String password) {
        page.findElement(By.id("email")).sendKeys(email);
        page.findElement(By.id("passwd")).sendKeys(password);
        page.findElement(By.id("SubmitLogin")).click();
    }

    public static void loginClearExistingData(WebDriver page) {
        try {
            Thread.sleep(2000);
            page.findElement(By.id("email")).clear();
            Thread.sleep(2000);
            page.findElement(By.id("passwd")).clear();
        } catch (Exception e) {
            System.out.println("Element not found");
        }
    }

    public static void loginClearEmail(WebDriver page) {
        try {
            Thread.sleep(2000);
            page.findElement(By.id("email")).clear();
        } catch (Exception e) {
            System.out.println("Element not found");
        }
    }

    public static void loginClearPassword(WebDriver page) {
        try {
            Thread.sleep(2000);
            page.findElement(By.id("passwd")).clear();
        } catch (Exception e) {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] arg) {
        WebDriver page = setUpChrome();
        //WebDriver page = setUpFirefox();
        //WebDriver page = setUpInternetExplorer();

        clickSignIn(page);

        loginCheckCredentials(page, "", "");
        if (page.getPageSource().contains("An email address required.")) {
            System.out.println("PASS - error appeared");
        } else {
            System.out.println("FAIL - error did not appear");
        }

        loginCheckCredentials(page, "", "testtest");
        if (page.getPageSource().contains("An email address required.")) {
            System.out.println("PASS - error appeared");
        } else {
            System.out.println("FAIL - error did not appear");
        }
        loginClearPassword(page);

        loginCheckCredentials(page, "soultear_l2@yahoo.com", "");
        if (page.getPageSource().contains("Password is required.")) {
            System.out.println("PASS - error appeared");
        } else {
            System.out.println("FAIL - error did not appear");
        }
        loginClearEmail(page);

        loginCheckCredentials(page, "daniela", "testtest");
        if (page.getPageSource().contains("Invalid email address.")) {
            System.out.println("PASS - error appeared");
        } else {
            System.out.println("FAIL - error did not appear");
        }
        loginClearExistingData(page);

        loginCheckCredentials(page, "soultear_l2@yahoo.com", "Softvision10");
        if (page.getPageSource().contains("Welcome to your account. Here you can manage all of your personal information and orders.")) {
            System.out.println("PASS - You are successfully sign into your account.");
        } else {
            System.out.println("FAIL - You are not signed into your account.");
        }

        tearDownChrome(page);
        //tearDownFirefox(page);
        //tearDownInternetExplorer(page);
    }
}