package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class HomeStep {
    TestContext testContext;
    public HomeStep(TestContext testContext)
    {
        System.out.println("TestContext" + testContext.toString());

        this.testContext = testContext;

    }
    @Then("I close application")
    public void i_login_to_application()
    {
        WebDriver d=  testContext.getDriver();
       d.manage().window().maximize();
       d.quit();


    }
}
