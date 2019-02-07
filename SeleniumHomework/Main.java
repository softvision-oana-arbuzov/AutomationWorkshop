package selenium.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Main {
    public static WebDriver setUpFirefox() {
        //Home path
        System.setProperty("webdriver.gecko.driver", "D:\\Personal Stuff\\SoftwareTesting\\Automation\\SeleniumJars\\geckodriver.exe");

        //Work path
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\oana.arbuzov\\Documents\\IdeaProjects\\SeleniumHomework\\Webdrivers\\geckodriver.exe");

        WebDriver page = new FirefoxDriver();
        page.get("http://automationpractice.com/index.php");

        return page;
    }

    public static void tearDownFirefox(WebDriver page) {
        page.quit();
    }

    public static WebDriver setUpChrome() {
        //Home path
        //System.setProperty("webdriver.chrome.driver", "D:\\Personal Stuff\\SoftwareTesting\\Automation\\SeleniumJars\\chromedriver.exe");

        //Work path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\oana.arbuzov\\Documents\\IdeaProjects\\SeleniumHomework\\Webdrivers\\chromedriver.exe");

        WebDriver page = new ChromeDriver();
        page.get("http://automationpractice.com/index.php");

        return page;
    }

    public static void tearDownChrome(WebDriver page) {
        page.quit();
    }

    public static WebDriver setUpInternetExplorer() {
        //Home path
        System.setProperty("webdriver.ie.driver", "D:\\Personal Stuff\\SoftwareTesting\\Automation\\SeleniumJars\\IEDriverServer.exe");

        //Work path
        System.setProperty("webdriver.ie.driver", "C:\\Users\\oana.arbuzov\\Documents\\IdeaProjects\\SeleniumHomework\\Webdrivers\\IEDriverServer.exe");

        WebDriver page = new InternetExplorerDriver();
        page.get("http://automationpractice.com/index.php");

        return page;
    }

    public static void tearDownInternetExplorer(WebDriver page) {
        page.quit();
    }

    public static void verifyStringPresent(WebDriver page, String textPresent) {

        if (page.getPageSource().contains(textPresent)) {
            System.out.println(textPresent + " button is present");
        } else {
            System.out.println(textPresent + " button is not found!");
        }
    }

    public static void clickSignIn(WebDriver page) {
        verifyStringPresent(page, "Sign in");
        page.findElements(By.className("login"));
        page.findElement(By.className("login")).click();

    }

    public static void loginEmptyCredentials(WebDriver page) {
        CharSequence[] cs = new String[1];
        cs[0] = "";
        page.findElement(By.id("email")).sendKeys(cs);

        cs[0] = "";
        page.findElement(By.id("passwd")).sendKeys(cs);

        page.findElement(By.id("SubmitLogin")).click();

        if (page.getPageSource().contains("An email address required.")) {
            System.out.println("PASS - error appeared");
        } else {
            System.out.println("FAIL - error did not appear");
        }
    }

    public static void loginEmptyEmail(WebDriver page) {
        CharSequence[] cs = new String[1];
        cs[0] = "";
        page.findElement(By.id("email")).sendKeys(cs);

        cs[0] = "testtest";
        page.findElement(By.id("passwd")).sendKeys(cs);

        page.findElement(By.id("SubmitLogin")).click();

        if (page.getPageSource().contains("An email address required.")) {
            System.out.println("PASS - error appeared");
        } else {
            System.out.println("FAIL - error did not appear");
        }

        //Clear Email
        loginClearPassword(page);
    }

    public static void loginEmptyPassword(WebDriver page) {
        CharSequence[] cs = new String[1];
        cs[0] = "soultear_l2@yahoo.com";
        page.findElement(By.id("email")).sendKeys(cs);

        cs[0] = "";
        page.findElement(By.id("passwd")).sendKeys(cs);

        page.findElement(By.id("SubmitLogin")).click();

        if (page.getPageSource().contains("Password is required.")) {
            System.out.println("PASS - error appeared");
        } else {
            System.out.println("FAIL - error did not appear");
        }

        //Clear Password
        loginClearEmail(page);
    }

    public static void loginIncorrectCredentials(WebDriver page) {
        CharSequence[] cs = new String[1];
        cs[0] = "daniela";
        page.findElement(By.id("email")).sendKeys(cs);

        cs[0] = "testtest";
        page.findElement(By.id("passwd")).sendKeys(cs);

        page.findElement(By.id("SubmitLogin")).click();

        if (page.getPageSource().contains("Invalid email address.")) {
            System.out.println("PASS - error appeared");
        } else {
            System.out.println("FAIL - error did not appear");
        }

        //Clear Email & Password
        loginClearExistingData(page);
    }

    public static void loginCorrectCredentials(WebDriver page) {
        CharSequence[] cs = new String[1];
        cs[0] = "soultear_l2@yahoo.com";
        page.findElement(By.id("email")).sendKeys(cs);

        cs[0] = "Softvision10";
        page.findElement(By.id("passwd")).sendKeys(cs);

        page.findElement(By.id("SubmitLogin")).click();

        if (page.getPageSource().contains("Welcome to your account. Here you can manage all of your personal information and orders.")) {
            System.out.println("PASS - You are successfully sign into your account.");
        } else {
            System.out.println("FAIL - You are not signed into your account.");
        }
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

        loginEmptyCredentials(page);
        loginEmptyEmail(page);
        loginEmptyPassword(page);
        loginIncorrectCredentials(page);
        loginCorrectCredentials(page);

        tearDownChrome(page);
        //tearDownFirefox(page);
        //tearDownInternetExplorer(page);
    }
}
