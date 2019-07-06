package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestContext {
    private WebDriver driver;

    public WebDriver getDriver()
    {
        return driver;
    }

    public WebDriver openBrowser()
    {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/lib/chromedriver.exe");
        this.driver = new ChromeDriver();
        return driver;
        // driver.get("http://www.bing.com");
    }

    public void setupDriver()
    {

    }
}
