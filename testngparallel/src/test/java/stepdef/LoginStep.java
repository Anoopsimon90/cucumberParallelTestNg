package stepdef;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStep {

    @Given("I login to application")
    public void i_login_to_application()
    {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/lib/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.get("http://www.bing.com");
    }

}
